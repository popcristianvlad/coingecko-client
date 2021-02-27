package com.popcristianvlad.coingecko.client.service;

import com.popcristianvlad.coingecko.client.config.CoinGeckoConfig;
import com.popcristianvlad.coingecko.client.representation.Coin;
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
}
