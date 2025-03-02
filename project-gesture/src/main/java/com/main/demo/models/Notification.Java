package com.main.demo.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String message;
    private Date dateCreation;
    private boolean lue;
    @Enumerated(EnumType.STRING)
    private TypeNotification type;
    @ManyToOne
    @JoinColumn(name = "reference_id")
    private Object reference;

    public Notification() {
    }

    public Notification(String message, TypeNotification type, Object reference) {
        this.message = message;
        this.dateCreation = new Date();
        this.lue = false;
        this.type = type;
        this.reference = reference;
    }

    public void marquerCommeLue() {
        this.lue = true;
    }

    // Getters and setters for all fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public boolean isLue() {
        return lue;
    }

    public void setLue(boolean lue) {
        this.lue = lue;
    }

    public TypeNotification getType() {
        return type;
    }

    public void setType(TypeNotification type) {
        this.type = type;
    }

    public Object getReference() {
        return reference;
    }

    public void setReference(Object reference) {
        this.reference = reference;
    }
}