
import java.util.Scanner;

public class JuupasEipas {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kirjoita ohjelma tänne
        System.out.println("Lue luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        while (true){
            if (luku > 0){
                System.out.println("Juupas");
                System.out.println("Lue luku: ");
                luku = Integer.parseInt(lukija.nextLine());
            } else if (luku < 0){
                System.out.println("Eipäs");
                System.out.println("Lue luku: ");
                luku = Integer.parseInt(lukija.nextLine());
            } else {
                break;
            }
        }
    }
}
