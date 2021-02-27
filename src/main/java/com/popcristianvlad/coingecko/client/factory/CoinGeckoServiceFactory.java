package com.popcristianvlad.coingecko.client.factory;

import com.popcristianvlad.coingecko.client.config.CoinGeckoConfig;
import com.popcristianvlad.coingecko.client.service.CoinGeckoService;
import com.popcristianvlad.coingecko.client.service.CoinGeckoServiceImpl;

/**
 * Factory class to retrieve an instance of {@link CoinGeckoService}.
 */
public class CoinGeckoServiceFactory {

    private CoinGeckoServiceFactory() {
    }

    public static synchronized CoinGeckoService createInstance() {
        return new CoinGeckoServiceImpl();
    }

    public static synchronized CoinGeckoService createInstance(CoinGeckoConfig coinGeckoConfig) {
        return new CoinGeckoServiceImpl(coinGeckoConfig);
    }
}
