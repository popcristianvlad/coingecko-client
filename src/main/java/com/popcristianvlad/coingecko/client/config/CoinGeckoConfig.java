package com.popcristianvlad.coingecko.client.config;

/**
 * Configuration class for the CoinGecko API.
 */
public class CoinGeckoConfig {

    private static final String FALLBACK_BASE_API = "https://api.coingecko.com/api/v3";

    private static final String FALLBACK_LIST_COINS_API = FALLBACK_BASE_API + "/coins/list";
    private static final String FALLBACK_GET_HISTORICAL_DATA_API = FALLBACK_BASE_API + "/coins/{coinId}/history";

    private String listCoinsApiUrl;
    private String getHistoricalDataApiUrl;

    public CoinGeckoConfig() {
        listCoinsApiUrl = FALLBACK_LIST_COINS_API;
        getHistoricalDataApiUrl = FALLBACK_GET_HISTORICAL_DATA_API;
    }

    public String getListCoinsApiUrl() {
        return listCoinsApiUrl;
    }

    public String getGetHistoricalDataApiUrl() {
        return getHistoricalDataApiUrl;
    }

    public static class Builder {

        private String listCoinsApiUrl;
        private String getHistoricalDataApiUrl;

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

        public CoinGeckoConfig build() {
            CoinGeckoConfig coinGeckoConfig = new CoinGeckoConfig();

            if (listCoinsApiUrl != null) {
                coinGeckoConfig.listCoinsApiUrl = listCoinsApiUrl;
            }

            if (getHistoricalDataApiUrl != null) {
                coinGeckoConfig.getHistoricalDataApiUrl = getHistoricalDataApiUrl;
            }

            return coinGeckoConfig;
        }
    }
}
