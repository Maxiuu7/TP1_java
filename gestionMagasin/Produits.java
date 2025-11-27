/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

public class Produits {
    // --- Attributs ---
    private int id;
    private String nom;
    private double prix;
    private int quantite;

    // --- Constructeur ---
    public Produits(int id, String nom, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    // --- Getters ---
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    // --- Setters ---
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    // ---  afficherDetails ---
    public void afficherDetails() {
        System.out.println("ID : " + id);
        System.out.println("Nom : " + nom);
        System.out.println("Prix : " + prix + " €");
        System.out.println("Quantité : " + quantite);
        System.out.println("-----------------------------");
    }
    
}
