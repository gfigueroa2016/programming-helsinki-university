
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Ensimmäinen: ");
        int startNumber = Integer.parseInt(lukija.nextLine());
        System.out.print("Viimeinen: ");
        int lastNumber = Integer.parseInt(lukija.nextLine());
        int summa = 0;
        while (true) {
            if (startNumber <= lastNumber) {
                summa += startNumber;
                startNumber++;
            } else {
                break;
            }
        }
        System.out.println("Summa on " + summa);
    }
}
