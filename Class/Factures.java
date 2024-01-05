package Class;

public class Factures {
    private int id;
    private float prix_reservation;
    private float prix_commande;
    private float montant;
    private int id_client;
    private int id_commande;
    private int id_hotel;


    public Factures (int id, float prix_reservation, float prix_commande, float montant, int id_client, int id_commande, int id_hotel){

        this.id = id;
        this.prix_reservation = prix_reservation;
        this.prix_commande = prix_commande;
        this.montant = montant;
        this.id_client = id_client;
        this.id_commande = id_commande;
        this.id_hotel = id_hotel;
    }

    public int getid(){
        return id;
    }

    public int setid(){
        return id;
    }

    public float getprix_reservation(){
        return prix_reservation;
    }

    public float setprix_reservation(){
        return prix_reservation;
    }

    public float getprix_commande(){
        return prix_commande;
    }

    public float setprix_commande(){
        return prix_commande;
    }

    public float getmontant(){
        return montant;
    }

    public float setmontant(){
        return montant;
    }

    public int getid_client(){
        return id_client;
    }

    public int setid_client(){
        return id_client;
    }

    public int getid_commande(){
        return id_commande;
    }

    public int setid_commande(){
        return id_commande;
    }

    public int getid_hotel(){
        return id_hotel;
    }

    public int setid_hotel(){
        return id_hotel;
    }
}
