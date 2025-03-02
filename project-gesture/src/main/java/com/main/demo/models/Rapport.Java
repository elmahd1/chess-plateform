package com.main.demo.models;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Rapport {
    private int id;
    private String titre;
    private Date dateGeneration;
    private FormatRapport format;
    private Map<String, Object> donnees;

    public Rapport(int id, String titre, Date dateGeneration, FormatRapport format, Map<String, Object> donnees) {
        this.id = id;
        this.titre = titre;
        this.dateGeneration = dateGeneration;
        this.format = format;
        this.donnees = donnees;
    }

    public void exporter() {
        // Implementation for exporting the report
    }

    public void envoyer(List<Utilisateur> utilisateurs) {
        for (Utilisateur utilisateur : utilisateurs) {
            // Implementation for sending the report to users
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

    public Date getDateGeneration() {
        return dateGeneration;
    }

    public void setDateGeneration(Date dateGeneration) {
        this.dateGeneration = dateGeneration;
    }

    public FormatRapport getFormat() {
        return format;
    }

    public void setFormat(FormatRapport format) {
        this.format = format;
    }

    public Map<String, Object> getDonnees() {
        return donnees;
    }

    public void setDonnees(Map<String, Object> donnees) {
        this.donnees = donnees;
    }
}