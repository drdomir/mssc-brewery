package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by dsavic on 6/4/2022
 */
@Mapper
public interface BeerMapper extends TemplateMapper<Beer, BeerDto> {
}
