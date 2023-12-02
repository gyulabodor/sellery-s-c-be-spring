package com.gb.sellerysc.user;

import com.gb.sellerysc.shared.exception.BadRequestException;
import com.gb.sellerysc.shared.exception.NotFoundException;
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
    public CustomerData fetchCustomerById(Long id) throws NotFoundException {
        Optional<Customer> customerFromDb = customerRepository.findById(id);

        if (!customerFromDb.isPresent()){
            throw new NotFoundException("CUSTOMER_NOT_FOUND");
        }

        return customerMapper.customerToCustomerData(customerFromDb.get());
    }

    @Override
    public CustomerData createCustomer(CustomerCreateRequest customerCreateRequest) throws BadRequestException {
        Optional<Customer> customerFromDb = Optional.ofNullable(customerRepository.findByEmail(customerCreateRequest.getEmail()));

        if (customerFromDb.isPresent()){
            throw new BadRequestException("EMAIL_ALREADY_IN_USE");
        }

        customerFromDb = Optional.ofNullable(customerRepository.findByUsername(customerCreateRequest.getUsername()));
        if (customerFromDb.isPresent()){
            throw new BadRequestException("USERNAME_ALREADY_IN_USE");
        }

        return customerMapper.customerToCustomerData(
                customerRepository.save(
                        customerMapper.customerCreateRequestToCustomer(customerCreateRequest)
                )
        );
    }
}
