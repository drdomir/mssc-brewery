package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto save(CustomerDto customerDto);

    void edit(UUID customerId, CustomerDto customerDto);

    void delete(UUID customerId);
}
