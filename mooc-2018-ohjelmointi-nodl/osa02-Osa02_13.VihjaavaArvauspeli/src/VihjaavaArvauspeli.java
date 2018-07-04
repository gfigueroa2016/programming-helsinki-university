
import java.util.Scanner;

public class VihjaavaArvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kun olet palauttanut tehtävän ja saanut siitä pisteet,
        // kokeile myös seuraavaa: 
        // int arvattava = (int) (1 + Math.random() * 100);
        int arvattava = 42;
        System.out.println("Minäpä tiedän luvun väliltä 1-100, jota sinä et tiedä!");
        int i = 0;
        System.out.println("Arvaa luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        while(true){
            if (luku > 100 || luku < 1){
                System.out.println("Epäkelpo luku!");
            } else if (luku > arvattava){
                i++;
                System.out.println("Lukuni on pienempi!");
            }else if (luku < arvattava){
                i++;
                System.out.println("Lukuni on isompi!");
            } else {
                i++;
                break;
            }
            System.out.println("Arvaa luku: ");
            luku = Integer.parseInt(lukija.nextLine());
        }
        System.out.println("Oikein! Arvauksia yhteensä: " + i);
    }
}
