package com.popcristianvlad.coingecko.client.service;

import com.popcristianvlad.coingecko.client.config.CoinGeckoConfig;
import com.popcristianvlad.coingecko.client.representation.Coin;
import com.popcristianvlad.coingecko.client.representation.CoinData;
import com.popcristianvlad.coingecko.client.representation.CoinHistoricalData;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

public class CoinGeckoServiceImpl implements CoinGeckoService {

    private CoinGeckoConfig coinGeckoConfig;
    private Client client;

    public CoinGeckoServiceImpl() {
        coinGeckoConfig = new CoinGeckoConfig();
        client = ClientBuilder.newClient();
    }

    public CoinGeckoServiceImpl(CoinGeckoConfig coinGeckoConfig) {
        this.coinGeckoConfig = coinGeckoConfig;
        client = ClientBuilder.newClient();
    }

    @Override
    public List<Coin> listCoins(boolean includePlatformContractAddresses) {
        return client
                .target(coinGeckoConfig.getListCoinsApiUrl())
                .queryParam("include_platform", includePlatformContractAddresses)
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<>() {
                    // Nothing to do
                });
    }

    @Override
    public CoinHistoricalData getCoinHistoricalData(String coinId, String atDate, String localizedLanguages) {
        return client
                .target(coinGeckoConfig.getGetHistoricalDataApiUrl().replace("{coinId}", coinId))
                .queryParam("date", atDate)
                .queryParam("localization", localizedLanguages)
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<>() {
                    // Nothing to do
                });
    }

    @Override
    public CoinData getCurrentCoinData(String coinId, String localizedLanguages, boolean includeTickersData, boolean includeMarketData,
                                       boolean includeCommunityData, boolean includeDeveloperData, boolean includeSparkline7DaysData) {
        return client
                .target(coinGeckoConfig.getGetCurrentCoinDataApiUrl().replace("{coinId}", coinId))
                .queryParam("localization", "false")
                .queryParam("tickers", false)
                .queryParam("market_data", false)
                .queryParam("community_data", false)
                .queryParam("developer_data", false)
                .queryParam("sparkline", false)
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<>() {
                    // Nothing to do
                });
    }
}
