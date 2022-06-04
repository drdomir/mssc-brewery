package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Brka")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto.builder().id(beerDto.getId())
                .beerName(beerDto.getBeerName())
                .beerStyle((beerDto.getBeerStyle()))
                .build();
    }

    @Override
    public void editBeer(UUID beerId, BeerDto beerDto) {
        //todo impl - would add a real impl
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting a beer ...");
    }

}
