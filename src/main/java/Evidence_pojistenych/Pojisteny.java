package Evidence_pojistenych;

/**
 * Třída reprezentující pojištěného
 */
public class Pojisteny {

    /**
     * Jméno pojištěného
     */
    private String jmeno;

    /**
     * Příjmení pojištěného
     */
    private String prijmeni;

    /**
     * Věk pojištěného
     */
    private int vek;

    /**
     * Telefonní číslo pojištěného
     */
    private String telefonniCislo;

    /**
     * Konstruktor
     * @param jmeno jméno
     * @param prijmeni příjmení
     * @param vek věk
     * @param telefonniCislo telefonní číslo
     */
    public Pojisteny(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    /**
     * Vrátí jméno pojištěného
     * @return jméno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * Vrátí příjmení pojištěného
     * @return příjmení
     */
    public String getPrijmeni() {
        return prijmeni;
    }


    /**
     * Vrátí jméno, příjmení, věk a telefonní číslo pojištěného
     * @return jméno, příjmení, věk, telefonní číslo
     */
    @Override
    public String toString() {
        return String.format("%s %s %d %s", jmeno, prijmeni, vek, telefonniCislo);
    }
}
