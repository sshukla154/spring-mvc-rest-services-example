package frontier.learning.brewery.web.model;

import java.time.OffsetDateTime;
import java.util.UUID;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {

	@Null
	private UUID id;

	@NotNull
	private String beerName;

	@NotNull
	private String beerStyle;

	@Positive
	private Long upc;

	// Preferred dateTime for public facing interfaces
	private OffsetDateTime createdDate;

	private OffsetDateTime lastUpdatedDate;
}
