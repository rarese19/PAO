package view;

import model.Client;
import model.Magazin;
import model.produs.Produs;
import model.tabele_asociative.TranzactieProdus;
import persistence.ClientRepository;
import persistence.MagazinRepository;
import persistence.ProdusRepository;
import persistence.TranzactieProdusRepository;
import service.Casierie;

import java.sql.Date;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class CasierieMode {
    private static CasierieMode instance = null;
    private static MagazinRepository magazinRepository = MagazinRepository.getInstance();
    private static ClientRepository clientRepository = ClientRepository.getInstance();
    private static ProdusRepository produsRepository = ProdusRepository.getInstance();
    private static Casierie casierie = Casierie.getInstance();
    private CasierieMode() {}

    public static CasierieMode getInstance() {
        if (instance == null) {
            instance = new CasierieMode();
        }
        return instance;
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Produs casca = produsRepository.get(1);
        Produs clapari = produsRepository.get(5);
        HashMap<Produs, Integer> produse = new HashMap<>();
        produse.put(casca, 1);
        produse.put(clapari, 3);

        System.out.println("-------Casierie-------");
        int id_magazin = 0;
        System.out.println("Introduceti id-ul magazinului: ");
        id_magazin = scanner.nextInt();
        scanner.nextLine();
        Magazin magazin = magazinRepository.get(id_magazin);

        System.out.println("Buna ziua! Aveti Cardul de Fidelitate? (Da/Nu)");
        String raspuns = scanner.nextLine();
        Client client = new Client();
        if (Objects.equals(raspuns, "Da")) {
            int id_client = 0;
            System.out.println("Introduceti id-ul clientului: ");
            id_client = scanner.nextInt();
            scanner.nextLine();
            client = clientRepository.get(id_client);
        } else {
            System.out.println("Introduceti datele clientului: ");
            System.out.println("Nume: ");
            client.setNume(scanner.nextLine());
            System.out.println("Prenume: ");
            client.setPrenume(scanner.nextLine());
            System.out.println("CNP: ");
            client.setCnp(scanner.nextLong());
            scanner.nextLine();
            System.out.println("Adresa: ");
            client.setAdresa(scanner.nextLine());
            System.out.println("Numar Telefon: ");
            client.setNumar_telefon(scanner.nextLine());
            clientRepository.add(client);
        }

        System.out.println("Introduceti metoda de plata: ");
        String metoda = scanner.nextLine();
        System.out.println("Introduceti data returnarii (YYYY-MM-DD): ");
        Date data_returnare = Date.valueOf(scanner.nextLine());

        casierie.genereazaFactura(client, magazin, produse, metoda, data_returnare);

    }
}
