package com.popcristianvlad.coingecko.client.service;

import com.popcristianvlad.coingecko.client.representation.Coin;
import com.popcristianvlad.coingecko.client.representation.CoinData;
import com.popcristianvlad.coingecko.client.representation.CoinHistoricalData;

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

    /**
     * Get historical data at a given date for a coin.
     *
     * @param coinId             - the coin id, e.g. bitcoin.
     * @param atDate             - the date of data snapshot in dd-mm-yyyy e.g. 30-12-2017.
     * @param localizedLanguages - set false to exclude localized languages in response.
     * @return historical data at a given date for a coin.
     */
    CoinHistoricalData getCoinHistoricalData(String coinId, String atDate, String localizedLanguages);

    /**
     * Get current data for a coin.
     *
     * @param coinId                    - the coin id, e.g. bitcoin.
     * @param localizedLanguages        - set false to exclude localized languages in response.
     * @param includeTickersData        - boolean field to include/exclude tickers data (limited to 100 items).
     * @param includeMarketData         - boolean field to include/exclude market data.
     * @param includeCommunityData      - boolean field to include/exclude community data.
     * @param includeDeveloperData      - boolean field to include/exclude developer data.
     * @param includeSparkline7DaysData - boolean field to include/exclude sparkline 7 days data.
     * @return current data for a coin.
     */
    CoinData getCurrentCoinData(String coinId, String localizedLanguages, boolean includeTickersData, boolean includeMarketData,
                                boolean includeCommunityData, boolean includeDeveloperData, boolean includeSparkline7DaysData);
}
