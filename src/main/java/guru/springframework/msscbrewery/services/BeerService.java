package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    void editBeer(UUID beerId, BeerDto beerDto);

    void deleteBeer(UUID beerId);
}
