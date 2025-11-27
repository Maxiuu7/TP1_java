/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

import java.util.ArrayList;
import java.util.List;

public class Magasin {
    // --------- Attributs ----------
    private List<Produits> produits;

    // --------- Constructeur ----------
    public Magasin() {
        this.produits = new ArrayList<>();
    }

    // --------- Méthode  ----------
    public void ajouterProduit(Produits produit) {
        produits.add(produit);
        System.out.println(produit.getNom() + " a été ajouté au magasin.");
    }


    public void afficherProduitsDisponibles() {
        System.out.println("Produits disponibles dans le magasin :");
        for (Produits p : produits) {
            p.afficherDetails();
        }
    }

 
    public Produits trouverProduitParNom(String nom) {
        for (Produits p : produits) {
            if (p.getNom().equalsIgnoreCase(nom)) {
                return p;
            }
        }
        return null; 
    }


    public List<Produits> getProduits() {
        return produits;
    }
}
