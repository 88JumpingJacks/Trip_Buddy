package com.theboss.jackli.tripbuddy.model;

/**
 * Created by yucunli on 2016-02-20.
 */
public class TripAdvisorLocation {

    private String url;
    private String locationId;
    private String name;

    public TripAdvisorLocation(String locationId, String name) {
        this.locationId = locationId;
        this.name = name;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
