/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author mathe
 */
public class Personne {
    // Attribut
    private String nom;
    private String prenom;
    private int anNaissance;
    private static int nbPers = 0;

    // Constructeur
    public Personne(String nom, String prenom, int anNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.anNaissance = anNaissance;
        nbPers++;
        afficherNbPers();
    }
    
    public Personne (String prenom, int anNaissance) {
        this.nom = "Inconnu";
        this.prenom = prenom;
        this.anNaissance = anNaissance;
        nbPers++;
        afficherNbPers();
    }
    
    public Personne() {
        this("Potter", "Harry", 1980);
        
    }
    
    // Getter
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAnNaissance() {
        return anNaissance;
    }
    
    //Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAnNaissance(int anNaissance) {
        this.anNaissance = anNaissance;
    }
    
    // Méthodes
    public int calculerAge() {
        int anneeActuel = 2025;
        return anneeActuel - anNaissance;
    }
    
    public void afficherInfos() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Âge: " + calculerAge());
    }
    
    public void mange(String nourriture) {
        System.out.println(prenom + " " + nom + " mange un/une " + nourriture);
}

    public static void afficherNbPers() {
        System.out.println("Nombres de personnes " + nbPers);
        
    }


}