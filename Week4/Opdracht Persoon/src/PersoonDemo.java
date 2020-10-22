import java.util.Scanner;

public class PersoonDemo {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Persoon person = new Persoon();

        System.out.println("Wat is je naam? ");
        String naam  = keyboard.next();
        person.setNaam(naam);


        System.out.println("Wat is je leeftijd? ");
        int leeftijd = keyboard.nextInt();
        person.setLeeftijd(leeftijd);

        System.out.println("Hallo " + person.getNaam() + ", je bent " + person.getLeeftijd());

        person.setLeeftijd(56);
        System.out.println("Hallo " + person.getNaam() + ", je bent " + person.getLeeftijd());

        person.setNaam("Janos");
        System.out.println("Hallo " + person.getNaam() + ", je bent " + person.getLeeftijd());



    }
}
