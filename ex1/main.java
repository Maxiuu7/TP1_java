/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

/**
 *
 * @author mathe
 */
public class main {

    public static void main(String[] args) {
        
        
        
        // Création des personnes
        System.out.println(" Création des personnes");
        Personne personne1 = new Personne();
        Personne personne2 = new Personne("Lea", 2004);
        Personne personne3 = new Personne("Dos Santos", "Mathéo", 2004);
        
        System.out.println("\n test affichage personne");
        System.out.println("Nom de la première personne : " + personne1.getNom());
        System.out.println("Prénom de la deuxième personne : " + personne2.getPrenom());
        
        System.out.println("\n test modif avec les setters");
        personne1.setNom("Pereira");
        personne1.setPrenom("Taina");
        personne1.setAnNaissance(2005);
        System.out.println("Nouvelle personne :");
        personne1.afficherInfos();
        
        System.out.println("\n test methode mange");
        personne1.mange("burger");
        
        System.out.println("\n calcul de l'age");
        System.out.println("age de la troisième personne (" 
                + personne3.getPrenom() + " " + personne3.getNom() + ") : " 
                + personne3.calculerAge() + " ans");
        
        System.out.println("\n information complete");
        System.out.println("\n-- Personne 1 --");
        personne1.afficherInfos();
        
        System.out.println("\n-- Personne 2 --");
        personne2.afficherInfos();
        
        System.out.println("\n-- Personne 3 --");
        personne3.afficherInfos();
        
      
    }
}
