package Class;

import java.util.Collection;

public class Hotel {
    private int id;
    private String nom;
    private String adresse;
    private String telephone;
    private int nbre_chambres_luxe;
    private int nbre_chambres_normales;
    private Collection<Clients> liste_clients;
    private Collection<Utilisateurs> liste_utilisateurs;

    public Hotel(int id, String nom, String adresse, String telephone, int nbre_chambres_luxe, int nbre_chambres_normales, Collection<Clients> liste_Clients, Collection<Utilisateurs> liste_utilisateurs){
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.nbre_chambres_luxe = nbre_chambres_luxe;
        this.nbre_chambres_normales = nbre_chambres_normales;
        this.liste_clients = liste_Clients;
        this.liste_utilisateurs = liste_utilisateurs;
    }

    public int getid(){
        return id;
    }

    public int setid(){
        return id;
    }

    public String getnom(){
        return nom;
    }

    public String setnom(){
        return nom;
    }

    public String getadresse(){
        return adresse;
    }

    public String setadresse(){
        return adresse;
    }

    public String gettelephone(){
        return telephone;
    }

    public String settelephone(){
        return telephone;
    }

    public int getnbre_chambres_luxe(){
        return nbre_chambres_luxe;
    }

    public int setnbre_chambres_luxe(){
        return nbre_chambres_luxe;
    }

    public int getnbre_chambres_normales(){
        return nbre_chambres_normales;
    }

    public int setnbre_chambres_normales(){
        return nbre_chambres_normales;
    }

    public Collection<Clients> getliste_clients(){
        return liste_clients;
    }

    public Collection<Clients> setliste_Clients(){
        return liste_clients;
    }

    public Collection<Utilisateurs> getliste_Utilisateurs(){
        return liste_utilisateurs;
    }

    public Collection<Utilisateurs> setliste_Utilisateurs(){
        return liste_utilisateurs;
    }
}
