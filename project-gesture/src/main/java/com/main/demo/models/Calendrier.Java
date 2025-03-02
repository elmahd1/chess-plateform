package com.main.demo.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Calendrier {
    private int id;
    private List<Evenement> evenements;

    public Calendrier() {
        this.evenements = new ArrayList<>();
    }

    public void ajouterEvenement(Evenement evenement) {
        this.evenements.add(evenement);
    }

    public void supprimerEvenement(Evenement evenement) {
        this.evenements.remove(evenement);
    }

    public List<Evenement> getEvenementsDate(Date date) {
        List<Evenement> evenementsDate = new ArrayList<>();
        for (Evenement evenement : evenements) {
            if (evenement.getDate().equals(date)) {
                evenementsDate.add(evenement);
            }
        }
        return evenementsDate;
    }

    // Getters and setters for all fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Evenement> getEvenements() {
        return evenements;
    }

    public void setEvenements(List<Evenement> evenements) {
        this.evenements = evenements;
    }
}