// Appartement herite local(extend local)
public class Appartement extends Local {

    private int nbrpiece;

    // premier constructeur

    public Appartement() {

    }

    // deuxieme constructeur

    public Appartement(int nbrpiece) {
        this.nbrpiece = nbrpiece;
    }

    public Appartement(int typeLocal, String localisation, int prix, double tauxloc, int nbrpiece) {
        super(typeLocal, localisation, prix, tauxloc);
        this.nbrpiece = nbrpiece;
    }

    // GETTER SETTER
    public int getNbrpiece() {
        return nbrpiece;
    }

    public void setNbrpiece(int nbrpiece) {
        this.nbrpiece = nbrpiece;
    }

    // METHODE AFFICHER
    @Override
    public String toString() {
        String result = " Reference = " + reference + ", Type local = " + typeLocal + ", Localisation = " + localisation
                + ", Prix = " + prix + ", Taux local = " + tauxloc + ", Nombre de piece = " + nbrpiece;
        return result;
    }

    // Propri�t� navigationnelle
    private Local localAppartement;

    public Local getLocal() {
        return this.localAppartement;
    }

    public void setLocal(Local locale) {
        this.localAppartement = locale;
    }

}
