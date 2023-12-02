package com.gb.sellerysc.user;

import com.gb.sellerysc.shared.exception.BadRequestException;
import com.gb.sellerysc.shared.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("{id}")
    public ResponseEntity<CustomerData> fetchCustomer(@PathVariable Long id) throws NotFoundException {
        return ResponseEntity.ok(customerService.fetchCustomerById(id));
    }

    @PostMapping
    public ResponseEntity<CustomerData> registerCustomer(@RequestBody CustomerCreateRequest customerCreateRequest) throws NotFoundException, BadRequestException {
        return ResponseEntity.ok(customerService.createCustomer(customerCreateRequest));
    }

}
