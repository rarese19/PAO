CREATE TABLE STATIUNE (
                          statiune_id int,
                          regiune VARCHAR2(50),
                          stat VARCHAR2(50),
                          nume VARCHAR2(25) NOT NULL,
                          PRIMARY KEY (statiune_id)
);

CREATE TABLE PARTIE (
                        partie_id int,
                        statiune_id int,
                        nume VARCHAR2(20) NOT NULL,
                        inaltime NUMBER(4),
                        lungime NUMBER(5) NOT NULL,
                        grad_dificultate VARCHAR2(30) DEFAULT 'albastru' check (lower(grad_dificultate) in ('albastru','rosu','negru')),
                        PRIMARY KEY (partie_id),
                        FOREIGN KEY (statiune_id) REFERENCES STATIUNE (statiune_id)
);

CREATE TABLE MAGAZIN (
                         magazin_id int,
                         statiune_id int,
                         numar_contact VARCHAR2(25) NOT NULL,
                         adresa_mail VARCHAR2(40) DEFAULT 'wsr.contact@yahoo.com',
                         PRIMARY KEY (magazin_id),
                         FOREIGN KEY (statiune_id) REFERENCES STATIUNE (statiune_id)
);

CREATE TABLE CLIENT (
                        client_id int,
                        nume VARCHAR2(20) NOT NULL,
                        prenume VARCHAR2(30),
                        cnp NUMBER(13) NOT NULL,
                        adresa_mail VARCHAR2(30),
                        numar_telefon VARCHAR2(25) NOT NULL,
                        PRIMARY KEY (client_id)
);

CREATE TABLE ANGAJAT (
                         angajat_id int,
                         magazin_id int,
                         nume VARCHAR2(15) NOT NULL,
                         prenume VARCHAR2(30) NOT NULL,
                         cnp NUMBER(13) NOT NULL,
                         salariu NUMBER(6) NOT NULL,
                         numar_telefon VARCHAR2(25) NOT NULL,
                         PRIMARY KEY (angajat_id),
                         FOREIGN KEY (magazin_id) REFERENCES MAGAZIN (magazin_id)
);

CREATE TABLE IMPORTATOR (
                            importator_id int,
                            nume VARCHAR2(25) NOT NULL,
                            adresa_mail VARCHAR2(45) NOT NULL,
                            numar_contact VARCHAR2(25) NOT NULL,
                            metoda_transport VARCHAR2(20) DEFAULT 'rutier' check (lower(metoda_transport) in ('rutier', 'feroviar', 'aerian', 'naval')),
                            PRIMARY KEY (importator_id)
);

CREATE TABLE PRODUS (
                        produs_id int,
                        nume VARCHAR2(25) NOT NULL,
                        pret number(3) NOT NULL,
                        disponibilitate NUMBER(1) DEFAULT 1,
                        brand VARCHAR2(30) NOT NULL,
                        PRIMARY KEY (produs_id)
);

CREATE TABLE PERECHE_SCHI (
                              produs_id int,
                              lungime NUMBER(3) NOT NULL,
                              flexibilitate VARCHAR2(15) DEFAULT 'mediu' check (lower(flexibilitate) in ('rigid', 'mediu', 'flexibil')),
                              nivel_experienta VARCHAR2(15) DEFAULT 'incepator' check (lower(nivel_experienta) in ('incepator', 'intermediar', 'avansat')),
                              PRIMARY KEY (produs_id),
                              FOREIGN KEY (produs_id) REFERENCES PRODUS (produs_id)
);

CREATE TABLE SNOW_BOARD (
                            produs_id int,
                            stil VARCHAR2(15) DEFAULT 'freeride' check (lower(stil) in ('freestyle', 'alpin', 'freeride')),
                            lungime NUMBER(3) NOT NULL,
                            latime NUMBER(2) NOT NULL,
                            PRIMARY KEY (produs_id),
                            FOREIGN KEY (produs_id) REFERENCES PRODUS (produs_id)
);

CREATE TABLE PERECHE_PATINE (
                                produs_id int,
                                marime NUMBER(3,1) NOT NULL,
                                material VARCHAR2(30) DEFAULT 'piele naturala' check (lower(material) in ('piele naturala', 'piele sintetica', 'material textil')),
                                tip VARCHAR2(30) default 'freestyle' check (lower(tip) in ('artistic', 'de hochei', 'freestyle')),
                                PRIMARY KEY (produs_id),
                                FOREIGN KEY (produs_id) REFERENCES PRODUS (produs_id)
);

CREATE TABLE ACCESORIU (
                           produs_id int,
                           marime CHAR(1) DEFAULT 'S' check (upper(marime) in ('S', 'M', 'L')),
                           culoare VARCHAR2(15),
                           PRIMARY KEY (produs_id),
                           FOREIGN KEY (produs_id) REFERENCES PRODUS (produs_id)
);

CREATE TABLE TRANZACTIE (
                            tranzactie_id int,
                            client_id int,
                            magazin_id int,
                            metoda_plata VARCHAR2(25) DEFAULT 'cash' check (lower(metoda_plata) in ('cash', 'card')),
                            data date DEFAULT CURRENT_DATE,
                            data_returnare DATE NOT NULL,
                            status VARCHAR2(25) DEFAULT 'in derulare' check (lower(status) in ('in derulare', 'incheiata')),
                            PRIMARY KEY (tranzactie_id),
                            FOREIGN KEY (client_id) REFERENCES CLIENT (client_id),
                            FOREIGN KEY (magazin_id) REFERENCES MAGAZIN (magazin_id)
);


CREATE TABLE TRANZACTIE_PRODUS (
                                   tranzactie_produs_id int,
                                   tranzactie_id int,
                                   produs_id int,
                                   cantitate NUMBER(2) NOT NULL,
                                   CONSTRAINT pk_tranzactie_produs PRIMARY KEY (tranzactie_produs_id, tranzactie_id, produs_id),
                                   FOREIGN KEY (tranzactie_id) REFERENCES TRANZACTIE (tranzactie_id),
                                   FOREIGN KEY (produs_id) REFERENCES PRODUS (produs_id)
);

CREATE TABLE MAGAZIN_PRODUS_IMPORTATOR (
                                           magazin_produs_importator_id int,
                                           magazin_id int,
                                           produs_id int,
                                           importator_id int,
                                           cantitate NUMBER(3) NOT NULL,
                                           CONSTRAINT pk_magazin_produs_importator PRIMARY KEY (magazin_produs_importator_id, magazin_id, produs_id, importator_id),
                                           FOREIGN KEY (magazin_id) REFERENCES MAGAZIN (magazin_id),
                                           FOREIGN KEY (produs_id) REFERENCES PRODUS (produs_id),
                                           FOREIGN KEY (importator_id) REFERENCES IMPORTATOR (importator_id)
);

CREATE SEQUENCE nr_partii
    START WITH 1
    INCREMENT BY 1
    MINVALUE 0
    MAXVALUE 10000
    NOCYCLE;

CREATE SEQUENCE nr_produse
    START WITH 1
    INCREMENT BY 1
    MINVALUE 0
    MAXVALUE 10000
    NOCYCLE;

CREATE SEQUENCE nr_magazine
    START WITH 1
    INCREMENT BY 1
    MINVALUE 0
    MAXVALUE 1000
    NOCYCLE;

CREATE SEQUENCE nr_clienti
    START WITH 1
    INCREMENT BY 1
    MINVALUE 0
    MAXVALUE 100000
    NOCYCLE;

CREATE SEQUENCE id_importatori
    START WITH 100
    INCREMENT BY 1
    MINVALUE 99
    MAXVALUE 1000
    NOCYCLE;

CREATE SEQUENCE nr_statiuni
    START WITH 1
    INCREMENT BY 1
    MINVALUE 0
    MAXVALUE 1000
    NOCYCLE;

CREATE SEQUENCE id_angajati
    START WITH 1
    INCREMENT BY 1
    MINVALUE 0
    MAXVALUE 1000
    NOCYCLE;

CREATE SEQUENCE id_tranzactii
    START WITH 1
    INCREMENT BY 1
    MINVALUE 0
    MAXVALUE 10000
    NOCYCLE;