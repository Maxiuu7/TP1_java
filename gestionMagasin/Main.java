/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionMagasin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Création du magasin
        Magasin magasin = new Magasin();
        Panier panier = new Panier();
        Client client = new Client(1, "Dos Santos", "Matheo");

        // Ajout des produits
        magasin.ajouterProduit(new Produits(1, "Macbook", 1200, 8));
        magasin.ajouterProduit(new Produits(2, "Isouris", 60, 34));
        magasin.ajouterProduit(new Produits(3, "IClavier", 120, 10));
        magasin.ajouterProduit(new Produits(3, "Iphone", 1000, 13));

        int choix;

        do {
            System.out.println("\n--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine(); 

            switch (choix) {
                case 1:
                    magasin.afficherProduitsDisponibles();
                    break;

                case 2:
                    System.out.print("Entrez le nom du produit : ");
                    String nomProduit = sc.nextLine();
                    
                    Produits p = magasin.trouverProduitParNom(nomProduit);
                    if (p != null) {
                        panier.ajouterProduit(p);
                    } else {
                        System.out.println("Produit introuvable");
                    }
                    break;

                case 3:
                    panier.afficherPanier();
                    break;

                case 4:
                    Commande commande = new Commande(101, client, panier);
                    commande.afficherDetailsCommande();
                    break;

                case 5:
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("Choix invalide");
                    break;
            }
        } while (choix != 5);

        sc.close();
    }
}


