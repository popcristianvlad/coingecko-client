package com.popcristianvlad.coingecko.client.representation;

import java.util.Objects;

public class Image {

    /**
     * e.g. https://assets.coingecko.com/coins/images/1/thumb/bitcoin.png?1547033579
     */
    private String thumb;

    /**
     * https://assets.coingecko.com/coins/images/1/small/bitcoin.png?1547033579
     */
    private String small;

    /**
     * https://assets.coingecko.com/coins/images/1/large/bitcoin.png?1547033579
     */
    private String large;

    public Image() {
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return Objects.equals(thumb, image.thumb) && Objects.equals(small, image.small) && Objects.equals(large, image.large);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thumb, small, large);
    }

    @Override
    public String toString() {
        return "Image{" +
                "thumb='" + thumb + '\'' +
                ", small='" + small + '\'' +
                ", large='" + large + '\'' +
                '}';
    }
}
