package org.parasol.retail.store.inventory.model.dto;

public class InventoryDto {

    private long id;

    private String itemId;

    private String location;

    private int quantity;

    private String link;

    public long getId() {
        return id;
    }

    public String getItemId() {
        return itemId;
    }

    public String getLocation() {
        return location;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getLink() {
        return link;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final InventoryDto inventoryDto;

        public Builder() {
            this.inventoryDto = new InventoryDto();
        }
        public Builder withId(long id) {
            this.inventoryDto.id = id;
            return this;
        }

        public Builder withItemId(String itemId) {
            this.inventoryDto.itemId = itemId;
            return this;
        }

        public Builder withLocation(String location) {
            this.inventoryDto.location = location;
            return this;
        }

        public Builder withQuantity(int quantity) {
            this.inventoryDto.quantity = quantity;
            return this;
        }

        public Builder withLink(String link) {
            this.inventoryDto.link = link;
            return this;
        }

        public InventoryDto build() {
            return inventoryDto;
        }
    }
}
