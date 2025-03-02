package com.main.demo.models;

import java.util.Date;
import java.util.List;

public class Evenement {
    private int id;
    private String titre;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private List<Utilisateur> participants;
    private TypeEvenement type;

    public Evenement(int id, String titre, String description, Date dateDebut, Date dateFin, List<Utilisateur> participants, TypeEvenement type) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.participants = participants;
        this.type = type;
    }

    public void notifierParticipants() {
        for (Utilisateur participant : participants) {
            // Implementation for notifying participants
        }
    }

    // Getters and setters for all fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<Utilisateur> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Utilisateur> participants) {
        this.participants = participants;
    }

    public TypeEvenement getType() {
        return type;
    }

    public void setType(TypeEvenement type) {
        this.type = type;
    }
}