
import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna vuosi: ");
        int year = Integer.parseInt(lukija.nextLine());
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println("Vuosi ei ole karkausvuosi.");
        } else {
            System.out.println("Vuosi on karkausvuosi.");
        }
        /*if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Vuosi on karkausvuosi.");
        } else {
            System.out.println("Vuosi ei ole karkausvuosi.");
        }*/
    }
}
