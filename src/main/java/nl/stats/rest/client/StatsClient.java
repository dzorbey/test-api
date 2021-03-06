package nl.stats.rest.client;

import nl.stats.camel.model.AvgPriceRequest;
import nl.stats.camel.model.PriceRequest;
import nl.stats.camel.utilities.Utility;
import nl.stats.rest.service.StatsService;

public class StatsClient {
	public static StatsService service = new StatsService();

	public Object getAverageClosePriceOverPeriod(String requestBody) {

		try {
			AvgPriceRequest request = Utility.objectMapper.readValue(requestBody.toString(), AvgPriceRequest.class);
			return service.getAverageClosePriceOverPeriod(request);
		} catch (Exception e1) {
			return Utility.error(e1.getMessage());
		}
	}

	public Object getClosePriceAt(String requestBody) {
		
		try {
			PriceRequest request = Utility.objectMapper.readValue(requestBody.toString(), PriceRequest.class);
			return service.getClosePriceAt(request);
		} catch (Exception e1) {
			return Utility.error(e1.getMessage());
		}
	}

}