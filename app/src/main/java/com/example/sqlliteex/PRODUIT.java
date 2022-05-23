package com.example.sqlliteex;

public class PRODUIT {
    private int id;
    private String libelle;
    private String famille;
    private double prixAchat;
    private double prixVente;

    public PRODUIT(int id, String libelle, String famille, double prixAchat, double prixVente) {
        this.id = id;
        this.libelle = libelle;
        this.famille = famille;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
    }
    public PRODUIT() {
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }


    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getFamille() {
        return famille;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public double getPrixVente() {
        return prixVente;
    }







}
