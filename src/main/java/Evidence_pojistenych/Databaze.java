package Evidence_pojistenych;

import java.util.ArrayList;

/**
 * Třída reprezentující databázi
 */
public class Databaze {

    /**
     * Kolekce s pojištěnými osobami
     */
    private ArrayList<Pojisteny> pojisteni;

    /**
     * Konstruktor
     */
    public Databaze() {
        pojisteni = new ArrayList<>();
    }

    /**
     * Přidá pojištěného do databáze
     * @param jmeno jméno
     * @param prijmeni příjmení
     * @param vek věk
     * @param telefonniCislo telefonní číslo
     */
    public void pridejPojisteneho(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        pojisteni.add(new Pojisteny(jmeno, prijmeni, vek, telefonniCislo));
    }

    /**
     * Vypíše všechny pojištěné v databázi
     * @return všechny pojištěné osoby
     */
    public String vypisVsechnyPojistene() {
        String vystup = "";
        for (Pojisteny pojisteny : pojisteni) {
            vystup += pojisteny + "\n";
        }
        return vystup;
    }

    /**
     * Vyhledá pojištěného podle jména a příjmení
     * @param jmeno jméno
     * @param prijmeni příjméní
     * @return nalezené pojištěné osoby
     */
    public ArrayList<Pojisteny> vyhledejPojisteneho(String jmeno, String prijmeni) {
        ArrayList<Pojisteny> nalezeni = new ArrayList<>();
        for(Pojisteny pojisteny : pojisteni) {
            if (pojisteny.getJmeno().equals(jmeno) && pojisteny.getPrijmeni().equals(prijmeni)) {
                nalezeni.add(pojisteny);
            }
        }
        return nalezeni;
    }

    /**
     * Vymaže pojištěného, pokud se shoduje jméno a příjmení
     * @param jmeno jméno
     * @param prijmeni příjmení
     */
    public void vymazPojisteneho(String jmeno, String prijmeni) {
        ArrayList<Pojisteny> nalezeni = vyhledejPojisteneho(jmeno, prijmeni);
        for (Pojisteny pojisteny : nalezeni) {
            pojisteni.remove(pojisteny);
        }
    }
}
