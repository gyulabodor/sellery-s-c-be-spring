package com.gb.sellerysc.user;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper MAPPER = Mappers.getMapper(CustomerMapper.class);

    CustomerData customerToCustomerData(Customer customer);

    Customer customerCreateRequestToCustomer(CustomerCreateRequest customerCreateRequest);
}
