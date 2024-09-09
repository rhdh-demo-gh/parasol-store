package org.parasol.retail.store.customer.model.dto;

import org.parasol.retail.store.customer.model.entity.Customer;

public class CustomerMapper {

    public static CustomerDto toDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }
        return CustomerDto.builder()
                .withUserId(customer.userId)
                .withFirstName(customer.firstName)
                .withLastName(customer.lastName)
                .withEmail(customer.email)
                .withPhone(customer.phone)
                .withAddress(AddressMapper.toDto(customer.address))
                .build();
    }

}
