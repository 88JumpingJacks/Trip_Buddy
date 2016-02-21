
package com.theboss.jackli.tripbuddy.model.pojo;

import java.util.HashMap;
import java.util.Map;

public class Address_obj {

    private String street1;
    private String street2;
    private String city;
    private String state;
    private String country;
    private String postalcode;
    private String address_string;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The street1
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * 
     * @param street1
     *     The street1
     */
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    /**
     * 
     * @return
     *     The street2
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * 
     * @param street2
     *     The street2
     */
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The postalcode
     */
    public String getPostalcode() {
        return postalcode;
    }

    /**
     * 
     * @param postalcode
     *     The postalcode
     */
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    /**
     * 
     * @return
     *     The address_string
     */
    public String getAddress_string() {
        return address_string;
    }

    /**
     * 
     * @param address_string
     *     The address_string
     */
    public void setAddress_string(String address_string) {
        this.address_string = address_string;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
