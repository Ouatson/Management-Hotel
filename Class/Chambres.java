package Class;

public class Chambres {
    private int numero;
    private float prix_par_nuit;
    private boolean occupied=false;
    private int occupied_by;
    private int id_hotel;

    public Chambres(int numero, float prix_par_nuit, int id_hotel) {
        this.numero = numero;
        this.prix_par_nuit = prix_par_nuit;
        this.id_hotel = id_hotel;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrix_par_nuit(float prix_par_nuit) {
        this.prix_par_nuit = prix_par_nuit;
    }

    public void setOccupation(boolean occupied) {
        this.occupied = occupied;
    }

    public void setOccupied_By_client(int id_client) {
        this.occupied_by = id_client;
    }

    public void setId_hotel(int id_hotel) {
        this.id_hotel = id_hotel;
    }

    public int getNumero() {
        return this.numero;
    }

    public float getPrix_par_nuit() {
        return this.prix_par_nuit;
    }

    public boolean getOccupation() {
        return this.occupied;
    }

    public int getOccupied_By_client() {
        return this.occupied_by;
    }

    public int getId_hotel() {
        return this.id_hotel;
    }

}
