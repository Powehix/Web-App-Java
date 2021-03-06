package com.qrcode.WebApp.models;

import javax.persistence.*;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_room;

    private String location_of_room;
    private Integer number_of_objects;

    @ManyToOne(cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "id_person", nullable = false)
    private Person person;

    public Room() {
    }

    public Room(String location_of_room, Integer number_of_objects, Person person) {
        this.location_of_room = location_of_room;
        this.number_of_objects = number_of_objects;
        this.person = person;
    }

    public Long getId_room() {
        return id_room;
    }

    public void setId_room(Long id_room) {
        this.id_room = id_room;
    }

    public String getLocation_of_room() {
        return location_of_room;
    }

    public void setLocation_of_room(String location_of_room) {
        this.location_of_room = location_of_room;
    }

    public Integer getNumber_of_objects() {
        return number_of_objects;
    }

    public void setNumber_of_objects(Integer number_of_objects) {
        this.number_of_objects = number_of_objects;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
