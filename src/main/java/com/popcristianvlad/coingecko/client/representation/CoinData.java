package com.popcristianvlad.coingecko.client.representation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoinData {

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

    @JsonProperty("asset_platform_id")
    private String assetPlatformId;

    /**
     * E.g. ethereum -> 0x017b584acfd16d767541ae9e80cdc702f4527b0b
     */
    private Map<String, String> platforms;

    @JsonProperty("block_time_in_minutes")
    private Integer blockTimeInMinutes;

    @JsonProperty("hashing_algorithm")
    private String hashingAlgorithm;

    private List<String> categories;

    @JsonProperty("public_notice")
    private String publicNotice;

    private Map<String, String> description;

    private Image image;

    @JsonProperty("country_origin")
    private String countryOrigin;

    @JsonProperty("genesis_date")
    private String genesisDate;

    @JsonProperty("contract_address")
    private String contractAddress;

    @JsonProperty("sentiment_votes_up_percentage")
    private Double sentimentVotesUpPpercentage;

    @JsonProperty("sentiment_votes_down_percentage")
    private Double sentimentVotesDownPercentage;

    @JsonProperty("market_cap_rank")
    private Integer marketCapRank;

    @JsonProperty("coingecko_rank")
    private Integer coingeckoRank;

    @JsonProperty("coingecko_score")
    private Double coingeckoScore;

    @JsonProperty("developer_score")
    private Double developerScore;

    @JsonProperty("community_score")
    private Double communityScore;

    @JsonProperty("liquidity_score")
    private Double liquidityScore;

    @JsonProperty("public_interest_score")
    private Double publicInterestScore;

    @JsonProperty("public_interest_stats")
    private Map<String, String> publicInterestStats;

    @JsonProperty("status_updates")
    private List<Object> statusUpdates;

    @JsonProperty("last_updated")
    private String lastUpdated;

    public CoinData() {
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

    public String getAssetPlatformId() {
        return assetPlatformId;
    }

    public void setAssetPlatformId(String assetPlatformId) {
        this.assetPlatformId = assetPlatformId;
    }

    public Map<String, String> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(Map<String, String> platforms) {
        this.platforms = platforms;
    }

    public Integer getBlockTimeInMinutes() {
        return blockTimeInMinutes;
    }

    public void setBlockTimeInMinutes(Integer blockTimeInMinutes) {
        this.blockTimeInMinutes = blockTimeInMinutes;
    }

    public String getHashingAlgorithm() {
        return hashingAlgorithm;
    }

    public void setHashingAlgorithm(String hashingAlgorithm) {
        this.hashingAlgorithm = hashingAlgorithm;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getPublicNotice() {
        return publicNotice;
    }

    public void setPublicNotice(String publicNotice) {
        this.publicNotice = publicNotice;
    }

    public Map<String, String> getDescription() {
        return description;
    }

    public void setDescription(Map<String, String> description) {
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public String getGenesisDate() {
        return genesisDate;
    }

    public void setGenesisDate(String genesisDate) {
        this.genesisDate = genesisDate;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public Double getSentimentVotesUpPpercentage() {
        return sentimentVotesUpPpercentage;
    }

    public void setSentimentVotesUpPpercentage(Double sentimentVotesUpPpercentage) {
        this.sentimentVotesUpPpercentage = sentimentVotesUpPpercentage;
    }

    public Double getSentimentVotesDownPercentage() {
        return sentimentVotesDownPercentage;
    }

    public void setSentimentVotesDownPercentage(Double sentimentVotesDownPercentage) {
        this.sentimentVotesDownPercentage = sentimentVotesDownPercentage;
    }

    public Integer getMarketCapRank() {
        return marketCapRank;
    }

    public void setMarketCapRank(Integer marketCapRank) {
        this.marketCapRank = marketCapRank;
    }

    public Integer getCoingeckoRank() {
        return coingeckoRank;
    }

    public void setCoingeckoRank(Integer coingeckoRank) {
        this.coingeckoRank = coingeckoRank;
    }

    public Double getCoingeckoScore() {
        return coingeckoScore;
    }

    public void setCoingeckoScore(Double coingeckoScore) {
        this.coingeckoScore = coingeckoScore;
    }

    public Double getDeveloperScore() {
        return developerScore;
    }

    public void setDeveloperScore(Double developerScore) {
        this.developerScore = developerScore;
    }

    public Double getCommunityScore() {
        return communityScore;
    }

    public void setCommunityScore(Double communityScore) {
        this.communityScore = communityScore;
    }

    public Double getLiquidityScore() {
        return liquidityScore;
    }

    public void setLiquidityScore(Double liquidityScore) {
        this.liquidityScore = liquidityScore;
    }

    public Double getPublicInterestScore() {
        return publicInterestScore;
    }

    public void setPublicInterestScore(Double publicInterestScore) {
        this.publicInterestScore = publicInterestScore;
    }

    public Map<String, String> getPublicInterestStats() {
        return publicInterestStats;
    }

    public void setPublicInterestStats(Map<String, String> publicInterestStats) {
        this.publicInterestStats = publicInterestStats;
    }

    public List<Object> getStatusUpdates() {
        return statusUpdates;
    }

    public void setStatusUpdates(List<Object> statusUpdates) {
        this.statusUpdates = statusUpdates;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoinData coinData = (CoinData) o;
        return Objects.equals(id, coinData.id) && Objects.equals(symbol, coinData.symbol) && Objects.equals(name, coinData.name) && Objects.equals(assetPlatformId, coinData.assetPlatformId) && Objects.equals(platforms, coinData.platforms) && Objects.equals(blockTimeInMinutes, coinData.blockTimeInMinutes) && Objects.equals(hashingAlgorithm, coinData.hashingAlgorithm) && Objects.equals(categories, coinData.categories) && Objects.equals(publicNotice, coinData.publicNotice) && Objects.equals(description, coinData.description) && Objects.equals(image, coinData.image) && Objects.equals(countryOrigin, coinData.countryOrigin) && Objects.equals(genesisDate, coinData.genesisDate) && Objects.equals(contractAddress, coinData.contractAddress) && Objects.equals(sentimentVotesUpPpercentage, coinData.sentimentVotesUpPpercentage) && Objects.equals(sentimentVotesDownPercentage, coinData.sentimentVotesDownPercentage) && Objects.equals(marketCapRank, coinData.marketCapRank) && Objects.equals(coingeckoRank, coinData.coingeckoRank) && Objects.equals(coingeckoScore, coinData.coingeckoScore) && Objects.equals(developerScore, coinData.developerScore) && Objects.equals(communityScore, coinData.communityScore) && Objects.equals(liquidityScore, coinData.liquidityScore) && Objects.equals(publicInterestScore, coinData.publicInterestScore) && Objects.equals(publicInterestStats, coinData.publicInterestStats) && Objects.equals(statusUpdates, coinData.statusUpdates) && Objects.equals(lastUpdated, coinData.lastUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, symbol, name, assetPlatformId, platforms, blockTimeInMinutes, hashingAlgorithm, categories, publicNotice, description, image, countryOrigin, genesisDate, contractAddress, sentimentVotesUpPpercentage, sentimentVotesDownPercentage, marketCapRank, coingeckoRank, coingeckoScore, developerScore, communityScore, liquidityScore, publicInterestScore, publicInterestStats, statusUpdates, lastUpdated);
    }

    @Override
    public String toString() {
        return "CoinData{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", assetPlatformId='" + assetPlatformId + '\'' +
                ", platforms=" + platforms +
                ", blockTimeInMinutes=" + blockTimeInMinutes +
                ", hashingAlgorithm='" + hashingAlgorithm + '\'' +
                ", categories=" + categories +
                ", publicNotice='" + publicNotice + '\'' +
                ", description=" + description +
                ", image=" + image +
                ", countryOrigin='" + countryOrigin + '\'' +
                ", genesisDate='" + genesisDate + '\'' +
                ", contractAddress='" + contractAddress + '\'' +
                ", sentimentVotesUpPpercentage=" + sentimentVotesUpPpercentage +
                ", sentimentVotesDownPercentage=" + sentimentVotesDownPercentage +
                ", marketCapRank=" + marketCapRank +
                ", coingeckoRank=" + coingeckoRank +
                ", coingeckoScore=" + coingeckoScore +
                ", developerScore=" + developerScore +
                ", communityScore=" + communityScore +
                ", liquidityScore=" + liquidityScore +
                ", publicInterestScore=" + publicInterestScore +
                ", publicInterestStats=" + publicInterestStats +
                ", statusUpdates=" + statusUpdates +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }
}
