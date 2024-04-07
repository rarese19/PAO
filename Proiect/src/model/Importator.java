package model;

public class Importator {
    private int importator_id;
    private String nume;
    private String adresa_mail;
    private String numar_contact;
    private String metoda_transport;

    public Importator() { }

    public Importator(int importator_id, String nume, String adresa_mail, String numar_contact,
                      String metoda_transport) {
        this.importator_id = importator_id;
        this.nume = nume;
        this.adresa_mail = adresa_mail;
        this.numar_contact = numar_contact;
        this.metoda_transport = metoda_transport;
    }

    public int getImportator_id() {
        return importator_id;
    }

    public void setImportator_id(int importator_id) {
        this.importator_id = importator_id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa_mail() {
        return adresa_mail;
    }

    public void setAdresa_mail(String adresa_mail) {
        this.adresa_mail = adresa_mail;
    }

    public String getNumar_contact() {
        return numar_contact;
    }

    public void setNumar_contact(String numar_contact) {
        this.numar_contact = numar_contact;
    }

    public String getMetoda_transport() {
        return metoda_transport;
    }

    public void setMetoda_transport(String metoda_transport) {
        this.metoda_transport = metoda_transport;
    }

    @Override
    public String toString() {
        return "Importator{" +
                "importator_id=" + importator_id +
                ", nume='" + nume + '\'' +
                ", adresa_mail='" + adresa_mail + '\'' +
                ", numar_contact='" + numar_contact + '\'' +
                ", metoda_transport='" + metoda_transport + '\'' +
                '}';
    }
}
