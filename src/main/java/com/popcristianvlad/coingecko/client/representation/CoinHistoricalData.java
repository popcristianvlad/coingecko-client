package com.popcristianvlad.coingecko.client.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.Objects;

/**
 * Historical data at a given date for a coin.
 */
public class CoinHistoricalData {

    /**
     * e.g. bitcoin
     */
    private String id;

    /**
     * e.g. btc
     */
    private String symbol;

    /**
     * e.g. Bitcoin
     */
    private String name;

    /**
     * e.g en -> Bitcoin
     */
    private Map<String, String> localization;

    private Image image;

    @JsonProperty("market_data")
    private MarketData marketData;

    @JsonProperty("community_data")
    private CommunityData communityData;

    @JsonProperty("developer_data")
    private DeveloperData developerData;

    /**
     * e.g. alexa_rank -> 2912
     */
    @JsonProperty("public_interest_stats")
    private Map<String, Long> publicInterestStats;

    public CoinHistoricalData() {
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

    public Map<String, String> getLocalization() {
        return localization;
    }

    public void setLocalization(Map<String, String> localization) {
        this.localization = localization;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public MarketData getMarketData() {
        return marketData;
    }

    public void setMarketData(MarketData marketData) {
        this.marketData = marketData;
    }

    public CommunityData getCommunityData() {
        return communityData;
    }

    public void setCommunityData(CommunityData communityData) {
        this.communityData = communityData;
    }

    public DeveloperData getDeveloperData() {
        return developerData;
    }

    public void setDeveloperData(DeveloperData developerData) {
        this.developerData = developerData;
    }

    public Map<String, Long> getPublicInterestStats() {
        return publicInterestStats;
    }

    public void setPublicInterestStats(Map<String, Long> publicInterestStats) {
        this.publicInterestStats = publicInterestStats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoinHistoricalData that = (CoinHistoricalData) o;
        return Objects.equals(id, that.id) && Objects.equals(symbol, that.symbol) && Objects.equals(name, that.name) && Objects.equals(localization, that.localization) && Objects.equals(image, that.image) && Objects.equals(marketData, that.marketData) && Objects.equals(communityData, that.communityData) && Objects.equals(developerData, that.developerData) && Objects.equals(publicInterestStats, that.publicInterestStats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, symbol, name, localization, image, marketData, communityData, developerData, publicInterestStats);
    }

    @Override
    public String toString() {
        return "CoinHistoricalData{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", localization=" + localization +
                ", image=" + image +
                ", marketData=" + marketData +
                ", communityData=" + communityData +
                ", developerData=" + developerData +
                ", publicInterestStats=" + publicInterestStats +
                '}';
    }

    public class MarketData {

        /**
         * e.g. usd -> 13620.3618741461
         */
        @JsonProperty("current_price")
        private Map<String, Double> currentPrice;

        /**
         * e.g. usd -> 228445816988.881
         */
        @JsonProperty("market_cap")
        private Map<String, Double> marketCap;

        /**
         * e.g. usd -> 3600481281.03768
         */
        @JsonProperty("total_volume")
        private Map<String, Double> totalVolume;

        public MarketData() {
        }

        public Map<String, Double> getCurrentPrice() {
            return currentPrice;
        }

        public void setCurrentPrice(Map<String, Double> currentPrice) {
            this.currentPrice = currentPrice;
        }

        public Map<String, Double> getMarketCap() {
            return marketCap;
        }

        public void setMarketCap(Map<String, Double> marketCap) {
            this.marketCap = marketCap;
        }

        public Map<String, Double> getTotalVolume() {
            return totalVolume;
        }

        public void setTotalVolume(Map<String, Double> totalVolume) {
            this.totalVolume = totalVolume;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MarketData that = (MarketData) o;
            return Objects.equals(currentPrice, that.currentPrice) && Objects.equals(marketCap, that.marketCap) && Objects.equals(totalVolume, that.totalVolume);
        }

        @Override
        public int hashCode() {
            return Objects.hash(currentPrice, marketCap, totalVolume);
        }

        @Override
        public String toString() {
            return "MarketData{" +
                    "currentPrice=" + currentPrice +
                    ", marketCap=" + marketCap +
                    ", totalVolume=" + totalVolume +
                    '}';
        }
    }

    public class CommunityData {

        /**
         * e.g. 1000
         */
        @JsonProperty("facebook_likes")
        private Long facebookLikes;

        /**
         * e.g. 603664
         */
        @JsonProperty("twitter_followers")
        private Long twitterFollowers;

        /**
         * e.g. 2.042
         */
        @JsonProperty("reddit_average_posts_48h")
        private Double redditAveragePosts48h;

        /**
         * e.g. 445.896
         */
        @JsonProperty("reddit_average_comments_48h")
        private Double redditAverageComments48h;

        /**
         * e.g. 612412
         */
        @JsonProperty("reddit_subscribers")
        private Double redditSubscribers;

        /**
         * e.g. 14074.0
         */
        @JsonProperty("reddit_accounts_active_48h")
        private Double redditAccountsActive48h;

        public CommunityData() {
        }

        public Long getFacebookLikes() {
            return facebookLikes;
        }

        public void setFacebookLikes(Long facebookLikes) {
            this.facebookLikes = facebookLikes;
        }

        public Long getTwitterFollowers() {
            return twitterFollowers;
        }

        public void setTwitterFollowers(Long twitterFollowers) {
            this.twitterFollowers = twitterFollowers;
        }

        public Double getRedditAveragePosts48h() {
            return redditAveragePosts48h;
        }

        public void setRedditAveragePosts48h(Double redditAveragePosts48h) {
            this.redditAveragePosts48h = redditAveragePosts48h;
        }

        public Double getRedditAverageComments48h() {
            return redditAverageComments48h;
        }

        public void setRedditAverageComments48h(Double redditAverageComments48h) {
            this.redditAverageComments48h = redditAverageComments48h;
        }

        public Double getRedditSubscribers() {
            return redditSubscribers;
        }

        public void setRedditSubscribers(Double redditSubscribers) {
            this.redditSubscribers = redditSubscribers;
        }

        public Double getRedditAccountsActive48h() {
            return redditAccountsActive48h;
        }

        public void setRedditAccountsActive48h(Double redditAccountsActive48h) {
            this.redditAccountsActive48h = redditAccountsActive48h;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CommunityData that = (CommunityData) o;
            return Objects.equals(facebookLikes, that.facebookLikes) && Objects.equals(twitterFollowers, that.twitterFollowers) && Objects.equals(redditAveragePosts48h, that.redditAveragePosts48h) && Objects.equals(redditAverageComments48h, that.redditAverageComments48h) && Objects.equals(redditSubscribers, that.redditSubscribers) && Objects.equals(redditAccountsActive48h, that.redditAccountsActive48h);
        }

        @Override
        public int hashCode() {
            return Objects.hash(facebookLikes, twitterFollowers, redditAveragePosts48h, redditAverageComments48h, redditSubscribers, redditAccountsActive48h);
        }

        @Override
        public String toString() {
            return "CommunityData{" +
                    "facebookLikes=" + facebookLikes +
                    ", twitterFollowers=" + twitterFollowers +
                    ", redditAveragePosts48h=" + redditAveragePosts48h +
                    ", redditAverageComments48h=" + redditAverageComments48h +
                    ", redditSubscribers=" + redditSubscribers +
                    ", redditAccountsActive48h=" + redditAccountsActive48h +
                    '}';
        }
    }

    public class DeveloperData {

        /**
         * e.g 13660
         */
        private Long forks;

        /**
         * e.g. 23665
         */
        private Long stars;

        /**
         * e.g. 2513
         */
        private Long subscribers;

        /**
         * e.g 3591
         */
        @JsonProperty("total_issues")
        private Long totalIssues;

        /**
         * e.g. 3022
         */
        @JsonProperty("closed_issues")
        private Long closedIssues;

        /**
         * e.g. 5038
         */
        @JsonProperty("pull_requests_merged")
        private Long pullRequestsMerged;

        /**
         * e.g. 450
         */
        @JsonProperty("pull_request_contributors")
        private Long pullRequestContributors;

        /**
         * e.g. additions -> 100
         */
        @JsonProperty("code_additions_deletions_4_weeks")
        private Map<String, Long> codeAdditionsDeletions4Weeks;

        /**
         * e.g. 147
         */
        @JsonProperty("commit_count_4_weeks")
        private Long commitCount4Weeks;

        public DeveloperData() {
        }

        public Long getForks() {
            return forks;
        }

        public void setForks(Long forks) {
            this.forks = forks;
        }

        public Long getStars() {
            return stars;
        }

        public void setStars(Long stars) {
            this.stars = stars;
        }

        public Long getSubscribers() {
            return subscribers;
        }

        public void setSubscribers(Long subscribers) {
            this.subscribers = subscribers;
        }

        public Long getTotalIssues() {
            return totalIssues;
        }

        public void setTotalIssues(Long totalIssues) {
            this.totalIssues = totalIssues;
        }

        public Long getClosedIssues() {
            return closedIssues;
        }

        public void setClosedIssues(Long closedIssues) {
            this.closedIssues = closedIssues;
        }

        public Long getPullRequestsMerged() {
            return pullRequestsMerged;
        }

        public void setPullRequestsMerged(Long pullRequestsMerged) {
            this.pullRequestsMerged = pullRequestsMerged;
        }

        public Long getPullRequestContributors() {
            return pullRequestContributors;
        }

        public void setPullRequestContributors(Long pullRequestContributors) {
            this.pullRequestContributors = pullRequestContributors;
        }

        public Map<String, Long> getCodeAdditionsDeletions4Weeks() {
            return codeAdditionsDeletions4Weeks;
        }

        public void setCodeAdditionsDeletions4Weeks(Map<String, Long> codeAdditionsDeletions4Weeks) {
            this.codeAdditionsDeletions4Weeks = codeAdditionsDeletions4Weeks;
        }

        public Long getCommitCount4Weeks() {
            return commitCount4Weeks;
        }

        public void setCommitCount4Weeks(Long commitCount4Weeks) {
            this.commitCount4Weeks = commitCount4Weeks;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DeveloperData that = (DeveloperData) o;
            return Objects.equals(forks, that.forks) && Objects.equals(stars, that.stars) && Objects.equals(subscribers, that.subscribers) && Objects.equals(totalIssues, that.totalIssues) && Objects.equals(closedIssues, that.closedIssues) && Objects.equals(pullRequestsMerged, that.pullRequestsMerged) && Objects.equals(pullRequestContributors, that.pullRequestContributors) && Objects.equals(codeAdditionsDeletions4Weeks, that.codeAdditionsDeletions4Weeks) && Objects.equals(commitCount4Weeks, that.commitCount4Weeks);
        }

        @Override
        public int hashCode() {
            return Objects.hash(forks, stars, subscribers, totalIssues, closedIssues, pullRequestsMerged, pullRequestContributors, codeAdditionsDeletions4Weeks, commitCount4Weeks);
        }

        @Override
        public String toString() {
            return "DeveloperData{" +
                    "forks=" + forks +
                    ", stars=" + stars +
                    ", subscribers=" + subscribers +
                    ", totalIssues=" + totalIssues +
                    ", closedIssues=" + closedIssues +
                    ", pullRequestsMerged=" + pullRequestsMerged +
                    ", pullRequestContributors=" + pullRequestContributors +
                    ", codeAdditionsDeletions4Weeks=" + codeAdditionsDeletions4Weeks +
                    ", commitCount4Weeks=" + commitCount4Weeks +
                    '}';
        }
    }
}
