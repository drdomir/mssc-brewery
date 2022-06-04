package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveBeer(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void editBeer(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteBeer(UUID beerId) {

    }
}
