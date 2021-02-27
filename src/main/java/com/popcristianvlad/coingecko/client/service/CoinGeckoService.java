package com.popcristianvlad.coingecko.client.service;

import com.popcristianvlad.coingecko.client.representation.Coin;

import java.util.List;

/**
 * Interface to interact with CoinGecko's exposed APIs.
 */
public interface CoinGeckoService {

    /**
     * List all supported coins.
     *
     * @param includePlatformContractAddresses - flag to include platform contract addresses (eg. 0x… for Ethereum based tokens).
     * @return list of all supported coins.
     */
    List<Coin> listCoins(boolean includePlatformContractAddresses);
}
