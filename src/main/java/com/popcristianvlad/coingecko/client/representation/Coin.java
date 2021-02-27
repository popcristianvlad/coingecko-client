package com.popcristianvlad.coingecko.client.representation;

import java.util.Map;
import java.util.Objects;

public class Coin {

    /**
     * E.g. bitcoin
     */
    private String id;

    /**
     * E.g. btc
     */
    private String symbol;

    /**
     * E.g. Bitcoin
     */
    private String name;

    /**
     * E.g. ethereum -> 0x017b584acfd16d767541ae9e80cdc702f4527b0b
     */
    private Map<String, String> platforms;

    public Coin() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(Map<String, String> platforms) {
        this.platforms = platforms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return Objects.equals(id, coin.id) && Objects.equals(symbol, coin.symbol) && Objects.equals(name, coin.name) && Objects.equals(platforms, coin.platforms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, symbol, name, platforms);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", platforms=" + platforms +
                '}';
    }
}
