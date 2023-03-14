package org.globex.retail.store.catalog.model.dto;

import org.globex.retail.store.catalog.model.entity.Product;

public class ProductMapper {

    public static ProductDto toDto(Product product) {
        if (product == null) {
            return null;
        }
        return ProductDto.builder()
                .withItemId(product.itemId)
                .withName(product.name)
                .withDescription(product.description)
                .withCategory(product.category.category)
                .withPrice(product.price)
                .build();
    }

    public static ProductDto toDto(Product product, int quantity) {
        if (product == null) {
            return null;
        }
        return ProductDto.builder()
                .withItemId(product.itemId)
                .withName(product.name)
                .withDescription(product.description)
                .withCategory(product.category.category)
                .withPrice(product.price)
                .withQuantity(quantity)
                .build();
    }
}
