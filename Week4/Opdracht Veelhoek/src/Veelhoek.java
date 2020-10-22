import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Veelhoek {

    public static void main(String[] args) {

        RechthoekigeDriehoek driehoek = new RechthoekigeDriehoek();

        Rechthoek rechthoek = new Rechthoek();

        Scanner keyboard = new Scanner(System.in);

        //DRIEHOEK

        //Basis setten
        System.out.println("Geef de basis van de driehoek: ");
        int basis = keyboard.nextInt();
        driehoek.setBasis(basis);

        //Hoogte setten
        System.out.println("Geef de hoogte van de driehoek: ");
        int hoogte = keyboard.nextInt();
        driehoek.setHoogte(hoogte);

        //Resultaat
        System.out.println("\nDriehoek");
        System.out.println("Omtrek: " + driehoek.omtrek());
        System.out.println("Oppervlakte: " + driehoek.oppervlakte());


        //RECHTHOEK

        //Breedte setten
        System.out.println("\nGeef de breedte van de rechthoek: ");
        int breedte = keyboard.nextInt();
        rechthoek.setBreedte(breedte);

        //Hoogte setten
        System.out.println("Geef de hoogte van de rechthoek: ");
        int hoogteRechthoek = keyboard.nextInt();
        rechthoek.setHoogte(hoogteRechthoek);

        //Resultaat
        System.out.println("\nRechthoek");
        System.out.println("Omtrek: " + rechthoek.omtrek());
        System.out.println("Oppervlakte: " + rechthoek.oppervlakte());

        //OVERZICHT
        System.out.println("\nOverzicht: Rechthoek " + rechthoek.getBreedte() + "x" + rechthoek.getHoogte() + "    Driehoek b" + driehoek.getBasis() + " h" + driehoek.getHoogte());

        //Printf testje
        //System.out.printf("%s %d %s %d %-5s %d %-1s %d", "Overzicht: Rechthoek ",rechthoek.getBreedte(),"x",rechthoek.getHoogte(),"Driehoek b",driehoek.getBasis(),"h",driehoek.getHoogte());


    }
}



