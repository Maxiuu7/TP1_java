/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

/**
 *
 * @author mathe
 */

//---------Attribut--------------
public class Client {
    private int id;
    private String nom;
    private String email;
    
    
//------constructeur--------
public Client(int id, String nom, String email){
    this.id = id;
    this.nom = nom;
    this.email = email;
    
}
    
//-------Getters----------
        
public int getId(){
    return id;
}  

public String getNom(){
    return nom;
}  

public String getEmail(){
    return email;
}  

//----------Setters---------------

public void SetId(int id){
    this.id = id;

}

public void SetNom(String nom){
    this.nom = nom;

}

public void SetEmail(String email){
    this.email = email;

}




// --- Méthode afficherDetails
    public void afficherDetails() {
        System.out.println("ID Client : " + id);
        System.out.println("Nom : " + nom);
        System.out.println("Email : " + email);
        System.out.println("-----------------------------");
    }
}
