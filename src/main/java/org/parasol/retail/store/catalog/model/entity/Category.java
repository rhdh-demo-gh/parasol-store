package org.parasol.retail.store.catalog.model.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity(name = "Category")
@Table(name = "category")
@Cacheable
public class Category extends PanacheEntityBase {

    @Id
    @Column(name = "category_id")
    public long id;

    @Column(name = "category")
    public String category;

}