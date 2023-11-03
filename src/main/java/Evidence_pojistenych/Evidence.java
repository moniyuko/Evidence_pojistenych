package Evidence_pojistenych;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Třída reprezentující evidenci pojištěných
 */
public class Evidence {

    /**
     * Scanner
     */
    Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

    /**
     * Databáze
     */
    private Databaze databaze;

    /**
     * Konstruktor
     */
    public Evidence() {
        databaze = new Databaze();
    }

    /**
     * Vypíše všechny pojištěné osoby v databázi
     */
    public void vypisVsechnyPojistene() {
        System.out.println(databaze.vypisVsechnyPojistene());
        System.out.println("Pokračujte libovolnou klávesou...");
        scanner.nextLine();
    }

    /**
     * Vyhledá pojištěné podle jména a příjmení
     */
    public void vyhledejPojisteneho() {
        System.out.println("Zadejte jméno pojištěného: ");
        String jmeno = scanner.nextLine().trim();
        System.out.println("Zadejte příjmení pojištěného: ");
        String prijmeni = scanner.nextLine().trim();
        ArrayList<Pojisteny> pojisteni = databaze.vyhledejPojisteneho(jmeno, prijmeni);
        if (pojisteni.size() > 0) {
            System.out.println("\nNalezen tento pojištěný: ");
            for (Pojisteny pojisteny : pojisteni) {
                System.out.println(pojisteny);
            }
        } else {
            System.out.println("Nebyli nalezeni žádní pojištění.");
        }
        System.out.println("\nPokračujte libovolnou klávesou...");
        scanner.nextLine();
    }

    /**
     * Přidá nového pojištěného ze vstupu do databáze
     */
    public void pridejPojisteneho() {
        System.out.println("Zadejte jméno pojištěného: ");
        String jmeno = scanner.nextLine().trim();
        System.out.println("Zadejte příjmení pojištěného: ");
        String prijmeni = scanner.nextLine().trim();
        System.out.println("Zadejte věk pojištěného: ");
        int vek = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Zadejte telefonní číslo pojištěného: ");
        String telefonniCislo = scanner.nextLine().trim();
        databaze.pridejPojisteneho(jmeno, prijmeni, vek, telefonniCislo);
        System.out.println("\nData byla uložena. Pokračujte libovolnou klávesou...");
        scanner.nextLine();
    }

    /**
     * Vymaže pojištěného podle jména a příjmení
     */
    public void vymazPojisteneho() {
        System.out.println("Bude vymazán pojištěný");
        System.out.println("Zadejte jméno pojištěného: ");
        String jmeno = scanner.nextLine().trim();
        System.out.println("Zadejte příjmení pojištěného: ");
        String prijmeni = scanner.nextLine().trim();
        databaze.vymazPojisteneho(jmeno, prijmeni);
        System.out.println("\nPojištěný byl vymazán. Pokračujte libovolnou klávesou...");
        scanner.nextLine();
    }

    /**
     * Vypíše úvodní obrazovku
     */
    public void vypisUvodniObrazovku() {
        System.out.println();
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("-----------------------------");
    }
}
