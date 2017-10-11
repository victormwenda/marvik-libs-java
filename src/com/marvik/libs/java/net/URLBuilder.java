package com.marvik.libs.java.net;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * URL Builder
 * <p/>
 * Provides apis for quickly building URLS
 */
public class URLBuilder {

    private Map<String, String> mKeyValuePairs;

    private String url;

    private String query;

    /**
     * URL Builder accepts a url which it builds
     *
     * @param url
     */
    public URLBuilder(String url) {
        this.url = url;
    }

    /**
     * Return the url
     *
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Returns the query
     *
     * @return query
     */
    public String getQuery() {
        return query;
    }

    /**
     * Append new name value pairs to the query
     *
     * @param key
     * @param value
     * @return a cascade object of this class
     */
    public URLBuilder append(String key, String value) {

        if (mKeyValuePairs == null) {
            mKeyValuePairs = new HashMap<>();
        }

        mKeyValuePairs.put(key, value);

        return this;
    }

    /**
     * Returns the built query
     *
     * @return
     */
    public URLBuilder build() {

        StringBuilder builder = new StringBuilder();

        int index = 0;

        for (Map.Entry<String, String> entry : mKeyValuePairs.entrySet()) {
            builder.append(String.format(Locale.getDefault(), "%s=%s", entry.getKey(), entry.getValue()));

            if (index < mKeyValuePairs.entrySet().size() - 1) {
                builder.append("&");
            }
        }

        query = builder.toString();

        return this;
    }

    /**
     * Returns the built query which is appended to the url
     *
     * @return
     */
    public String buildUpon() {
        build();
        return String.format(Locale.getDefault(), "%s?%s", getUrl(), getQuery());
    }

    /**
     * Return the query as a string
     *
     * @return the query
     */
    @Override
    public String toString() {
        return buildUpon();
    }
}
