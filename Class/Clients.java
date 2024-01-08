package Class;

import java.util.Date;

public class Clients {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private Date date_arrivee;
    private Date date_sortie;
    private TypePaiement mode_paiement; // Enumeration


    public Clients(int id, String nom, String prenom, String email, String telephone, Date date_arrivee, Date date_sortie, TypePaiement mode_paiement){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.date_arrivee = date_arrivee;
        this.date_sortie = date_sortie;
        this.mode_paiement = mode_paiement;
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

    public String getprenom(){
        return this.prenom;
    }

    public void setprenom(String prenom){
        this.prenom = prenom;
    }

    public String getemail(){
        return this.email;
    }

    public void setemail(String email){
        this.email = email;
    }

    public String gettelephone(){
        return this.telephone;
    }

    public void settelephone(String tel){
        this.telephone = tel;
    }

    public Date getdate_arrivee(){
        return this.date_arrivee;
    }

    public void setdate_arrivee(Date date_arrivee){
        this.date_arrivee = date_arrivee;
    }

    public Date getdate_sortie(){
        return this.date_sortie;
    }

    public void setdate_sortie(Date date_sortie){
        this.date_sortie = date_sortie;
    }

    public TypePaiement getmode_paiement(){
        return this.mode_paiement;
    }

    public void setmode_paiement(TypePaiement mode_paiement){
        this.mode_paiement = mode_paiement;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}