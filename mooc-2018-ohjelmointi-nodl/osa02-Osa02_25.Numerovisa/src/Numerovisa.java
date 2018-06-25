
import java.util.Random;
import java.util.Scanner;

public class Numerovisa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvottuLuku = arvoLuku();

        // ÄLÄ MUOKKAA YLLÄOLEVIA ASIOITA -- OHJELMOI OHJELMASI ALLE
        
    }

    // ÄLÄ MUOKKAA METODIA arvoLuku
    private static int arvoLuku() {
        return new Random().nextInt(101);
    }
}
