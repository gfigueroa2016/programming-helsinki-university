
import java.util.Random;
import java.util.Scanner;

public class Numerovisa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvottuLuku = arvoLuku();
        System.out.println("Arvaa luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        int i = 0;
        while (luku != arvottuLuku) {
            if (luku < arvottuLuku) {
                i++;
                System.out.println("Luku on suurempi, tehtyjä arvauksia: " +
                        i);
            } else {
                i++;
                System.out.println("Luku on pienempi, tehtyjä arvauksia: " +
                        i);
            }
            System.out.println("Arvaa luku: ");
            luku = Integer.parseInt(lukija.nextLine());
        }
        System.out.println("Onneksi olkoon, oikein arvattu!");
        // ÄLÄ MUOKKAA YLLÄOLEVIA ASIOITA -- OHJELMOI OHJELMASI ALLE
        
    }

    // ÄLÄ MUOKKAA METODIA arvoLuku
    private static int arvoLuku() {
        return new Random().nextInt(101);
    }
}
