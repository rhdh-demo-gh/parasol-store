package org.parasol.retail.store.inventory.model.dto;

import org.parasol.retail.store.inventory.model.entity.Inventory;

public class InventoryMapper {

    public static InventoryDto toDto(Inventory inventory) {
        if (inventory == null) {
            return null;
        }
        return InventoryDto.builder()
                .withId(inventory.id)
                .withItemId(inventory.itemId)
                .withLocation(inventory.location)
                .withLink(inventory.link)
                .withQuantity(inventory.quantity)
                .build();
    }

}
