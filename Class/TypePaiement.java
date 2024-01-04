package Class;

public enum TypePaiement {

    CB("cb"),
    Especes("liquide"),
    SEPA("virement");

    private String type;

    private TypePaiement(String type){
        this.type = type;
    }
    
}
