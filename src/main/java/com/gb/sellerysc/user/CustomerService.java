package com.gb.sellerysc.user;

import com.gb.sellerysc.shared.exception.BadRequestException;
import com.gb.sellerysc.shared.exception.NotFoundException;
import com.gb.sellerysc.shared.utils.MainSectionUpdateRequest;
import com.gb.sellerysc.shared.utils.SectionTypeEnum;

public interface CustomerService {
    CustomerData fetchCustomerById(Long id) throws NotFoundException;

    CustomerData createCustomer(CustomerCreateRequest customerCreateRequest) throws BadRequestException;

    CustomerData updateMainSection(MainSectionUpdateRequest mainSectionUpdateRequest, SectionTypeEnum section) throws NotFoundException, BadRequestException;
}