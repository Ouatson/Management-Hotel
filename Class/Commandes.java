package Class;

public class Commandes {
    private int id;
    private String type;
    private float montant;
    private String articles;
    private int id_client;
    private int id_chambre;
    private int id_hotel;

    public Commandes(int id, String type, float montant, String articles, int id_client, int id_chambre, int id_hotel) {
        this.id = id;
        this.type = type;
        this.montant = montant;
        this.articles = articles;
        this.id_client = id_client;
        this.id_chambre = id_chambre;
        this.id_hotel = id_hotel;

    }

    public int getid() {
        return this.id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String gettype() {
        return this.type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public float getmontant() {
        return this.montant;
    }

    public void setmontant(float montant) {
        this.montant = montant;
    }

    public String getarticles() {
        return this.articles;
    }

    public void setarticles(String articles) {
        this.articles = articles;
    }

    public int getid_client() {
        return this.id_client;
    }

    public void setid_client(int id_client) {
        this.id_client = id_client;
    }

    public int getid_chambre() {
        return this.id_chambre;
    }

    public void setid_chambre(int id_chambre) {
        this.id_chambre = id_chambre;
    }

    public int getid_hotel() {
        return this.id_hotel;
    }

    public void setid_hotel(int id_hotel) {
        this.id_hotel = id_hotel;
    }
}