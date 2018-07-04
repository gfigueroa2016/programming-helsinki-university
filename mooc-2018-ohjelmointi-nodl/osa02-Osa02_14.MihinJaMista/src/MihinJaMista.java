
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Mihin asti? ");
        int lastNumber = Integer.parseInt(lukija.nextLine());
        System.out.print("Mistä lähtien? ");
        int startNumber = Integer.parseInt(lukija.nextLine());
        while (true) {
            if (startNumber <= lastNumber) {
                System.out.println(startNumber);
                startNumber++;
            } else {
                break;
            }
        }
    }
}
