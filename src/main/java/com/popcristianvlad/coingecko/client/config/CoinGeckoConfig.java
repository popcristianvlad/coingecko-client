package com.popcristianvlad.coingecko.client.config;

public class CoinGeckoConfig {

    private static final String FALLBACK_COINGECKO_BASE_API = "https://api.coingecko.com/api/v3";
    private static final String FALLBACK_COINGECKO_LIST_COINS_API = FALLBACK_COINGECKO_BASE_API + "/coins/list";

    private String listCoinsApiUrl;

    public CoinGeckoConfig() {
        listCoinsApiUrl = FALLBACK_COINGECKO_LIST_COINS_API;
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
            coinGeckoConfig.listCoinsApiUrl = this.listCoinsApiUrl;

            return coinGeckoConfig;
        }
    }
}
