
package com.ermolnik.perfectandroid.net.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info {

    @SerializedName("seed")
    @Expose
    private String seed;
    @SerializedName("results")
    @Expose
    private long results;
    @SerializedName("page")
    @Expose
    private long page;
    @SerializedName("version")
    @Expose
    private String version;

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public Info withSeed(String seed) {
        this.seed = seed;
        return this;
    }

    public long getResults() {
        return results;
    }

    public void setResults(long results) {
        this.results = results;
    }

    public Info withResults(long results) {
        this.results = results;
        return this;
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public Info withPage(long page) {
        this.page = page;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Info withVersion(String version) {
        this.version = version;
        return this;
    }

}
