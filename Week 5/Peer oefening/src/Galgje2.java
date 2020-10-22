import java.util.Arrays;
import java.util.Scanner;

public class Galgje2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String woord;

        do {
            System.out.print("Geef een woord (max 10 letters): ");
            woord = keyboard.nextLine();
        } while (woord.length() > 11 || woord.length() < 4);

        for (int i = 0; i < 21; i++) {
            System.out.println("\n");
        }

        StringBuilder sbGok = new StringBuilder();

        sbGok.append(".".repeat(woord.length()));

        System.out.print("Het te zoeken woord: " + sbGok);
        System.out.println("\nRaad een letter: ");
        char gok = keyboard.nextLine().charAt(0);
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < woord.length(); j++) {
                if (woord.charAt(j) == gok) {
                    sbGok.setCharAt(j, gok);
                }
            }
            if (sbGok.toString().equalsIgnoreCase(woord)) {
                System.out.println("Profictiat, je hebt het woord " + sbGok.toString() + " geraden in " + i + " beurten!");
                System.exit(0);
            } else if (!sbGok.toString().equalsIgnoreCase(woord)) {
                System.out.println("Het te zoeken woord: " + sbGok);
                System.out.print("Doe nog een gok: ");
                gok = keyboard.nextLine().charAt(0);
            }
        }
    }
}