package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Drdomir")
                .build();
    }

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void edit(UUID customerId, CustomerDto customerDto) {
        log.debug(String.format("Edit customer %s", customerId));
    }

    @Override
    public void delete(UUID customerId) {
        log.debug(String.format("Delete customer %s", customerId));
    }
}
