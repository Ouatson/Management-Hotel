package Class;

public class ChambreNormale extends Chambres {

    public ChambreNormale(int numero, float prix_par_nuit, int id_hotel) {
        super(numero, prix_par_nuit, id_hotel);
    }
    private String type;
    private String taille_lit;

    public void setType(String type) {}
    
}
