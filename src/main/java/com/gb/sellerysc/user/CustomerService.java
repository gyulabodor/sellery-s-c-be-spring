package com.gb.sellerysc.user;

import com.gb.sellerysc.shared.exception.BadRequestException;
import com.gb.sellerysc.shared.exception.NotFoundException;

public interface CustomerService {
    public CustomerData fetchCustomerById(Long id) throws NotFoundException;
    public CustomerData createCustomer(CustomerCreateRequest customerCreateRequest) throws BadRequestException;
}
