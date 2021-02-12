package com.natlex.backend_module.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "DatePoint")
public class DatePoint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    private String description;
    private String photo;
    private Date date;
    private String links;
    private Long point_id;

    public DatePoint(Long id, String description, String photo, Date date, String links, Long point_id) {
        this.id = id;
        this.description = description;
        this.photo = photo;
        this.date = date;
        this.links = links;
        this.point_id = point_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public Long getPoint_id() {
        return point_id;
    }

    public void setPoint_id(Long point_id) {
        this.point_id = point_id;
    }

    public DatePoint() {
    }
}
