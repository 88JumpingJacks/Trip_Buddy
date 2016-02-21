
package com.theboss.jackli.tripbuddy.model.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Award {

    private String award_type;
    private String year;
    private Images images;
    private List<Object> categories = new ArrayList<Object>();
    private String display_name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The award_type
     */
    public String getAward_type() {
        return award_type;
    }

    /**
     * 
     * @param award_type
     *     The award_type
     */
    public void setAward_type(String award_type) {
        this.award_type = award_type;
    }

    /**
     * 
     * @return
     *     The year
     */
    public String getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 
     * @return
     *     The images
     */
    public Images getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(Images images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The categories
     */
    public List<Object> getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }

    /**
     * 
     * @return
     *     The display_name
     */
    public String getDisplay_name() {
        return display_name;
    }

    /**
     * 
     * @param display_name
     *     The display_name
     */
    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
