package edu.upc.dsa;

/**
 * Created by nodet on 18/12/17.
 */
public class Login {
    public Login(){
        nom ="";
        password="";
    }

    public Login(String pass){
        password = pass;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String password;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    String nom;
}