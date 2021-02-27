package com.popcristianvlad.coingecko.client.config;

/**
 * Configuration class for the CoinGecko API.
 */
public class CoinGeckoConfig {

    private static final String FALLBACK_BASE_API = "https://api.coingecko.com/api/v3";

    private static final String FALLBACK_LIST_COINS_API = FALLBACK_BASE_API + "/coins/list";

    private String listCoinsApiUrl;

    public CoinGeckoConfig() {
        listCoinsApiUrl = FALLBACK_LIST_COINS_API;
    }

    public String getListCoinsApiUrl() {
        return listCoinsApiUrl;
    }

    public static class Builder {

        private String listCoinsApiUrl;

        public Builder() {
        }

        public Builder withListCoinsApiUrl(String listCoinsApiUrl) {
            this.listCoinsApiUrl = listCoinsApiUrl;
            return this;
        }

        public CoinGeckoConfig build() {
            CoinGeckoConfig coinGeckoConfig = new CoinGeckoConfig();

            if (listCoinsApiUrl != null) {
                coinGeckoConfig.listCoinsApiUrl = listCoinsApiUrl;
            }

            return coinGeckoConfig;
        }
    }
}
