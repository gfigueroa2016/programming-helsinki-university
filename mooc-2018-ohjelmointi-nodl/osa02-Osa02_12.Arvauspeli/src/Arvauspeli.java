
import java.util.Scanner;

public class Arvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minäpä tiedän luvun väliltä 1-10,"  
                + "jota sinä et tiedä!");
        int arvattava = 7;
        //int arvattava = (int) (1 + Math.random() * 10);
        int i = 0;
        System.out.println("Arvaa luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        while(true){
            if (luku > 10 || luku < 1){
                System.out.println("Epäkelpo luku!");
            } else if (luku != arvattava){
                i++;
                System.out.println("Ei ollut!");
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
