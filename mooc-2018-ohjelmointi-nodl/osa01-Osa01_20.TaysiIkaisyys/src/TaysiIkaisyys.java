
import java.util.Scanner;

public class TaysiIkaisyys {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Kuinka vanha olet? ");
        
        int age = Integer.parseInt(lukija.nextLine());
        
        if (age >= 18) {
            
            System.out.println("Kuinka vanha olet? " + age + "\n\n"
                + "Olet täysi-ikäinen!");
            
        } else {
            
            System.out.println("Kuinka vanha olet? " + age + "\n\n"
                + "Et ole täysi-ikäinen!");
            
        }
        // Toteuta ohjelmasi tähän. 
    }
}
