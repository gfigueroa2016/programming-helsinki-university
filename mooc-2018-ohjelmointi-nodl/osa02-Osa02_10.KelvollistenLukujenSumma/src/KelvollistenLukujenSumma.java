
import java.util.Scanner;

public class KelvollistenLukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        int summa = 0;
        while (luku != 9999){
            if (luku > 20){
                summa -= luku;
                System.out.println("Kelvoton luku");
            } else if (luku < -140){
                luku -= luku;
                System.out.println("Kelvoton luku");
            }
            summa += luku;;
            System.out.println("Syötä luku: ");
            luku = Integer.parseInt(lukija.nextLine());
        }
        System.out.println("Kelvollisten lukujen summa: " 
                        + summa);
    }
}
