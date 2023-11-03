package Evidence_pojistenych;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main_evidence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        Evidence evidence = new Evidence();

        //hlavní cyklus pro výběr akce
        String volba = "";
        while (!volba.equals("5")) {
            evidence.vypisUvodniObrazovku();
            System.out.println();
            System.out.println("Vyberte si akci: ");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojišteného");
            System.out.println("4 - Vymazat pojištěného");
            System.out.println("5 - Konec");
            volba = scanner.nextLine().trim();
            System.out.println();
            switch (volba) {
                case "1":
                    evidence.pridejPojisteneho();
                    break;
                case "2":
                    evidence.vypisVsechnyPojistene();
                    break;
                case "3":
                    evidence.vyhledejPojisteneho();
                    break;
                case "4":
                    evidence.vymazPojisteneho();
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                    break;
            }
        }
    }
}
