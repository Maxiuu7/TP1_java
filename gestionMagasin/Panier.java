/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author mathe
 */

//--------attributs------------
public class Panier {
    private List <Produits> produits;
    
    
    
//-------Construucteurs-----------
public Panier(){
    this.produits=new ArrayList<>();
    
    

}

public List getProduits() {
        return produits;
    }


//-------ajoute juste 1 produit au panier---------
 public void ajouterProduit(Produits produit) {
    Produits copie = new Produits(produit.getId(), produit.getNom(), produit.getPrix(), 1);
    produits.add(copie);
    System.out.println(copie.getNom() + " a été ajouté au panier.");
}

 
 public void supprimerProduit(Produits produit) {
        produits.remove(produit);                   
        System.out.println("Suppression: " + produit.getNom());
    }
 
 public void afficherPanier() {
        System.out.println("Contenu du panier :");  
        for (Produits p : produits) {
            System.out.println(p.getNom());
        }
    }
 
 
 public double calculerTotal() {
        double total = 0;
        for (Produits p : produits) {
            total += p.getPrix() * p.getQuantite();
        }
        return total;
    }
}
