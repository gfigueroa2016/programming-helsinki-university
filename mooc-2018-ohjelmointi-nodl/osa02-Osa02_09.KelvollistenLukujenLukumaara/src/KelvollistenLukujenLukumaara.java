
import java.util.Scanner;

public class KelvollistenLukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        int i = 0;
        while (luku != 9999){
            if (luku > 20){
                i--;
                System.out.println("Kelvoton luku");
            } else if (luku < -140){
                i--;
                System.out.println("Kelvoton luku");
            }
            i++;
            System.out.println("Syötä luku: ");
            luku = Integer.parseInt(lukija.nextLine());
        }
        System.out.println("Kelvollisia lukuja yhteensä: " 
                        + i);
    }
}
