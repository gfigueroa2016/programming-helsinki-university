
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna ensimmäinen luku: ");
        int luku1 = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Anna toinen luku: ");
        int luku2 = Integer.parseInt(lukija.nextLine());

        if (luku1 < luku2) {

            System.out.println("\n\nSuurempi luku: " + luku2);

        } else if (luku1 > luku2) {

            System.out.println("\n\nSuurempi luku: " + luku1);

        } else {

            System.out.println("\n\nLuvut ovat yhtä suuret!");

        }

    }
    
}
