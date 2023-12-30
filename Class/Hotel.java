package Class;

import java.util.Collection;

public class Hotel {
    private int id;
    private String nom;
    private String adresse;
    private String telephone;
    private int nbre_chambres_luxe;
    private int nbre_chambres_normales;
    private Collection<Clients> liste_clients;
    private Collection<Utilisateurs> liste_utilisateurs;
}
