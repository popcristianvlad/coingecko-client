import com.popcristianvlad.coingecko.client.factory.CoinGeckoServiceFactory;
import com.popcristianvlad.coingecko.client.representation.CoinHistoricalData;
import com.popcristianvlad.coingecko.client.service.CoinGeckoService;
import org.junit.jupiter.api.Test;

public class GetHistoricalDataTest {

    @Test
    public void testGetCoinHistoricalData() {
        CoinGeckoService coinGeckoService = CoinGeckoServiceFactory.createInstance();

        CoinHistoricalData coinHistoricalData = coinGeckoService.getCoinHistoricalData("bitcoin", "30-12-2017", "false");

        System.out.println(coinHistoricalData);
    }
}
