package com.theboss.jackli.tripbuddy.model.beans;

/**
 * Created by jianhuizhu on 2016-02-20.
 */
public class Sight {
    int id;
    String geo;
    String name;
    public Sight(){

    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
