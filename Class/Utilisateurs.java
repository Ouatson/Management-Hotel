package Class;

import java.io.Serializable;

public class Utilisateurs implements Serializable {

    private int id;
    private String nom;
    private String prenom;
    private TypePoste poste; // Enumeration
    private String login;
    private String password;
    private int id_hotel;

    public Utilisateurs() {
    }

    public Utilisateurs(int id, String nom, String prenom, TypePoste poste, String login, String password,
            int id_hotel) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.poste = poste;
        this.login = login;
        this.password = password;
        this.id_hotel = id_hotel;
    }

    public int getid() {
        return this.id;
    }

    public String getnom() {
        return this.nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public String getprenom() {
        return this.prenom;
    }

    public void setprenom(String prenom) {
        this.prenom = prenom;
    }

    public TypePoste getposte() {
        return this.poste;
    }

    public void setposte(TypePoste poste) {
        this.poste = poste;
    }

    public String getlogin() {
        return login;
    }

    public void setlogin(String login) {
        this.login = login;
    }

    public String getpassword() {
        return this.password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public int getid_hotel() {
        return this.id_hotel;
    }

    public void setid_hotel(int id_hotel) {
        this.id_hotel = id;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}