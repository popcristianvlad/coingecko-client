package com.popcristianvlad.coingecko.client.config;

/**
 * Configuration class for the CoinGecko API.
 */
public class CoinGeckoConfig {

    private static final String FALLBACK_BASE_API = "https://api.coingecko.com/api/v3";

    private static final String FALLBACK_LIST_COINS_API = FALLBACK_BASE_API + "/coins/list";
    private static final String FALLBACK_GET_HISTORICAL_DATA_API = FALLBACK_BASE_API + "/coins/{coinId}/history";
    private static final String FALLBACK_GET_CURRENT_COIN_DATA_API = FALLBACK_BASE_API + "/coins/{coinId}";

    private String listCoinsApiUrl;
    private String getHistoricalDataApiUrl;
    private String getCurrentCoinDataApiUrl;

    public CoinGeckoConfig() {
        listCoinsApiUrl = FALLBACK_LIST_COINS_API;
        getHistoricalDataApiUrl = FALLBACK_GET_HISTORICAL_DATA_API;
        getCurrentCoinDataApiUrl = FALLBACK_GET_CURRENT_COIN_DATA_API;
    }

    public String getListCoinsApiUrl() {
        return listCoinsApiUrl;
    }

    public String getGetHistoricalDataApiUrl() {
        return getHistoricalDataApiUrl;
    }

    public String getGetCurrentCoinDataApiUrl() {
        return getCurrentCoinDataApiUrl;
    }

    public static class Builder {

        private String listCoinsApiUrl;
        private String getHistoricalDataApiUrl;
        private String getCurrentCoinDataApiUrl;

        public Builder() {
        }

        public Builder withListCoinsApiUrl(String listCoinsApiUrl) {
            this.listCoinsApiUrl = listCoinsApiUrl;
            return this;
        }

        public Builder withGetHistoricalDataApiUrl(String getHistoricalDataApiUrl) {
            this.getHistoricalDataApiUrl = getHistoricalDataApiUrl;
            return this;
        }

        public Builder withGetCurrentCoinDataApiUrl(String getCurrentCoinDataApiUrl) {
            this.getCurrentCoinDataApiUrl = getCurrentCoinDataApiUrl;
            return this;
        }

        public CoinGeckoConfig build() {
            CoinGeckoConfig coinGeckoConfig = new CoinGeckoConfig();

            if (listCoinsApiUrl != null) {
                coinGeckoConfig.listCoinsApiUrl = listCoinsApiUrl;
            }

            if (getHistoricalDataApiUrl != null) {
                coinGeckoConfig.getHistoricalDataApiUrl = getHistoricalDataApiUrl;
            }

            if (getCurrentCoinDataApiUrl != null) {
                coinGeckoConfig.getCurrentCoinDataApiUrl = getCurrentCoinDataApiUrl;
            }

            return coinGeckoConfig;
        }
    }
}
