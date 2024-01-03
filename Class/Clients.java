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
    private String mode_paiement; // Enumeration


    public Clients(int id, String nom, String prenom, String email, String telephone, Date date_arrivee, Date date_sortie, String mode_paiement){
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

    public String getemail(){
        return email;
    }

    public String setemail(){
        return email;
    }

    public String gettelephone(){
        return telephone;
    }

    public String settelephone(){
        return telephone;
    }

    public Date getdate_arrivee(){
        return date_arrivee;
    }

    public Date setdate_sortie(){
        return date_sortie;
    }

    public String getmode_paiement(){
        return mode_paiement;
    }

    public String setmode_paiement(){
        return mode_paiement;
    }
}
