package com.upiiz.heroes.entities;

import jakarta.persistence.*;

//Esta entidad se corresponde con una tabla -> heroes de la base de datos
//La base de datos marvel - defaultdb
@Entity
@Table(name = "heroe")

public class Heroe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String power;
    private String universe;

    @Column(name = "url_imagen")
    private String urlImage;

    public Heroe() {

    }

    public Heroe(Long id, String name, String power, String universe, String urlImage) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.universe = universe;
        this.urlImage = urlImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
