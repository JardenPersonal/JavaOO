import java.util.Scanner;

public class Galgje1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String teRadenWoord;

        do{
            System.out.println("Geef een woord (max 10 letters): ");
            teRadenWoord=kb.nextLine();
        }while (teRadenWoord.length()>10 || teRadenWoord.length()<5);
        for (int i =0; i < 20; i++){
            System.out.println();
        }

//        int woordlengte = teRadenWoord.length();

        System.out.println("Het te zoeken woord: ");
        for (int i = 0; i < teRadenWoord.length(); i++) {
            System.out.println(".");
        }
        System.out.println("Doe een gok: ");
        String gok = kb.next();

        for (int i = 0; i < 5 ; i++) {
            if(gok.equalsIgnoreCase(teRadenWoord)){
                System.out.println("Proficiat, je hebt het woord geraden in " + i + " beurten");
                System.exit(0);
            }else if(!gok.equalsIgnoreCase(teRadenWoord)){
                System.out.println("Fout! Doe nog een gok: ");
                gok = kb.next();
            }
        }
    }
}
