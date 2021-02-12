package com.natlex.backend_module.model;

import javax.persistence.*;

@Entity

@Table (name = "Point")
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Column(name = "coordinates", nullable = false)
    private org.springframework.data.geo.Point coordinates;

    private int count;
    private String adress;

    public Point() {
    }

    public Point(Long id, org.springframework.data.geo.Point coordinates, int count, String adress) {
        this.id = id;
        this.coordinates = coordinates;
        this.count = count;
        this.adress = adress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public org.springframework.data.geo.Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(org.springframework.data.geo.Point coordinates) {
        this.coordinates = coordinates;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}
