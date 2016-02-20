package com.theboss.jackli.tripbuddy.model.beans;

import java.util.Map;

/**
 * Created by jianhuizhu on 2016-02-20.
 */
public class CityTrip {
    long time;
    String cityName;
    Map<String,Sight> interestedSigth;
    public CityTrip(){

    }
    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Map<String, Sight> getInterestedSigth() {
        return interestedSigth;
    }

    public void setInterestedSigth(Map<String, Sight> interestedSigth) {
        this.interestedSigth = interestedSigth;
    }
}
