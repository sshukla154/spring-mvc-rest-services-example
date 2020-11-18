package frontier.learning.brewery.example.services.v2;

import java.util.UUID;

import frontier.learning.brewery.example.web.model.v2.BeerDTOV2;

public interface BeerServiceV2 {

	BeerDTOV2 getBeerById(UUID beerId);

	BeerDTOV2 saveNewBeer(BeerDTOV2 beerDTOV2);

	void updateBeer(UUID beerId, BeerDTOV2 beerDTOV2);

	void deleteById(UUID beerId);

}
