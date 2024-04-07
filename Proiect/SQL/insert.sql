INSERT INTO STATIUNE (statiune_id, regiune, stat, nume)
VALUES (nr_statiuni.NEXTVAL, 'Suceava', 'Romania', 'Gura Humorului');

INSERT INTO STATIUNE (statiune_id, regiune, stat, nume)
VALUES (nr_statiuni.NEXTVAL, 'Suceava', 'Romania', 'Vatra Dornei');

INSERT INTO STATIUNE (statiune_id, regiune, stat, nume)
VALUES (nr_statiuni.NEXTVAL, 'Suceava', 'Romania', 'Câmpulung Moldovenesc');

INSERT INTO STATIUNE (statiune_id, regiune, stat, nume)
VALUES (nr_statiuni.NEXTVAL, 'Suceava', 'Romania', 'Malini');

INSERT INTO STATIUNE (statiune_id, regiune, stat, nume)
VALUES (nr_statiuni.NEXTVAL, 'Brasov', 'Romania', 'Moieciu de Sus');

INSERT INTO STATIUNE (statiune_Id, regiune, stat, nume)
VALUES (nr_statiuni.NEXTVAL, 'Brasov', 'Romania', 'Poiana Brasov');

INSERT INTO STATIUNE (statiune_id, regiune, stat, nume)
VALUES (nr_statiuni.NEXTVAL, 'Arlberg', 'Austria', 'St Anton');

INSERT INTO STATIUNE (statiune_id, regiune, stat, nume)
VALUES (nr_statiuni.NEXTVAL, 'Zillertal', 'Austria', 'Mayrhofen');

INSERT INTO STATIUNE (statiune_id, regiune, stat, nume)
VALUES (nr_statiuni.NEXTVAL, 'Valea Paznaun', 'Austria', 'Ischgl');

INSERT INTO STATIUNE (statiune_id, regiune, stat, nume)
VALUES (nr_statiuni.NEXTVAL, 'Ron-Alpi', 'Franta', 'Chamonix');

INSERT INTO STATIUNE (statiune_id, regiune, stat, nume)
VALUES (nr_statiuni.NEXTVAL, 'Ron-Alpi', 'Franta', 'Val-d Isère');

INSERT INTO STATIUNE (statiune_id, regiune, stat, nume)
VALUES (nr_statiuni.NEXTVAL, 'Les Trois Vallées', 'Franta', 'Courchevel');

INSERT INTO STATIUNE (statiune_id, regiune, stat, nume)
VALUES (nr_statiuni.NEXTVAL, 'Bucovina', 'Ucraina', 'Bukovel');





INSERT INTO PARTIE (partie_id, statiune_id, nume, lungime, grad_dificultate)
VALUES (nr_partii.NEXTVAL, 1, 'Soimului', 2300, 'rosu');

INSERT INTO PARTIE (partie_id, statiune_id, nume, lungime, grad_dificultate)
VALUES (nr_partii.NEXTVAL, 2, 'Veverita', 1400, 'albastru');

INSERT INTO PARTIE (partie_id, statiune_id, nume, inaltime, lungime, grad_dificultate)
VALUES (nr_partii.NEXTVAL, 2, 'Partia Parc', 780, 2000, 'rosu');

INSERT INTO PARTIE (partie_id, statiune_id, nume, lungime, grad_dificultate)
VALUES (nr_partii.NEXTVAL, 3, 'Rarau', 2135, 'rosu');

INSERT INTO PARTIE (partie_id, statiune_id, nume, inaltime, lungime, grad_dificultate)
VALUES (nr_partii.NEXTVAL, 4, 'Partia Malini', 689, 1300, 'albastru');

INSERT INTO PARTIE (partie_id, statiune_id, nume, lungime, grad_dificultate)
VALUES (nr_partii.NEXTVAL, 6, 'Sulinar', 1000, 'rosu');

INSERT INTO PARTIE (partie_id, statiune_id, nume, inaltime, lungime, grad_dificultate)
VALUES (nr_partii.NEXTVAL, 6, 'Kanzel', 879, 2300, 'negru');

INSERT INTO PARTIE (partie_id, statiune_id, nume, inaltime, lungime, grad_dificultate)
VALUES (nr_partii.NEXTVAL, 7, 'Pettneu', 1800, 10700, 'rosu');

INSERT INTO PARTIE (partie_id, statiune_id, nume, inaltime, lungime, grad_dificultate)
VALUES (nr_partii.NEXTVAL, 12, 'Crystal', 1560, 9600, 'rosu');

INSERT INTO PARTIE (partie_id, statiune_id, nume, inaltime, lungime, grad_dificultate)
VALUES (nr_partii.NEXTVAL, 12, 'Diamond', 1100, 5760, 'albastru');

INSERT INTO PARTIE (partie_id, statiune_id, nume, inaltime, lungime, grad_dificultate)
VALUES (nr_partii.NEXTVAL, 13, 'Brotal', 1470, 11300, 'rosu');




INSERT INTO MAGAZIN (magazin_id, statiune_id, numar_contact, adresa_mail)
VALUES (nr_magazine.NEXTVAL, 1, '+40723537998', 'wsr.humor.c@gmail.com');

INSERT INTO MAGAZIN (magazin_id, statiune_id, numar_contact, adresa_mail)
VALUES (nr_magazine.NEXTVAL, 2, '+40727832698', 'wsr.vatra.c@gmail.com');

INSERT INTO MAGAZIN (magazin_id, statiune_id, numar_contact, adresa_mail)
VALUES (nr_magazine.NEXTVAL, 5, '+40763842745', 'wsr.moieciu.c@gmail.com');

INSERT INTO MAGAZIN (magazin_id, statiune_id, numar_contact, adresa_mail)
VALUES (nr_magazine.NEXTVAL, 10, '+33785556406', 'wsr.chamonix.c@gmail.com');

INSERT INTO MAGAZIN (magazin_id, statiune_id, numar_contact, adresa_mail)
VALUES (nr_magazine.NEXTVAL, 7, '+4306503412321', 'wsr.arlberg.c@gmail.com');

INSERT INTO MAGAZIN (magazin_id, statiune_id, numar_contact, adresa_mail)
VALUES (nr_magazine.NEXTVAL, 13, '+3800522560603', 'wsr.bukovel.c@gmail.com');

---

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 6, 'Petrovych', 'Olena', '3604070825', 3500, '+380836258733');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 1, 'Popescu', 'Ion', '880311412568', 4500, '+40753574297');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 1, 'Vasilescu', 'Maria', '2880311162562', 4000, '+40757815297');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 1, 'Ionescu', 'Andrei', '1940128161027', 5500, '+40748219634');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 1, 'Dumitrescu', 'Ana', '2940128028608', 4700, '+40745673665');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 1, 'Stanescu', 'Florin', '1941006021292', 4000, '+40757926430');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 1, 'Dragomir', 'Elena', '2951006028922', 3500, '+40749573627');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 2, 'Radu', 'Alexandru', '2951006028922', 3500, '+40749573627');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 1, 'Constantinescu', 'Gabriela', '2940201021086', 3500, '+40761234567');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 2, 'Mihai', 'Adrian', '1910606026773', 7500, '+40772345678');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 2, 'Marinescu', 'Laura', '6021126027752', 2500, '+40783456789');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 2, 'Popa', 'Paul', '5000302029568', 6000, '+40794567890');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 2, 'Gheorghe', 'Mihaela', '2971031028649', 8000, '+40705678901');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 2, 'Marin', 'Victor', '5012356236923', 9500, '+40716789012');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 2, 'Andrei', 'Cristina', '2653247653358', 4900, '+40727890123');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 3, 'Stefanescu', 'Mihai', '5030919085125', 5100, '+40738901234');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 3, 'Pop', 'Ioana', '6091275135782', 4440, '+40749012345');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 3, 'Munteanu', 'Florin', '5983135662348', 2500, '+40750123456');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 3, 'Diaconu', 'Roxana', '2935397548076', 5500, '+40761234567');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 3, 'Cojocaru', 'Gabriel', '5012357247824', 4000, '+40772345678');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 3, 'Manea', 'Elena', '2912674678896', 3700, '+40783456789');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 4, 'Stanciu', 'Florin', '5002351367734', 9000, '+40794567890');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 4, 'Martin', 'Sophie', '8971031029780', 8000, '+33931356340');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 4, 'Lefebvre', 'Alexandre', '5823563456234', 9500, '+33937920293');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 4, 'Dupont', 'Isabelle', '8234567852345', 7000, '+33934073245');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 4, 'Leroy', 'Charlotte', '9623573982238', 8500, '+33937427375');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 5, 'Franz', 'Weber', '3439067548328', 9500, '+4306819149462');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 5, 'Heidi', 'Müller', '5382348238234', 7000, '+4306802381842');

INSERT INTO ANGAJAT (angajat_id, magazin_id, nume, prenume, cnp, salariu, numar_telefon)
VALUES (id_angajati.NEXTVAL, 5, 'Klaus', 'Fischer', '3282513624679', 8500, '+4306807141008');






INSERT INTO CLIENT (client_id, nume, prenume, cnp, adresa_mail, numar_telefon)
VALUES (nr_clienti.NEXTVAL, 'Mihai', 'Elena', 6200128123456, 'elena.mihai@gmail.com', '+40701234567');

INSERT INTO CLIENT (client_id, nume, prenume, cnp, adresa_mail, numar_telefon)
VALUES (nr_clienti.NEXTVAL, 'Diaconu', 'Ion', 7390311123456, 'ion.diaconu@gmail.com', '+40723456789');

INSERT INTO CLIENT (client_id, nume, prenume, cnp, adresa_mail, numar_telefon)
VALUES (nr_clienti.NEXTVAL, 'Gheorghiu', 'Maria', 8400601123456, 'maria.gheorghiu@gmail.com', '+40734567890');

INSERT INTO CLIENT (client_id, nume, prenume, cnp, adresa_mail, numar_telefon)
VALUES (nr_clienti.NEXTVAL, 'Radu', 'Mihai', 9550105123456, 'mihai.radu@gmail.com', '+40745678901');

INSERT INTO CLIENT (client_id, nume, prenume, cnp, adresa_mail, numar_telefon)
VALUES (nr_clienti.NEXTVAL, 'Popescu', 'Maria', 0640525123456, 'maria.popescu@gmail.com', '+40756789012');

INSERT INTO CLIENT (client_id, nume, prenume, cnp, adresa_mail, numar_telefon)
VALUES (nr_clienti.NEXTVAL, 'Ionescu', 'Andrei', 1790523123456, 'andrei.ionescu@gmail.com', '+40767890123');

INSERT INTO CLIENT (client_id, nume, prenume, cnp, adresa_mail, numar_telefon)
VALUES (nr_clienti.NEXTVAL, 'Stan', 'Ana', 2820423123456, 'ana.stan@gmail.com', '+40778901234');

INSERT INTO CLIENT (client_id, nume, prenume, cnp, adresa_mail, numar_telefon)
VALUES (nr_clienti.NEXTVAL, 'Florea', 'Marian', 3970811123456, 'marian.florea@gmail.com', '+40789012345');

INSERT INTO CLIENT (client_id, nume, prenume, cnp, adresa_mail, numar_telefon)
VALUES (nr_clienti.NEXTVAL, 'Popa', 'Ioana', 4060916123456, 'ioana.popa@gmail.com', '+40790123456');

INSERT INTO CLIENT (client_id, nume, prenume, cnp, adresa_mail, numar_telefon)
VALUES (nr_clienti.NEXTVAL, 'Gheorghe', 'Mihai', 5190424123456, 'mihai.gheorghe@gmail.com', '+40701234567');

INSERT INTO CLIENT (client_id, nume, prenume, cnp, adresa_mail, numar_telefon)
VALUES (nr_clienti.NEXTVAL, 'Radulescu', 'Maria', 6280716123456, 'maria.radulescu@gmail.com', '+40723456789');

INSERT INTO CLIENT (client_id, nume, prenume, cnp, adresa_mail, numar_telefon)
VALUES (nr_clienti.NEXTVAL, 'Dumitru', 'Ion', 7390103123456, 'ion.dumitru@gmail.com', '+40734567890');

INSERT INTO CLIENT (client_id, nume, cnp, adresa_mail, numar_telefon)
VALUES (nr_clienti.NEXTVAL, 'Lefebvre', 4910909123456, 'jean.lefebvre@gmail.com', '+33612345678');

INSERT INTO CLIENT (client_id, nume, prenume, cnp, adresa_mail, numar_telefon)
VALUES (nr_clienti.NEXTVAL, 'Dubois', 'Pierre', 5000723123456, 'pierre.dubois@gmail.com', '+33723456789');

INSERT INTO CLIENT (client_id, nume, prenume, cnp, numar_telefon)
VALUES (nr_clienti.NEXTVAL, 'Martin', 'Sophie', 6140306123456, '+33834567890');




INSERT INTO IMPORTATOR (importator_id, nume, adresa_mail, numar_contact)
VALUES (id_importatori.NEXTVAL, 'Global Solutions', 'gs.client@gmail.com', '+40739576438');

INSERT INTO IMPORTATOR (importator_id, nume, adresa_mail, numar_contact, metoda_transport)
VALUES (id_importatori.NEXTVAL, 'Horizon Imports', 'horizon.client@gmail.com', '+40775834556', 'feroviar');

INSERT INTO IMPORTATOR (importator_id, nume, adresa_mail, numar_contact, metoda_transport)
VALUES (id_importatori.NEXTVAL, 'Nova International', 'novat.client@gmail.com', '+33221465400', 'aerian');

INSERT INTO IMPORTATOR (importator_id, nume, adresa_mail, numar_contact)
VALUES (id_importatori.NEXTVAL, 'Vertex Imports', 'vertex.client@gmail.com', '+40758908582');

INSERT INTO IMPORTATOR (importator_id, nume, adresa_mail, numar_contact, metoda_transport)
VALUES (id_importatori.NEXTVAL, 'Prime Importers', 'pit.client@gmail.com', '+43665018669', 'naval');




INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'casca', 50, 'Head');

INSERT INTO ACCESORIU (produs_id, marime, culoare)
VALUES (1, 'M', 'albastru');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'geaca', 250, 'Willard');

INSERT INTO ACCESORIU (produs_id, marime, culoare)
VALUES (2, 'L', 'verde');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'casca', 150, 'Volkl');

INSERT INTO ACCESORIU (produs_id, marime, culoare)
VALUES (3, 'S', 'rosu');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'pantaloni', 100, 'Willard');

INSERT INTO ACCESORIU (produs_id, marime, culoare)
VALUES (4, 'M', 'negru');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'clapari', 500, 'Head');

INSERT INTO ACCESORIU (produs_id, marime, culoare)
VALUES (5, 'L', 'verde');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'boots', 400, 'Salomon Scarlet');

INSERT INTO ACCESORIU (produs_id, marime, culoare)
VALUES (6, 'S', 'alb');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'pereche manusi', 50, 'Head');

INSERT INTO ACCESORIU (produs_id, marime, culoare)
VALUES (7, 'M', 'negru');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'bete schi', 100, 'Volkl');

INSERT INTO ACCESORIU (produs_id, marime, culoare)
VALUES (8, 'L', 'albastru');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'pereche schi', 800, 'Volkl');

INSERT INTO PERECHE_SCHI (produs_id, lungime, flexibilitate, nivel_experienta)
VALUES (9, 175, 'mediu', 'avansat');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'pereche schi', 650, 'Salomon Scarlet');

INSERT INTO PERECHE_SCHI (produs_id, lungime, flexibilitate, nivel_experienta)
VALUES (10, 160, 'flexibil', 'intermediar');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'pereche schi', 600, 'Head');

INSERT INTO PERECHE_SCHI (produs_id, lungime, flexibilitate, nivel_experienta)
VALUES (11, 170, 'mediu', 'avansat');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'pereche schi', 999, 'Volkl');

INSERT INTO PERECHE_SCHI (produs_id, lungime, flexibilitate, nivel_experienta)
VALUES (12, 180, 'mediu', 'avansat');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'pereche schi', 750, 'Nordica');

INSERT INTO PERECHE_SCHI (produs_id, lungime, flexibilitate, nivel_experienta)
VALUES (13, 180, 'rigid', 'incepator');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'snow-board', 750, 'Nordica');

INSERT INTO SNOW_BOARD (produs_id, stil, lungime, latime)
VALUES (14, 'alpin', 165, 23);

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'snow-board', 600, 'GNU');

INSERT INTO SNOW_BOARD (produs_id, stil, lungime, latime)
VALUES (15, 'freeride', 148, 21);

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'snow-board', 500, 'Salomon');

INSERT INTO SNOW_BOARD (produs_id, stil, lungime, latime)
VALUES (16, 'alpin', 165, 22);

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'snow-board', 900, 'Burton');

INSERT INTO SNOW_BOARD (produs_id, stil, lungime, latime)
VALUES (17, 'freestyle', 160, 24);

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'snow-board', 800, 'Nordica');

INSERT INTO SNOW_BOARD (produs_id, lungime, latime)
VALUES (18, 150, 20);

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'pereche patine', 150, 'Bauer');

INSERT INTO PERECHE_PATINE (produs_id, marime)
VALUES (19, 40);

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'pereche patine', 200, 'Jackson Ultima');

INSERT INTO PERECHE_PATINE (produs_id, marime, material, tip)
VALUES (20, 43.5, 'material textil', 'freestyle');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'pereche patine', 250, 'CCM');

INSERT INTO PERECHE_PATINE (produs_id, marime, tip)
VALUES (21, 39, 'artistic');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'pereche patine', 100, 'CCM');

INSERT INTO PERECHE_PATINE (produs_id, marime, material, tip)
VALUES (22, 45, 'piele sintetica', 'de hochei');

INSERT INTO PRODUS (produs_id, nume, pret, brand)
VALUES (nr_produse.NEXTVAL, 'pereche_patime', 300, 'Bauer');

INSERT INTO PERECHE_PATINE (produs_id, marime, material)
VALUES (23, 42.5, 'material textil');
-------------------------------------------------------------------------

--VATRA DORNEI_2_importatori_varietate
INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (1, 2, 2, 101, 10);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (2, 2, 8, 101, 25);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (3, 2, 10, 101, 25);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (4, 2, 17, 100, 20);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (5, 2, 20, 100, 7);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (6, 2, 22, 100, 7);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (7, 2, 21, 100, 7);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (8, 2, 3, 100, 45);



--GURA_HUMORULUI_1_importator_varietate
INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (9, 1, 4, 103, 10);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (10, 1, 8, 103, 25);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (11, 1, 11, 103, 25);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (12, 1, 15, 103, 20);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (13, 1, 21, 103, 7);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (14, 1, 23, 103, 7);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (15, 1, 19, 103, 7);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (16, 1, 1, 103, 45);


--MEICIU_1_importator_fara_schi_snow-board
INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (18, 3, 4, 101, 15);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (19, 3, 2, 101, 15);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (20, 3, 1, 101, 30);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (21, 3, 21, 101, 10);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (22, 3, 19, 101, 10);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (23, 3, 22, 101, 10);


--CHAMONIX_2_importatori_varietate
INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (24, 4, 7, 103, 150);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (25, 4, 6, 103, 50);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (26, 4, 5, 103, 50);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (27, 4, 9, 103, 50);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (28, 4, 17, 103, 50);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (29, 4, 8, 102, 50);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (30, 4, 1, 102, 150);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (31, 4, 21, 102, 20);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (32, 4, 20, 102, 20);


--ARLBERG_3_importatori_varietate
INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (33, 4, 7, 101, 150);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (34, 4, 6, 101, 50);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (35, 4, 5, 101, 50);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (36, 4, 9, 103, 50);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (37, 4, 17, 103, 50);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (38, 4, 8, 103, 50);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (39, 4, 1, 102, 150);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (40, 4, 21, 102, 20);

INSERT INTO MAGAZIN_PRODUS_IMPORTATOR (magazin_produs_importator_id, magazin_id, produs_id, importator_id, cantitate)
VALUES (41, 4, 20, 102, 20);


--TRANZACTII_MAGAZIN_CHAMONIX
INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 13, 4, to_date('20-06-2023', 'DD-MM-YYYY'));

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 13, 4, to_date('21-08-2023', 'DD-MM-YYYY'));

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 14, 4, to_date('02-08-2023', 'DD-MM-YYYY'));

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 14, 4, to_date('19-07-2023', 'DD-MM-YYYY'));

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 15, 4, to_date('17-06-2023', 'DD-MM-YYYY'));



--TRANZACTII_MAGAZIN_VATRA

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 1, 2, to_date('22-07-2023', 'DD-MM-YYYY'));

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 2, 2, to_date('23-06-2023', 'DD-MM-YYYY'));

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 3, 2, to_date('12-08-2023', 'DD-MM-YYYY'));

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 4, 2, to_date('21-08-2023', 'DD-MM-YYYY'));

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 5, 2, to_date('30-07-2023', 'DD-MM-YYYY'));

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 6, 2, to_date('02-06-2023', 'DD-MM-YYYY'));

--TRANZACTII_MAGAZIN_HUMOR

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 7, 1, to_date('03-06-2023', 'DD-MM-YYYY'));

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 8, 1, to_date('12-06-2023', 'DD-MM-YYYY'));

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 9, 1, to_date('22-06-2023', 'DD-MM-YYYY'));

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 10, 1, to_date('20-06-2023', 'DD-MM-YYYY'));

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 11, 1, to_date('12-07-2023', 'DD-MM-YYYY'));

INSERT INTO TRANZACTIE (tranzactie_id, client_id, magazin_id, data_returnare)
VALUES (id_tranzactii.NEXTVAL, 12, 1, to_date('29-06-2023', 'DD-MM-YYYY'));


--TRANZACTII_PRODUS
INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (1, 1, 7, 12);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (2, 1, 5, 5);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (3, 2, 8, 7);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (4, 2, 5, 6);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (5, 3, 21, 3);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (6, 4, 20, 2);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (7, 4, 1, 40);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (8, 5, 9, 13);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (9, 5, 7, 18);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (10, 6, 8, 4);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (11, 6, 2, 1);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (12, 6, 10, 6);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (13, 7, 17, 2);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (14, 7, 20, 3);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (15, 8, 3, 15);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (16, 9, 21, 4);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (17, 10, 2, 8);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (18, 10, 17, 6);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (19, 11, 20, 4);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (20, 11, 22, 5);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (21, 12, 1, 4);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (22, 13, 19, 3);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (23, 14, 23, 4);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (24, 14, 21, 5);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (25, 15, 11, 8);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (26, 16, 8, 10);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (27, 16, 4, 2);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (28, 17, 15, 2);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (29, 17, 19, 2);

INSERT INTO TRANZACTIE_PRODUS (tranzactie_produs_id, tranzactie_id, produs_id, cantitate)
VALUES (30, 17, 1, 5);