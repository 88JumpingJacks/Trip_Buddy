package com.theboss.jackli.tripbuddy.model.beans;


import java.util.Map;

/**
 * Created by jianhuizhu on 2016-02-20.
 */
public class User {
    String firstname;
    String lastname;
    String email;
    String password;
    Map<String,CityTrip> cityTripMap;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Map<String, CityTrip> getCityTripMap() {
        return cityTripMap;
    }

    public void setCityTripMap(Map<String, CityTrip> cityTripMap) {
        this.cityTripMap = cityTripMap;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public User(){

    }

}
