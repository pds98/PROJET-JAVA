import java.time.LocalDate;

public class Reservation {

    private static LocalDate date;
    private static String duree;
    private static String etat;
    private static String id;

    private int FORMAT = 1;

    /** Definition du constructeur */
    public Reservation() {

    }

    /** Surcharge du constructeur 3 */
    public Reservation(LocalDate date, String etat, String duree) {
        this.id = generatId();
        setEtat(etat);
        setDate(date);
        setDuree(duree);
    }

    public static int nombreCompte;

    private String generatId() {

        String nombreZero = "";
        String nombreCompteString = String.valueOf(++nombreCompte);
        while (nombreZero.length() + nombreCompteString.length() != FORMAT) {
            nombreZero += "0";
        }
        return nombreZero + nombreCompteString;
    }

    // GETTER

    public LocalDate getDate() {
        return date;
    }

    public String getDuree() {
        return duree;
    }

    public String getEtat() {
        return etat;
    }

    public String getId() {
        return id;
    }

    // SETTER

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static String afficher() {
        return "\n La date : " + date + "\n La duree : " + duree + "\n L'etat : " + etat + "\n L'id : " + id;
    }

}
