/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;
import java.util.List;
import java.util.ArrayList;
        
public class Commande {
    private int idCommande;
    private Client client;
    private List<Produits> produitsCommande;
    private double total;
    

    public Commande(int idCommande, Client client, Panier panier) {
        this.idCommande = idCommande;
        this.client = client;
        this.produitsCommande = new ArrayList<>(panier.getProduits());
        this.total=panier.calculerTotal();
        
    }

    public void afficherDetailsCommande() {
        System.out.println("Commande N° : " + idCommande);
        System.out.println("Client : " + client.getNom() + " (" + client.getEmail() + ")");
        System.out.println("Produits commandés :");
        for (Produits p : produitsCommande) {
        p.afficherDetails();          
        }
        System.out.println("Total de la commande : " + total + " €");
        System.out.println("---------------------------------------");
    }
}
