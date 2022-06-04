package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.domain.Customer;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by dsavic on 6/4/2022
 */
@Mapper
public interface CustomerMapper extends TemplateMapper<Customer, CustomerDto> {
}
