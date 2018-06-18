
import java.util.Scanner;

public class Summaaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int luettujaLukuja = 0;

        while (true) {
            System.out.print("Anna summattavia lukuja: ");
            int luettu = Integer.parseInt(lukija.nextLine());
            luettujaLukuja = summa;
            if (luettu == 0) {
                break;
            }

            summa += luettu;
        }

        System.out.println("Summa lopussa: " + luettujaLukuja);

    }
}
