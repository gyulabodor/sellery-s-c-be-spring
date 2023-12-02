package com.gb.sellerysc.user;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository,
                               CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public CustomerData fetchClientInfo(Long id) {
        Optional<Customer> customerFromDb = customerRepository.findById(id);

        if (!customerFromDb.isPresent()){ return null; }

        return customerMapper.customerToCustomerData(customerFromDb.get());
    }
}
