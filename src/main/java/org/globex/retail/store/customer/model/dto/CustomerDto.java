package org.globex.retail.store.customer.model.dto;

public class CustomerDto {

    private String userId;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private AddressDto address;

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public AddressDto getAddress() {
        return address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private final CustomerDto customerDto;

        public Builder() {
            this.customerDto = new CustomerDto();
        }

        public Builder withUserId(String userId) {
            this.customerDto.userId = userId;
            return this;
        }

        public Builder withFirstName(String firstName) {
            this.customerDto.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.customerDto.lastName = lastName;
            return this;
        }

        public Builder withEmail(String email) {
            this.customerDto.email = email;
            return this;
        }

        public Builder withPhone(String phone) {
            this.customerDto.phone = phone;
            return this;
        }

        public Builder withAddress(AddressDto address) {
            this.customerDto.address = address;
            return this;
        }

        public CustomerDto build() {
            return this.customerDto;
        }
    }
}
