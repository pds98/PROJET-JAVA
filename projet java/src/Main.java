import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        Service service = new Service();
        Validator v1 = new Validator();
        List<Client> listClients = new ArrayList<>();
        List<Local> listLocals = new ArrayList<>();
        int choix;
        do {
            choix = menu();
            switch (choix) {
                case 1:
                    // AJOUTER UN LOCAL
                    System.out.println("******************** Ajout d'un local ******************** : ");

                    // RECUPERATION DES DONNNEES AU CLAVIER :
                    // String typeCompte ;
                    int typeLocalInt;
                    do {
                        System.out.println(
                                "Quel type de local voulez vous : " + "\n 1- Chambre" + "\n 2- Appartement" + "\n");

                        int typeLocal = scanner.nextInt();

                        scanner.nextLine();
                        typeLocalInt = (typeLocal);

                    } while (typeLocalInt != 2 && typeLocalInt != 1);
                    Chambre chambre;
                    if (typeLocalInt == 1) {

                        System.out.println("Entrer la localisation : " + "\n");
                        String localisation = scanner.nextLine();

                        System.out.println("Entrer le prix : ");
                        String prix = scanner.nextLine();

                        System.out.println("Entrer le taux de location : " + "\n");
                        String tauxloc = scanner.nextLine();

                        System.out.println("Entrer la dimension : " + "\n");
                        String dimension = scanner.nextLine();

                        // ON CREE APPARTEMENT DANS LOCAL
                        chambre = new Chambre(typeLocalInt, localisation, Integer.parseInt(prix),
                                Integer.parseInt(tauxloc), Integer.parseInt(dimension));

                        // ON AJOUTE CHAMBRE DANS LOCAL
                        service.addLocal(chambre);
                    } else if (typeLocalInt == 2) {

                        System.out.println("Entrer la localisation : " + "\n");
                        String localisation = scanner.nextLine();

                        System.out.println("Entrer le prix : ");
                        String prix = scanner.nextLine();

                        System.out.println("Entrer le taux de location : " + "\n");
                        String tauxloc = scanner.nextLine();

                        int nbrpiece;
                        System.out.println("Veuillez saisir le nombre de piece " + "\n");
                        nbrpiece = scanner.nextInt();
                        do {
                            if (nbrpiece < 3) {
                                System.out.println("Attention l'appartement doit avoir au minimum trois piece " + "\n");
                                nbrpiece = scanner.nextInt();
                            }

                        } while ((nbrpiece) < 3);
                        System.out
                                .println("L'appartement de " + nbrpiece + " pieces a �t� ajouter avec succes " + "\n");

                        Appartement appartement = new Appartement(typeLocalInt, localisation, Integer.parseInt(prix),
                                Integer.parseInt(tauxloc), nbrpiece);

                        // ON CREE APPARTEMENT DANS LOCAL
                        service.addLocal(appartement);
                    }
                    break;
                case 2:
                    // LISTER LES LOCAUX PAR TYPE

                    System.out.println(
                            "******************** Lister les locaux par type chambre ******************** : " + "\n");

                    Service.listerChambre(Service.listLocals);

                    System.out.println(
                            "*********************************************************************** : " + "\n");

                    System.out.println(
                            "******************** Lister les locaux par type Appartement ******************** : "
                                    + "\n");

                    Service.listerAppartement(Service.listLocals);

                    System.out.println(
                            "*********************************************************************** : " + "\n");

                    break;
                case 3:

                case 4:
                    System.out
                            .println("******************** Voir les d�tails d'un local ******************** : " + "\n");
                    Service.listerLocal();
                    break;
                case 5:

                    System.out.println("******************** Faire une reservation ******************** : " + "\n");

                    System.out.println("Entrer votre nci : " + "\n");
                    String nci = scanner.nextLine();
                    if (Validator.isValidNci(nci) && nci != null) {

                    } else {
                        System.out.println(" NCI incorrect ! Veuillez r�essayer." + "\n");
                        break;
                    }
                    // SI LE CLIENT N'EXISTE PAS ON CREE UN COMPTE

                    Client client = service.searchClient((nci));
                    if (client == null) {

                        System.out.println("******************** Creer votre compte ******************** : ");

                        System.out.print("Entrer votre nom complet : ");
                        String nomComplet = scanner.nextLine();
                        if (Validator.isValidName(nomComplet) && nomComplet != null) {

                        } else {
                            System.out.println(" Nom incorrect ! Veuillez r�essayer.");
                            break;
                        }

                        System.out.print("Entrer votre numero (+221 xx xxx xx xx): " + "\n");
                        String tel = scanner.nextLine();
                        if (Validator.isValidPhone(tel)) {

                        } else {
                            System.out.println("Numero incorrect ! Veuillez r�essayer." + "\n");
                            break;
                        }

                        System.out.print("Entrer votre Adresse : ");
                        String adresse = scanner.nextLine();
                        if (Validator.isValidAdresse(adresse) && adresse != null) {

                        } else {
                            System.out.println("Adresse incorrect ! Veuillez r�essayer." + "\n");
                            break;
                        }

                        System.out.print("Entrer votre email : " + "\n");
                        String email = scanner.nextLine();
                        if (v1.isValidEmail(email) && email != null) {
                        } else {
                            System.out.println("Email incorrect ! Veuillez r�essayer.");
                            break;
                        }

                        client = new Client(nci, nomComplet, tel, adresse, email);
                        service.createClient(client);
                    }

                    String typeReservation;
                    int typeReservationInt;
                    do {
                        System.out.println("Quel type de local voulez vous Reserver ? " + "\n");
                        System.out.println("\t 1- Chambre");
                        System.out.println("\t 2- Appartement");
                        typeReservation = scanner.nextLine();
                        typeReservationInt = Integer.parseInt(typeReservation);

                    } while (typeReservationInt != 2 && typeReservationInt != 1);
                    // Local local;
                    if (typeReservationInt == 1) {
                        // Local local;
                        // Chambre chambre;

                    }
                    break;

                case 6:
                    System.out.println("******************** Annuler une reservation ******************** : ");
                    break;
                case 7:
                    System.out.println("******************** Lister les locaux disponibles ******************** : ");
                case 8:
                    System.out.println("Bye :() ");
                    break;
                default:
                    System.out.println("Mauvais choix :( )");
            }

        } while (choix != 8);
    }

    public static int menu() {
        int choix;
        System.out.println("Menu" + "\n 1-Ajouter un Local" + "\n 2-Lister Les locaux par Type"
                + "\n 3-Lister Les locaux reserv�s par un client" + "\n 4-Voir les d�tails d'un local"
                + "\n 5-Faire une reservation" + "\n 6-Annuler une reservation" + "\n 7-Lister les locaux disponibles"
                + "\n 8-Quitter");
        System.out.println("Faites votre choix : " + "\n");
        choix = scanner.nextInt();
        return choix;
    }
}