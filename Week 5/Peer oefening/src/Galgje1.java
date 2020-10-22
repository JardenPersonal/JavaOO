import java.util.Scanner;

public class Galgje1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String woord;


        do {
            System.out.print("Geef een woord (max 10 letters): ");
            woord = keyboard.nextLine();

        }
        while (woord.length() > 11 || woord.length() < 4);


        for (int i = 0; i < 21; i++) {
            System.out.println("\n");
        }


        System.out.print("Het te zoeken woord: ");
        for (int i = 0; i < woord.length() ; i++) {
            System.out.print(".");
        }

        System.out.print("\nDoe een gok: ");
        String gok = keyboard.next();

        for (int i = 1; i < 5; i++) {
            if (gok.equalsIgnoreCase(woord)) {
            System.out.print("Proficiat je hebt het woord geraden in " + i + " beurten");
            System.exit(0);
        }
            else if (!gok.equalsIgnoreCase(woord)) {
                System.out.print("Fout! Doe nog een gok: ");
                gok = keyboard.next();
            }
        }
    }
}
