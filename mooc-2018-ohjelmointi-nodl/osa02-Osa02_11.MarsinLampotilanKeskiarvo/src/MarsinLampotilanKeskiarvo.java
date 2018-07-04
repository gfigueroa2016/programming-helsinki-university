
import java.util.Scanner;

public class MarsinLampotilanKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä mittaus: ");
        int luku = Integer.parseInt(lukija.nextLine());
        int summa = 0;
        int i = 0;
        double mean;
        while (luku != 9999){
            if (luku > 20){
                summa -= luku;
                i--;
            } else if (luku < -140){
                summa -= luku;
                i--;
            }
            summa += luku;
            i++;
            System.out.println("Syötä mittaus: ");
            luku = Integer.parseInt(lukija.nextLine());
        }
        mean = summa / i;
        System.out.println("Mittausten keskiarvo: " 
                        + mean);

    }
}
