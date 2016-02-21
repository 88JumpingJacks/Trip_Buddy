
package com.theboss.jackli.tripbuddy.model.pojo;

import java.util.HashMap;
import java.util.Map;

public class Ranking_data {

    private String ranking_string;
    private String ranking_out_of;
    private String geo_location_id;
    private String ranking;
    private String geo_location_name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The ranking_string
     */
    public String getRanking_string() {
        return ranking_string;
    }

    /**
     * 
     * @param ranking_string
     *     The ranking_string
     */
    public void setRanking_string(String ranking_string) {
        this.ranking_string = ranking_string;
    }

    /**
     * 
     * @return
     *     The ranking_out_of
     */
    public String getRanking_out_of() {
        return ranking_out_of;
    }

    /**
     * 
     * @param ranking_out_of
     *     The ranking_out_of
     */
    public void setRanking_out_of(String ranking_out_of) {
        this.ranking_out_of = ranking_out_of;
    }

    /**
     * 
     * @return
     *     The geo_location_id
     */
    public String getGeo_location_id() {
        return geo_location_id;
    }

    /**
     * 
     * @param geo_location_id
     *     The geo_location_id
     */
    public void setGeo_location_id(String geo_location_id) {
        this.geo_location_id = geo_location_id;
    }

    /**
     * 
     * @return
     *     The ranking
     */
    public String getRanking() {
        return ranking;
    }

    /**
     * 
     * @param ranking
     *     The ranking
     */
    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    /**
     * 
     * @return
     *     The geo_location_name
     */
    public String getGeo_location_name() {
        return geo_location_name;
    }

    /**
     * 
     * @param geo_location_name
     *     The geo_location_name
     */
    public void setGeo_location_name(String geo_location_name) {
        this.geo_location_name = geo_location_name;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
