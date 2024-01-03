package Class;

public class ChambreLuxe extends Chambres {

    public ChambreLuxe(int numero, float prix_par_nuit, int id_hotel) {
        super(numero, prix_par_nuit, id_hotel);
        //TODO Auto-generated constructor stub
    }
    private TypeChambre type = TypeChambre.LUXE;
    private String taille_lit;
    
}
