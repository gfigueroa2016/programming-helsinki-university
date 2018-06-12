
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna ensimmäinen luku: ");
        int luku1 = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Anna toinen luku: ");
        int luku2 = Integer.parseInt(lukija.nextLine());

        if (luku1 > luku2) {

            System.out.println("Anna ensimmäinen luku: " + luku1 + "\nAnna toinen luku: " + luku2 + "\n\n"
                + "Suurempi luku: " + luku1);

        } else if (luku1 < luku2) {

            System.out.println("Anna ensimmäinen luku: " + luku1 + "\nAnna toinen luku: " + luku2 + "\n\n"
                + "Suurempi luku: " + luku2);

        } else {

            System.out.println("Anna ensimmäinen luku: " + luku1 + "\nAnna toinen luku: " + luku2 + "\n\n"
                    + "Luvut ovat yhtä suuret!");

        }

    }
    
}
