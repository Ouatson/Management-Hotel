package Class;

public class Utilisateurs {
    
    private int id;
    private String nom;
    private String prenom;
    private  TypePoste poste; // Enumeration
    private String login;
    private String password;
    private int id_hotel;

    public Utilisateurs(int id, String nom, String prenom, TypePoste poste, String login, String password, int id_hotel){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.poste = poste;
        this.login = login;
        this.password = password;
        this.id_hotel = id_hotel;
    }

    public int getid(){
        return id;
    }

    public int setid(){
        return id;
    }

    public String getnom(){
        return nom;
    }

    public String setnom(){
        return nom;
    }

    public TypePoste getposte(){
        return poste;
    }

    public TypePoste setposte(){
        return poste;
    }

    public String getlogin(){
        return login;
    }

    public String setlogin(){
        return login;
    }

    public String getpassword(){
        return password;
    }

    public String setpassword(){
        return password;
    }

    public int getid_hotel(){
        return id_hotel;
    }

    public int setid_hotel(){
        return id_hotel;
    }
}