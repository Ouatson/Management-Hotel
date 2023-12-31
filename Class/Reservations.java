package Class;

import java.sql.Date;
import java.util.Collection;

public class Reservations {
    private String id;
    private int nombre_nuits;
    private Collection <Chambres> liste_chambres;
    private Date date;
    private Date date_prevue_arrivee;
    private Date date_prevue_depart;
    private float prix;
    private int id_client;
    private int id_chambre;
}
