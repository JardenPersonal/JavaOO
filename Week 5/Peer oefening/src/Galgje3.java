import java.util.Scanner;

public class Galgje3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final String HANGMAN =
                "----- \n" +
                "|   | \n" +
                "|   O \n" +
                "|  /|\\\n" +
                "|   | \n" +
                "|  / \\\n" +
                "|     \n" +
                "-------";

        String woord;

        do {
            System.out.print("Geef een woord (max 10 letters): ");
            woord = keyboard.nextLine();
        } while (woord.length() > 11 || woord.length() < 4);

        for (int i = 0; i < 21; i++) {
            System.out.println("\n");
        }

        StringBuilder sbGok = new StringBuilder();

        //OR         sbGok.append(".".repeat(woord.length()));
        for (int i = 0; i < woord.length(); i++) {
            sbGok.append(".");
        }

        System.out.print("Het te zoeken woord: " + sbGok);
        System.out.print("\nRaad een letter: ");
        char gok = keyboard.nextLine().charAt(0);

        int positieHangman = 0;

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
                System.out.println("Het te zoeken woord: " + sbGok.toString());
                positieHangman+=7;
                String hangmanTonen = HANGMAN.substring(0,positieHangman);
                System.out.println(hangmanTonen);
                System.out.print("Doe nog een gok: ");
                gok = keyboard.nextLine().charAt(0);
            }
        }
    }
}
