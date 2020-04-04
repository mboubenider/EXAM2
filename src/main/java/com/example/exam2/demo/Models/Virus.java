package com.example.exam2.demo.Models;
import javax.persistence.*;


@Entity
@Table(name = "virus")
public class Virus
{
    @Id
    @Column (name = "Id")
    private String Id;
    @Column (name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "symptoms")
    private String symptoms;
    @Column(name = "duration")
    public String duration;
    @Column(name = "mortalityrate")
    public String mortalityrate;

    public Virus()
    {

    }
    public Virus(String name, String description, String symptoms, String duration, String mortalityrate) {
        this.name = name;
        this.description = description;
        this.symptoms = symptoms;
        this.duration = duration;
        this.mortalityrate = mortalityrate;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public String getDuration() {
        return duration;
    }

    public String getMortalityrate() {
        return mortalityrate;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setMortalityrate(String mortalityrate) {
        this.mortalityrate = mortalityrate;
    }
}



