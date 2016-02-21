
package com.theboss.jackli.tripbuddy.model.pojo;

import java.util.HashMap;
import java.util.Map;

public class Paging {

    private Object next;
    private Object previous;
    private String results;
    private String total_results;
    private String skipped;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The next
     */
    public Object getNext() {
        return next;
    }

    /**
     * 
     * @param next
     *     The next
     */
    public void setNext(Object next) {
        this.next = next;
    }

    /**
     * 
     * @return
     *     The previous
     */
    public Object getPrevious() {
        return previous;
    }

    /**
     * 
     * @param previous
     *     The previous
     */
    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    /**
     * 
     * @return
     *     The results
     */
    public String getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    public void setResults(String results) {
        this.results = results;
    }

    /**
     * 
     * @return
     *     The total_results
     */
    public String getTotal_results() {
        return total_results;
    }

    /**
     * 
     * @param total_results
     *     The total_results
     */
    public void setTotal_results(String total_results) {
        this.total_results = total_results;
    }

    /**
     * 
     * @return
     *     The skipped
     */
    public String getSkipped() {
        return skipped;
    }

    /**
     * 
     * @param skipped
     *     The skipped
     */
    public void setSkipped(String skipped) {
        this.skipped = skipped;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
