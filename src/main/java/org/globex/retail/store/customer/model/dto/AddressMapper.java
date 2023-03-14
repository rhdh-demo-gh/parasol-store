package org.globex.retail.store.customer.model.dto;

import org.globex.retail.store.customer.model.entity.Address;

public class AddressMapper {

    public static AddressDto toDto(Address address) {
        if ( address == null ) {
            return null;
        }

        return AddressDto.builder()
                .withAddress1(address.address1)
                .withAddress2(address.address2)
                .withCity(address.city)
                .withZipCode(address.zipCode)
                .withState(address.state)
                .withCountry(address.country)
                .build();
    }
}
