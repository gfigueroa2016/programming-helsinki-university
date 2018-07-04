
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ensimmäinen luku: ");
        int number1 = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku: ");
        int number2 = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna kolmas luku: ");
        int number3 = Integer.parseInt(lukija.nextLine());
        int summa = number1 + number2 + number3;

        // KIRJOITA OHJELMA TÄHÄN
        // ÄLÄ KÄYTÄ MUITA MUUTTUJIA KUIN lukija ja summa !
        System.out.println("Summa: " + summa);
    }
}
