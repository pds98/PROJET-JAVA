public class Client {

    private String nci;
    private String nomComplet;
    private String tel;
    private String adresse;
    private String email;

    // premier constructeur

    public Client() {

    }

    // deuxieme constructeur
    public Client(int nci) {

    }

    // troisieme constructeur
    public Client(String nci, String nomComplet, String tel, String adresse, String email) {
        this.nci = nci;
        this.nomComplet = nomComplet;
        this.tel = tel;
        this.adresse = adresse;
        this.email = email;
    }

    // GEETER SETTER

    public String getNci() {
        return nci;
    }

    public void setNci(String nci) {
        this.nci = nci;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Client [adresse=" + adresse + ", email=" + email + ", nci=" + nci + ", nomComplet=" + nomComplet
                + ", tel=" + tel + "]";
    }

}
