package com.jingle.portal.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "weather")

public class Weather {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(name = "ts")
    private java.time.LocalDateTime ts;
    @Column(name = "degree")
    private String degree;

    public java.time.LocalDateTime getTs() {
        return ts;
    }

    public void setTs(java.time.LocalDateTime ts) {
        this.ts = ts;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", ts='" + ts + '\'' +
                ", degree='" + degree + '\'' +
                '}';
    }
}
