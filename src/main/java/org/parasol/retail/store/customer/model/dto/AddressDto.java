package org.parasol.retail.store.customer.model.dto;

public class AddressDto {

    private String address1;

    private String address2;

    private String city;

    private String zipCode;

    private String state;

    private String country;

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private final AddressDto addressDto;

        public Builder() {
            this.addressDto = new AddressDto();
        }

        public Builder withAddress1(String address1) {
            this.addressDto.address1 = address1;
            return this;
        }

        public Builder withAddress2(String address2) {
            this.addressDto.address2 = address2;
            return this;
        }

        public Builder withCity(String city) {
            this.addressDto.city = city;
            return this;
        }

        public Builder withZipCode(String zipCode) {
            this.addressDto.zipCode = zipCode;
            return this;
        }

        public Builder withState(String state) {
            this.addressDto.state = state;
            return this;
        }

        public Builder withCountry(String country) {
            this.addressDto.country = country;
            return this;
        }

        public AddressDto build() {
            return this.addressDto;
        }
    }
}
