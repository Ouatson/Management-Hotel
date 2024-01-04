package Class;

import java.sql.Date;
import java.util.Collection;

public class Reservations {
    private String id;
    private int nombre_nuits;
    private Collection <Chambres> lst_chambres;
    private Date date;
    private Date date_prevue_arrivee;
    private Date date_prevue_depart;
    private float prix;
    private int id_client;
    private int id_chambre;


    public Reservations (String id, int nombre_nuits, Collection<Chambres> lst_Chambres, Date date, Date date_prevue_arrivee, Date date_prevue_depart, float prix, int id_client, int id_chambre){
        this.id = id;
        this.nombre_nuits = nombre_nuits;
        this.lst_chambres = lst_Chambres;
        this.date = date;
        this.date_prevue_arrivee = date_prevue_arrivee;
        this.date_prevue_depart = date_prevue_depart;
        this.prix = prix;
        this.id_client = id_client;
        this.id_chambre = id_chambre;
    }

    public String getid(){
        return id;
    }

    public String setid(){
        return id;
    }

    public int getnombre_nuits(){
        return nombre_nuits;
    }

    public int setnombre_nuits(){
        return nombre_nuits;
    }

    public Collection<Chambres> getlst_Chambres(){
        return lst_chambres;
    }

    public Collection<Chambres> setlst_Chambres(){
        return lst_chambres;
    }

    public Date getdate(){
        return date;
    }

    public Date setdate(){
        return date;
    }

    public Date getdate_prevue_arrivee(){
        return date_prevue_arrivee;
    }

    public Date setdate_prevue_depart(){
        return date_prevue_depart;
    }

    public float getprix(){
        return prix;
    }

    public float setsetprix(){
        return prix;
    }

    public int getid_client(){
        return id_client;
    }

    public int setid_client(){
        return id_client;
    }

    public int id_chambre(){
        return id_chambre;
    }
}
