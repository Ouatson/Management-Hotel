package Class;

public class Commandes {
    private int id;
    private String type;
    private float montant;
    private String articles;
    private int id_client;
    private int id_chambre;
    private int id_hotel;




    public Commandes(int id, String type, float montant, String articles, int id_client, int id_chambre, int id_hotel){
        this.id = id;
        this.type = type;
        this.montant = montant;
        this.articles = articles;
        this.id_client = id_client;
        this.id_chambre = id_chambre;
        this.id_hotel = id_hotel;
        
    }

    public int id(){
    return id;
}

    public int getid(){
        return id;
    }

    public int setid(){
        return id;
    }

    public String gettype(){
        return type;

    }

    public String settype(){
        return type;
    }

    public float getmontant(){
        return montant;
    }

    public float setmontant(){
        return montant;
    }

    public String getarticles(){
        return articles;
    }

    public String setarticles(){
        return articles;
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

    public int getid_hotel(){
        return id_hotel;
    }

    public int setid_hotel(){
        return id_hotel;
    }
}



