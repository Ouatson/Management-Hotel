package Class;

import java.io.Serializable;
import java.util.Collection;

public class Hotel implements Serializable {
    private int id;
    private String nom;
    private String adresse;
    private String telephone;
    private int nbre_chambres_luxe;
    private int nbre_chambres_normales;
    private Collection<Clients> liste_clients;
    private Collection<Utilisateurs> liste_utilisateurs;

    public Hotel() {}

    public Hotel(int id, String nom, String adresse, String telephone, int nbre_chambres_luxe, int nbre_chambres_normales){
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.nbre_chambres_luxe = nbre_chambres_luxe;
        this.nbre_chambres_normales = nbre_chambres_normales;
    }

    public int getid(){
        return this.id;
    }

    public String getnom(){
        return this.nom;
    }

    public void setnom(String nom){
        this.nom = nom;
    }

    public String getadresse(){
        return this.adresse;
    }

    public void setadresse(String adresse){
        this.adresse = adresse;
    }

    public String gettelephone(){
        return this.telephone;
    }

    public void settelephone(String telephone){
        this.telephone = telephone;
    }

    public int getnbre_chambres_luxe(){
        return this.nbre_chambres_luxe;
    }

    public void setnbre_chambres_luxe(int nbre_chambres_luxe) {
        this.nbre_chambres_luxe = nbre_chambres_luxe;
    }

    public int getnbre_chambres_normales(){
        return this.nbre_chambres_normales;
    }

    public void setnbre_chambres_normales(int nbre_chambres_normales){
        this.nbre_chambres_normales = nbre_chambres_normales;
    }

    public Collection<Clients> getliste_clients(){
        return liste_clients;
    }

    public void setliste_Clients(Collection<Clients> liste_clients){
        this.liste_clients = liste_clients;
    }

    public Collection<Utilisateurs> getliste_Utilisateurs(){
        return this.liste_utilisateurs;
    }

    public void setliste_Utilisateurs(Collection<Utilisateurs> liste_utilisateurs){
        this.liste_utilisateurs = liste_utilisateurs;
    }
}
