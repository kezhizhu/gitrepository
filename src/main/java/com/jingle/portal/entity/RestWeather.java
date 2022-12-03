package com.jingle.portal.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestWeather {
    private String lat;
    private String lin;
    private String timezone;


    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLin() {
        return lin;
    }

    public void setLin(String lin) {
        this.lin = lin;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }


    @Override
    public String toString() {
        return "RestWeather{" +
                "lat='" + lat + '\'' +
                ", lin='" + lin + '\'' +
                ", timezone='" + timezone + '\'' +
                '}';
    }
}
