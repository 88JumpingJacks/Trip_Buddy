
package com.theboss.jackli.tripbuddy.model.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Datum {

    private Address_obj address_obj;
    private Integer percent_recommended;
    private String latitude;
    private String rating;
    private List<Attraction_type> attraction_types = new ArrayList<Attraction_type>();
    private Object wikipedia_info;
    private String location_id;
    private Ranking_data ranking_data;
    private String api_detail_url;
    private String location_string;
    private String web_url;
    private String rating_image_url;
    private List<Award> awards = new ArrayList<Award>();
    private String name;
    private String num_reviews;
    private String write_review;
    private Category category;
    private List<Subcategory> subcategory = new ArrayList<Subcategory>();
    private List<Ancestor> ancestors = new ArrayList<Ancestor>();
    private String see_all_photos;
    private String longitude;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The address_obj
     */
    public Address_obj getAddress_obj() {
        return address_obj;
    }

    /**
     * 
     * @param address_obj
     *     The address_obj
     */
    public void setAddress_obj(Address_obj address_obj) {
        this.address_obj = address_obj;
    }

    /**
     * 
     * @return
     *     The percent_recommended
     */
    public Integer getPercent_recommended() {
        return percent_recommended;
    }

    /**
     * 
     * @param percent_recommended
     *     The percent_recommended
     */
    public void setPercent_recommended(Integer percent_recommended) {
        this.percent_recommended = percent_recommended;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The attraction_types
     */
    public List<Attraction_type> getAttraction_types() {
        return attraction_types;
    }

    /**
     * 
     * @param attraction_types
     *     The attraction_types
     */
    public void setAttraction_types(List<Attraction_type> attraction_types) {
        this.attraction_types = attraction_types;
    }

    /**
     * 
     * @return
     *     The wikipedia_info
     */
    public Object getWikipedia_info() {
        return wikipedia_info;
    }

    /**
     * 
     * @param wikipedia_info
     *     The wikipedia_info
     */
    public void setWikipedia_info(Object wikipedia_info) {
        this.wikipedia_info = wikipedia_info;
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

    /**
     * 
     * @return
     *     The ranking_data
     */
    public Ranking_data getRanking_data() {
        return ranking_data;
    }

    /**
     * 
     * @param ranking_data
     *     The ranking_data
     */
    public void setRanking_data(Ranking_data ranking_data) {
        this.ranking_data = ranking_data;
    }

    /**
     * 
     * @return
     *     The api_detail_url
     */
    public String getApi_detail_url() {
        return api_detail_url;
    }

    /**
     * 
     * @param api_detail_url
     *     The api_detail_url
     */
    public void setApi_detail_url(String api_detail_url) {
        this.api_detail_url = api_detail_url;
    }

    /**
     * 
     * @return
     *     The location_string
     */
    public String getLocation_string() {
        return location_string;
    }

    /**
     * 
     * @param location_string
     *     The location_string
     */
    public void setLocation_string(String location_string) {
        this.location_string = location_string;
    }

    /**
     * 
     * @return
     *     The web_url
     */
    public String getWeb_url() {
        return web_url;
    }

    /**
     * 
     * @param web_url
     *     The web_url
     */
    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    /**
     * 
     * @return
     *     The rating_image_url
     */
    public String getRating_image_url() {
        return rating_image_url;
    }

    /**
     * 
     * @param rating_image_url
     *     The rating_image_url
     */
    public void setRating_image_url(String rating_image_url) {
        this.rating_image_url = rating_image_url;
    }

    /**
     * 
     * @return
     *     The awards
     */
    public List<Award> getAwards() {
        return awards;
    }

    /**
     * 
     * @param awards
     *     The awards
     */
    public void setAwards(List<Award> awards) {
        this.awards = awards;
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
     *     The num_reviews
     */
    public String getNum_reviews() {
        return num_reviews;
    }

    /**
     * 
     * @param num_reviews
     *     The num_reviews
     */
    public void setNum_reviews(String num_reviews) {
        this.num_reviews = num_reviews;
    }

    /**
     * 
     * @return
     *     The write_review
     */
    public String getWrite_review() {
        return write_review;
    }

    /**
     * 
     * @param write_review
     *     The write_review
     */
    public void setWrite_review(String write_review) {
        this.write_review = write_review;
    }

    /**
     * 
     * @return
     *     The category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The subcategory
     */
    public List<Subcategory> getSubcategory() {
        return subcategory;
    }

    /**
     * 
     * @param subcategory
     *     The subcategory
     */
    public void setSubcategory(List<Subcategory> subcategory) {
        this.subcategory = subcategory;
    }

    /**
     * 
     * @return
     *     The ancestors
     */
    public List<Ancestor> getAncestors() {
        return ancestors;
    }

    /**
     * 
     * @param ancestors
     *     The ancestors
     */
    public void setAncestors(List<Ancestor> ancestors) {
        this.ancestors = ancestors;
    }

    /**
     * 
     * @return
     *     The see_all_photos
     */
    public String getSee_all_photos() {
        return see_all_photos;
    }

    /**
     * 
     * @param see_all_photos
     *     The see_all_photos
     */
    public void setSee_all_photos(String see_all_photos) {
        this.see_all_photos = see_all_photos;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
