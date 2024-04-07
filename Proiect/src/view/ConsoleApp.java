package view;

import persistence.*;

public class ConsoleApp {
    private static ConsoleApp instance = null;
    StatiuneRepository statiuneRepository;
    AngajatRepository angajatRepository;
    PartieRepository partieRepository;
    MagazinRepository magazinRepository;
    ImportatorRepository importatorRepository;
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


    }

    public static ConsoleApp getInstance() {
        if (instance == null) {
            instance = new ConsoleApp();
        }
        return instance;
    }

    public void run() {
        System.out.println("Hello, world!");
        System.out.println(angajatRepository.getAll());
    }



}
