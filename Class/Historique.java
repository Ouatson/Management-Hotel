package Class;

import java.sql.Date;

public class Historique {
    private Date id_date;
    private int id_client;
    private int id_chambre;
    private int id_commande;
    private int id_reservation;
    private int id_facture;
    private int id_hotel;

    public Historique(Date id_date, int id_client, int id_chambre,int id_commande, int id_reservation, int id_facture, int id_hotel){
        this.id_date = id_date;
        this.id_client = id_client;
        this.id_chambre = id_chambre;
        this.id_commande = id_commande;
        this.id_reservation =id_reservation;
        this.id_facture =id_facture;
        this.id_hotel = id_hotel;
    }

    public Date getid_date(){
        return id_date;
    }

    public Date setid_date(){
        return id_date;
    }

    public int getid_client(){
        return id_client;
    }

    public int setid_client(){
        return id_client;
    }

    public int getid_chambre(){
        return id_chambre;
    }

    public int setid_chambre(){
        return id_chambre;
    }

    public int getid_commande(){
        return id_commande;
    }

    public int setid_commande(){
        return id_commande;
    }

    public int getid_reservation(){
        return id_reservation;
    }

    public int setid_reservation(){
        return id_reservation;
    }

    public int getid_facture(){
        return id_facture;
    }

    public int setid_facture(){
        return id_facture;
    }

    public int getid_hotel(){
        return id_hotel;
    }

    public int setid_hotel(){
        return id_hotel;
    }

}
