import com.popcristianvlad.coingecko.client.factory.CoinGeckoServiceFactory;
import com.popcristianvlad.coingecko.client.representation.CoinData;
import com.popcristianvlad.coingecko.client.service.CoinGeckoService;
import org.junit.jupiter.api.Test;

public class GetCurrentCoinDataTest {

    @Test
    public void testGetCoinHistoricalData() {
        CoinGeckoService coinGeckoService = CoinGeckoServiceFactory.createInstance();

        CoinData coinHistoricalData = coinGeckoService.getCurrentCoinData("bitcoin", "false", false, false, false, false, false);

        System.out.println(coinHistoricalData);
    }
}
