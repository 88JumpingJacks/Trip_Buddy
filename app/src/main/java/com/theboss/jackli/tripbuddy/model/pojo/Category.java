
package com.theboss.jackli.tripbuddy.model.pojo;

import java.util.HashMap;
import java.util.Map;

public class Category {

    private String name;
    private String localized_name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The localized_name
     */
    public String getLocalized_name() {
        return localized_name;
    }

    /**
     * 
     * @param localized_name
     *     The localized_name
     */
    public void setLocalized_name(String localized_name) {
        this.localized_name = localized_name;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
