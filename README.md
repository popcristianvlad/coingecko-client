# CoinGecko Client

Java client for the CoinGecko API.

![Alt text](coingecko.png "https://coingecko.com/")

## Description

This is a java client which intends to offer interaction with CoinGecko's public
API: https://www.coingecko.com/en/api#explore-api

## Usage

Retrieving an instance of the service:

```
CoinGeckoService coinGeckoService = CoinGeckoServiceFactory.createInstance();
```

```
CoinGeckoService coinGeckoService = CoinGeckoServiceFactory.createInstance(new CoinGeckoConfig.Builder()
                .withListCoinsApiUrl("https://api.coingecko.com/api/v3/coins/list")
                .build());
```

Using the retrieved service to get a list of all available coins:

```
List<Coin> coins = coinGeckoService.listCoins(false);
```

```
List<Coin> coins = coinGeckoService.listCoins(true);
```