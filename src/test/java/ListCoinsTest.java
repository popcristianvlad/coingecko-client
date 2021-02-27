import com.popcristianvlad.coingecko.client.config.CoinGeckoConfig;
import com.popcristianvlad.coingecko.client.factory.CoinGeckoServiceFactory;
import com.popcristianvlad.coingecko.client.representation.Coin;
import com.popcristianvlad.coingecko.client.service.CoinGeckoService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ListCoinsTest {

    @Test
    public void testListCoinsWithDefaultCofing() {
        CoinGeckoService coinGeckoService = CoinGeckoServiceFactory.createInstance();

        List<Coin> coins = coinGeckoService.listCoins(false);

        System.out.println(coins.size());
    }

    @Test
    public void testListCoinsWithCustomCofing() {
        CoinGeckoService coinGeckoService = CoinGeckoServiceFactory.createInstance(new CoinGeckoConfig.Builder()
                .withListCoinsApiUrl("https://api.coingecko.com/api/v3/coins/list")
                .build());

        List<Coin> coins = coinGeckoService.listCoins(true);

        System.out.println(coins.size());
    }
}
