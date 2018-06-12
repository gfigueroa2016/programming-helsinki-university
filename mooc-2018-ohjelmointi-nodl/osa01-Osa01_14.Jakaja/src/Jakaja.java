
import java.util.Scanner;

public class Jakaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ensimmäinen luku: ");
        int luku1 = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku: ");
        int luku2 = Integer.parseInt(lukija.nextLine());
        double jakolasku = (double)luku1 / (double)luku2;
        System.out.println("Jakolasku: " + luku1 + " / " + luku2 + " = " 
                + jakolasku);
        // Toteuta ohjelmasi tähän. Muista kysyä luvut käyttäjältä!
    }
}
