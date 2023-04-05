package org.globex.retail.store.catalog.model.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Category")
@Table(name = "category")
@Cacheable

@NamedQueries({
    @NamedQuery(name = "Catalog.getCategoryList", query = "from Category")
})

public class Category extends PanacheEntityBase {

    @Id
    @Column(name = "category_id")
    public long id;

    @Column(name = "category")
    public String category;
    
    public static List<Category> getCategoryList() {
        return find("#Catalog.getCategoryList").list();
    }
}
