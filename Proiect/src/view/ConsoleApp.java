package view;

import model.produs.PerecheSchi;
import persistence.*;

import model.*;
import model.produs.*;

import java.sql.Date;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleApp {
    private static ConsoleApp instance = null;
    StatiuneRepository statiuneRepository;
    AngajatRepository angajatRepository;
    PartieRepository partieRepository;
    MagazinRepository magazinRepository;
    ImportatorRepository importatorRepository;
    ProdusRepository produsRepository;
    ClientRepository clientRepository;
    TranzactieRepository tranzactieRepository;

    private ConsoleApp() {
        statiuneRepository = StatiuneRepository.getInstance();
        statiuneRepository.setRepositories();

        angajatRepository = AngajatRepository.getInstance();
        angajatRepository.setRepositories();

        partieRepository = PartieRepository.getInstance();
        partieRepository.setRepositories();

        magazinRepository = MagazinRepository.getInstance();
        magazinRepository.setRepositories();

        importatorRepository = ImportatorRepository.getInstance();
        importatorRepository.setRepositories();

        produsRepository = ProdusRepository.getInstance();

        clientRepository = ClientRepository.getInstance();
        clientRepository.setRepositories();

        tranzactieRepository = TranzactieRepository.getInstance();

    }

    public static ConsoleApp getInstance() {
        if (instance == null) {
            instance = new ConsoleApp();
        }
        return instance;
    }

    private void startMenu() {
        System.out.println("----------Menu----------");
        System.out.println("1. Create");
        System.out.println("2. Read");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
        System.out.println("------------------------");
    }

    private void printCreateMenu() {
        System.out.println("-------Create Menu-------");
        showModels();
    }

    private void showModels() {
        System.out.println("1. Angajat");
        System.out.println("2. Client");
        System.out.println("3. Importator");
        System.out.println("4. Magazin");
        System.out.println("5. Partie");
        System.out.println("6. Pereche Schi");
        System.out.println("7. Pereche Patine");
        System.out.println("8. Snowboard");
        System.out.println("9. Accesoriu");
        System.out.println("10. Statiune");
        System.out.println("11. Tranzactie");
        System.out.println("12. Return");
        System.out.println("------------------------");
    }

    private void printRreadMenu() {
        System.out.println("-------Read Menu-------");
        showModels();
    }

    private void printUpdateMenu() {
        System.out.println("-------Update Menu-------");
        showModels();
    }

    private void printDeleteMenu() {
        System.out.println("-------Delete Menu-------");
        showModels();
    }


    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            startMenu();
            System.out.println("Choose option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createMenu();
                    break;
                case 2:
                    readMenu();
                    break;
                case 3:
                    updateMenu();
                    break;
                case 4:
                    deleteMenu();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    void createMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            printCreateMenu();
            System.out.println("Choose option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Angajat angajat = new Angajat();
                    System.out.println("Introduceti datele angajatului: ");
                    System.out.println("ID: ");
                    angajat.setAngajat_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("ID Magazin: ");
                    angajat.setMagazin_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Nume: ");
                    angajat.setNume(scanner.nextLine());
                    System.out.println("Prenume: ");
                    angajat.setPrenume(scanner.nextLine());
                    System.out.println("CNP: ");
                    angajat.setCnp(scanner.nextLong());
                    scanner.nextLine();
                    System.out.println("Salariu: ");
                    angajat.setSalariu(scanner.nextLong());
                    scanner.nextLine();
                    System.out.println("Numar Telefon: ");
                    angajat.setNumar_telefon(scanner.nextLine());
                    angajatRepository.add(angajat);
                    break;
                case 2:
                    Client client = new Client();
                    System.out.println("Introduceti datele clientului: ");
                    System.out.println("ID: ");
                    client.setClient_id(scanner.nextInt());
                    scanner.nextLine();
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
                    break;
                case 3:
                    Importator importator = new Importator();
                    System.out.println("Introduceti datele importatorului: ");
                    System.out.println("ID: ");
                    importator.setImportator_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Nume: ");
                    importator.setNume(scanner.nextLine());
                    System.out.println("Adresa: ");
                    importator.setAdresa_mail(scanner.nextLine());
                    System.out.println("Numar Contact: ");
                    importator.setNumar_contact(scanner.nextLine());
                    System.out.println("Metoda transport: ");
                    importator.setMetoda_transport(scanner.nextLine());
                    importatorRepository.add(importator);
                    break;
                case 4:
                    Magazin magazin = new Magazin();
                    System.out.println("Introduceti datele magazinului: ");
                    System.out.println("ID: ");
                    magazin.setMagazin_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Statiune ID: ");
                    magazin.setStatiune_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Numar contact: ");
                    magazin.setNumar_contact(scanner.nextLine());
                    System.out.println("Adresa Mail: ");
                    magazin.setAdresa_mail(scanner.nextLine());
                    magazinRepository.add(magazin);
                    break;
                case 5:
                    Partie partie = new Partie();
                    System.out.println("Introduceti datele partiei: ");
                    System.out.println("ID: ");
                    partie.setPartie_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Statiune ID: ");
                    partie.setStatiune_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Nume: ");
                    partie.setNume(scanner.nextLine());
                    System.out.println("Inaltime: ");
                    partie.setInaltime(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Lungime: ");
                    partie.setLungime(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Dificultate: ");
                    partie.setGrad_dificultate(scanner.nextLine());

                    partieRepository.add(partie);
                    break;
                case 6:
                    Produs perecheSchi = new PerecheSchi();
                    System.out.println("Introduceti datele perechii de schi: ");
                    System.out.println("ID: ");
                    perecheSchi.setProdus_id(scanner.nextInt());
                    scanner.nextLine();
                    perecheSchi.setNume("pereche schi");
                    System.out.println("Pret: ");
                    perecheSchi.setPret(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Disponibilitate(1/0): ");
                    perecheSchi.setDisponibilitate(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Brand: ");
                    perecheSchi.setBrand(scanner.nextLine());
                    System.out.println("Lungime: ");
                    ((PerecheSchi) perecheSchi).setLungime(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Flexibilitate: ");
                    ((PerecheSchi) perecheSchi).setFlexibilitate(scanner.nextLine());
                    System.out.println("Nivel Experienta: ");
                    ((PerecheSchi) perecheSchi).setNivel_experienta(scanner.nextLine());

                    produsRepository.add(perecheSchi);
                    break;
                case 7:
                    Produs perechePatine = new PerechePatine();
                    System.out.println("Introduceti datele perechii de patine: ");
                    System.out.println("ID: ");
                    perechePatine.setProdus_id(scanner.nextInt());
                    scanner.nextLine();
                    perechePatine.setNume("pereche patine");
                    System.out.println("Pret: ");
                    perechePatine.setPret(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Disponibilitate(1/0): ");
                    perechePatine.setDisponibilitate(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Brand: ");
                    perechePatine.setBrand(scanner.nextLine());
                    System.out.println("Marime: ");
                    ((PerechePatine) perechePatine).setMarime(scanner.nextFloat());
                    scanner.nextLine();
                    System.out.println("Material: ");
                    ((PerechePatine) perechePatine).setMaterial(scanner.nextLine());
                    System.out.println("Tip: ");
                    ((PerechePatine) perechePatine).setTip(scanner.nextLine());

                    produsRepository.add(perechePatine);
                    break;
                case 8:
                    Produs snowboard = new Snowboard();
                    System.out.println("Introduceti datele snowboard-ului: ");
                    System.out.println("ID: ");
                    snowboard.setProdus_id(scanner.nextInt());
                    scanner.nextLine();
                    snowboard.setNume("snow-board");
                    System.out.println("Pret: ");
                    snowboard.setPret(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Disponibilitate(1/0): ");
                    snowboard.setDisponibilitate(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Brand: ");
                    snowboard.setBrand(scanner.nextLine());
                    System.out.println("Stil: ");
                    ((Snowboard) snowboard).setStil(scanner.nextLine());
                    System.out.println("Lungime: ");
                    ((Snowboard) snowboard).setLungime(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Latime: ");
                    ((Snowboard) snowboard).setLatime(scanner.nextInt());

                    produsRepository.add(snowboard);
                    break;
                case 9:
                    Produs accesoriu = new Accesoriu();
                    System.out.println("Introduceti datele accesoriului: ");
                    System.out.println("ID: ");
                    accesoriu.setProdus_id(scanner.nextInt());
                    scanner.nextLine();
                    accesoriu.setNume("accesoriu");
                    System.out.println("Pret: ");
                    accesoriu.setPret(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Disponibilitate(1/0): ");
                    accesoriu.setDisponibilitate(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Brand: ");
                    accesoriu.setBrand(scanner.nextLine());
                    System.out.println("Marime: ");
                    ((Accesoriu) accesoriu).setMarime(scanner.nextLine());
                    System.out.println("Culoare: ");
                    ((Accesoriu) accesoriu).setColor(scanner.nextLine());

                    produsRepository.add(accesoriu);
                    break;
                case 10:
                    Statiune statiune = new Statiune();
                    System.out.println("Introduceti datele statiunii: ");
                    System.out.println("ID: ");
                    statiune.setStatiune_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Nume: ");
                    statiune.setNume(scanner.nextLine());
                    System.out.println("Regiune: ");
                    statiune.setRegiune(scanner.nextLine());
                    System.out.println("Stat: ");
                    statiune.setStat(scanner.nextLine());

                    statiuneRepository.add(statiune);
                    break;
                case 11:
                    Tranzactie tranzactie = new Tranzactie();
                    System.out.println("Introduceti datele tranzactiei: ");
                    System.out.println("ID: ");
                    tranzactie.setTranzactie_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Client ID: ");
                    tranzactie.setClient_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Magazin ID: ");
                    tranzactie.setMagazin_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Metoda Plata: ");
                    tranzactie.setMetoda_plata(scanner.nextLine());
                    System.out.println("Status: ");
                    tranzactie.setStatus(scanner.nextLine());
                    tranzactie.setData(Date.valueOf(LocalDate.now()));
                    System.out.println("Data returnare: ");
                    tranzactie.setData_returnare(Date.valueOf(scanner.nextLine()));

                    tranzactieRepository.add(tranzactie);
                    break;
                case 12:
                    return;
                default:
                    break;
            }
        }
    }

    private void readMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            printRreadMenu();
            System.out.println("Choose option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    angajatRepository.getAll().forEach(System.out::println);
                    break;
                case 2:
                    clientRepository.getAll().forEach(System.out::println);
                    break;
                case 3:
                    importatorRepository.getAll().forEach(System.out::println);
                    break;
                case 4:
                    magazinRepository.getAll().forEach(System.out::println);
                    break;
                case 5:
                    partieRepository.getAll().forEach(System.out::println);
                    break;
                case 6:
                    produsRepository.getAll().forEach(System.out::println);
                    break;
                case 7:
                    produsRepository.getAll().forEach(System.out::println);
                    break;
                case 8:
                    produsRepository.getAll().forEach(System.out::println);
                    break;
                case 9:
                    produsRepository.getAll().forEach(System.out::println);
                    break;
                case 10:
                    statiuneRepository.getAll().forEach(System.out::println);
                    break;
                case 11:
                    tranzactieRepository.getAll().forEach(System.out::println);
                    break;
                case 12:
                    return;
                default:
                    break;
            }
        }
    }

    private void updateMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            printUpdateMenu();
            System.out.println("Choose option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Angajat angajat = new Angajat();
                    System.out.println("Introduceti datele angajatului: ");
                    System.out.println("ID: ");
                    angajat.setAngajat_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("ID Magazin: ");
                    angajat.setMagazin_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Nume: ");
                    angajat.setNume(scanner.nextLine());
                    System.out.println("Prenume: ");
                    angajat.setPrenume(scanner.nextLine());
                    System.out.println("CNP: ");
                    angajat.setCnp(scanner.nextLong());
                    scanner.nextLine();
                    System.out.println("Salariu: ");
                    angajat.setSalariu(scanner.nextLong());
                    scanner.nextLine();
                    System.out.println("Numar Telefon: ");
                    angajat.setNumar_telefon(scanner.nextLine());
                    angajatRepository.update(angajat);
                    break;
                case 2:
                    Client client = new Client();
                    System.out.println("Introduceti datele clientului: ");
                    System.out.println("ID: ");
                    client.setClient_id(scanner.nextInt());
                    scanner.nextLine();
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
                    clientRepository.update(client);
                    break;
                case 3:
                    Importator importator = new Importator();
                    System.out.println("Introduceti datele importatorului: ");
                    System.out.println("ID: ");
                    importator.setImportator_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Nume: ");
                    importator.setNume(scanner.nextLine());
                    System.out.println("Adresa: ");
                    importator.setAdresa_mail(scanner.nextLine());
                    System.out.println("Numar Contact: ");
                    importator.setNumar_contact(scanner.nextLine());
                    System.out.println("Metoda transport: ");
                    importator.setMetoda_transport(scanner.nextLine());
                    importatorRepository.update(importator);
                    break;
                case 4:
                    Magazin magazin = new Magazin();
                    System.out.println("Introduceti datele magazinului: ");
                    System.out.println("ID: ");
                    magazin.setMagazin_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Statiune ID: ");
                    magazin.setStatiune_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Numar contact: ");
                    magazin.setNumar_contact(scanner.nextLine());
                    System.out.println("Adresa Mail: ");
                    magazin.setAdresa_mail(scanner.nextLine());
                    magazinRepository.update(magazin);
                    break;
                case 5:
                    Partie partie = new Partie();
                    System.out.println("Introduceti datele partiei: ");
                    System.out.println("ID: ");
                    partie.setPartie_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Statiune ID: ");
                    partie.setStatiune_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Nume: ");
                    partie.setNume(scanner.nextLine());
                    System.out.println("Inaltime: ");
                    partie.setInaltime(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Lungime: ");
                    partie.setLungime(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Dificultate: ");
                    partie.setGrad_dificultate(scanner.nextLine());

                    partieRepository.update(partie);
                    break;
                case 6:
                    Produs perecheSchi = new PerecheSchi();
                    System.out.println("Introduceti datele perechii de schi: ");
                    System.out.println("ID: ");
                    perecheSchi.setProdus_id(scanner.nextInt());
                    scanner.nextLine();
                    perecheSchi.setNume("pereche schi");
                    System.out.println("Pret: ");
                    perecheSchi.setPret(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Disponibilitate(1/0): ");
                    perecheSchi.setDisponibilitate(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Brand: ");
                    perecheSchi.setBrand(scanner.nextLine());
                    System.out.println("Lungime: ");
                    ((PerecheSchi) perecheSchi).setLungime(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Flexibilitate: ");
                    ((PerecheSchi) perecheSchi).setFlexibilitate(scanner.nextLine());
                    System.out.println("Nivel Experienta: ");
                    ((PerecheSchi) perecheSchi).setNivel_experienta(scanner.nextLine());

                    produsRepository.update(perecheSchi);
                    break;
                case 7:
                    Produs perechePatine = new PerechePatine();
                    System.out.println("Introduceti datele perechii de patine: ");
                    System.out.println("ID: ");
                    perechePatine.setProdus_id(scanner.nextInt());
                    scanner.nextLine();
                    perechePatine.setNume("pereche patine");
                    System.out.println("Pret: ");
                    perechePatine.setPret(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Disponibilitate(1/0): ");
                    perechePatine.setDisponibilitate(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Brand: ");
                    perechePatine.setBrand(scanner.nextLine());
                    System.out.println("Marime: ");
                    ((PerechePatine) perechePatine).setMarime(scanner.nextFloat());
                    scanner.nextLine();
                    System.out.println("Material: ");
                    ((PerechePatine) perechePatine).setMaterial(scanner.nextLine());
                    System.out.println("Tip: ");
                    ((PerechePatine) perechePatine).setTip(scanner.nextLine());

                    produsRepository.update(perechePatine);
                    break;
                case 8:
                    Produs snowboard = new Snowboard();
                    System.out.println("Introduceti datele snowboard-ului: ");
                    System.out.println("ID: ");
                    snowboard.setProdus_id(scanner.nextInt());
                    scanner.nextLine();
                    snowboard.setNume("snow-board");
                    System.out.println("Pret: ");
                    snowboard.setPret(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Disponibilitate(1/0): ");
                    snowboard.setDisponibilitate(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Brand: ");
                    snowboard.setBrand(scanner.nextLine());
                    System.out.println("Stil: ");
                    ((Snowboard) snowboard).setStil(scanner.nextLine());
                    System.out.println("Lungime: ");
                    ((Snowboard) snowboard).setLungime(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Latime: ");
                    ((Snowboard) snowboard).setLatime(scanner.nextInt());

                    produsRepository.update(snowboard);
                    break;
                case 9:
                    Produs accesoriu = new Accesoriu();
                    System.out.println("Introduceti datele accesoriului: ");
                    System.out.println("ID: ");
                    accesoriu.setProdus_id(scanner.nextInt());
                    scanner.nextLine();
                    accesoriu.setNume("accesoriu");
                    System.out.println("Pret: ");
                    accesoriu.setPret(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Disponibilitate(1/0): ");
                    accesoriu.setDisponibilitate(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Brand: ");
                    accesoriu.setBrand(scanner.nextLine());
                    System.out.println("Marime: ");
                    ((Accesoriu) accesoriu).setMarime(scanner.nextLine());
                    System.out.println("Culoare: ");
                    ((Accesoriu) accesoriu).setColor(scanner.nextLine());

                    produsRepository.update(accesoriu);
                    break;
                case 10:
                    Statiune statiune = new Statiune();
                    System.out.println("Introduceti datele statiunii: ");
                    System.out.println("ID: ");
                    statiune.setStatiune_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Nume: ");
                    statiune.setNume(scanner.nextLine());
                    System.out.println("Regiune: ");
                    statiune.setRegiune(scanner.nextLine());
                    System.out.println("Stat: ");
                    statiune.setStat(scanner.nextLine());

                    statiuneRepository.update(statiune);
                    break;
                case 11:
                    Tranzactie tranzactie = new Tranzactie();
                    System.out.println("Introduceti datele tranzactiei: ");
                    System.out.println("ID: ");
                    tranzactie.setTranzactie_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Client ID: ");
                    tranzactie.setClient_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Magazin ID: ");
                    tranzactie.setMagazin_id(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Metoda Plata: ");
                    tranzactie.setMetoda_plata(scanner.nextLine());
                    System.out.println("Status: ");
                    tranzactie.setStatus(scanner.nextLine());
                    tranzactie.setData(Date.valueOf(LocalDate.now()));
                    System.out.println("Data returnare: ");
                    tranzactie.setData_returnare(Date.valueOf(scanner.nextLine()));

                    tranzactieRepository.update(tranzactie);
                    break;
                case 12:
                    return;
                default:
                    break;
            }
        }
    }

    private void deleteMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            printDeleteMenu();
            System.out.println("Choose option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Introduceti ID-ul angajatului pe care doriti sa il stergeti: ");
                    angajatRepository.delete(angajatRepository.get(scanner.nextInt()));
                    break;
                case 2:
                    System.out.println("Introduceti ID-ul clientului pe care doriti sa il stergeti: ");
                    clientRepository.delete(clientRepository.get(scanner.nextInt()));
                    break;
                case 3:
                    System.out.println("Introduceti ID-ul importatorului pe care doriti sa il stergeti: ");
                    importatorRepository.delete(importatorRepository.get(scanner.nextInt()));
                    break;
                case 4:
                    System.out.println("Introduceti ID-ul magazinului pe care doriti sa il stergeti: ");
                    magazinRepository.delete(magazinRepository.get(scanner.nextInt()));
                    break;
                case 5:
                    System.out.println("Introduceti ID-ul partiei pe care doriti sa o stergeti: ");
                    partieRepository.delete(partieRepository.get(scanner.nextInt()));
                    break;
                case 6:
                    System.out.println("Introduceti ID-ul perechii de schi pe care doriti sa o stergeti: ");
                    produsRepository.delete(produsRepository.get(scanner.nextInt()));
                    break;
                case 7:
                    System.out.println("Introduceti ID-ul perechii de patine pe care doriti sa o stergeti: ");
                    produsRepository.delete(produsRepository.get(scanner.nextInt()));
                    break;
                case 8:
                    System.out.println("Introduceti ID-ul snowboard-ului pe care doriti sa il stergeti: ");
                    produsRepository.delete(produsRepository.get(scanner.nextInt()));
                    break;
                case 9:
                    System.out.println("Introduceti ID-ul accesoriului pe care doriti sa il stergeti: ");
                    produsRepository.delete(produsRepository.get(scanner.nextInt()));
                    break;
                case 10:
                    System.out.println("Introduceti ID-ul statiunii pe care doriti sa o stergeti: ");
                    statiuneRepository.delete(statiuneRepository.get(scanner.nextInt()));
                    break;
                case 11:
                    System.out.println("Introduceti ID-ul tranzactiei pe care doriti sa o stergeti: ");
                    tranzactieRepository.delete(tranzactieRepository.get(scanner.nextInt()));
                    break;
                case 12:
                    return;
                default:
                    break;
            }
        }
    }


}
