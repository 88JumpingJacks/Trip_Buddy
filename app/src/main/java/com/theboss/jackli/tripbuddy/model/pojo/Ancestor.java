
package com.theboss.jackli.tripbuddy.model.pojo;

import java.util.HashMap;
import java.util.Map;

public class Ancestor {

    private Object abbrv;
    private String level;
    private String name;
    private String location_id;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The abbrv
     */
    public Object getAbbrv() {
        return abbrv;
    }

    /**
     * 
     * @param abbrv
     *     The abbrv
     */
    public void setAbbrv(Object abbrv) {
        this.abbrv = abbrv;
    }

    /**
     * 
     * @return
     *     The level
     */
    public String getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The location_id
     */
    public String getLocation_id() {
        return location_id;
    }

    /**
     * 
     * @param location_id
     *     The location_id
     */
    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
