import java.util.List;
import java.util.ArrayList;

public class Service {

    private List<Client> listClients = new ArrayList<>();
    static List<Local> listLocals = new ArrayList<>();
    static List<Reservation> listReservations = new ArrayList<>();

    public Client searchClient(String nci) {

        Client client1 = new Client();
        client1.setNci(nci);
        int pos = listClients.indexOf(client1);
        if (pos != -1) {
            return listClients.get(pos);
        }
        return null;
    }

    public void createClient(Client client) {
        listClients.add(client);
    }

    public void addLocal(Local local) {
        listLocals.add(local);
    }

    public static void listerLocal() {
        for (Local local : listLocals) {
            System.out.println(local.toString());
        }
    }

    public static void listerChambre(List<Local> listLocals) {
        for (Local local : listLocals) {
            if (local.getTypeLocal() == 1) {
                System.out.println(local.toString());

            }

        }

    }

    public static void listerAppartement(List<Local> listLocals) {
        for (Local local : listLocals) {
            if (local.getTypeLocal() == 2) {
                System.out.println(local.toString());

            }

        }
    }

}