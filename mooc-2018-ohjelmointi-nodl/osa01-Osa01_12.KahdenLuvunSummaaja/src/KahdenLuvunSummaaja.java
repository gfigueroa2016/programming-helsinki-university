
import java.util.Scanner;

public class KahdenLuvunSummaaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ensimmäinen luku: ");
        int luku1 = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku: ");
        int luku2 = Integer.parseInt(lukija.nextLine());
        int summa = luku1 + luku2;
        System.out.println("Lukujen summa: " + summa);
        // Toteuta ohjelmasi tähän. Muista kysyä kaksi lukua käyttäjältä!
    }
}
