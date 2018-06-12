
import java.util.Scanner;

public class PositiivinenLuku {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna luku: ");
        
        int luku = Integer.parseInt(lukija.nextLine());
        
        if (luku > 0) {
            
            System.out.println("Anna luku: " + luku + "\n\n"
                    + "Luku on positiivinen.");
            
        } else if (luku < 0) {
            
            System.out.println("Anna luku: " + luku + "\n\n"
                    + "Luku ei ole positiivinen.");
            
        } else {
            
            System.out.println("Anna luku: " + luku + "\n\n"
                + "Luku ei ole positiivinen.");
            
        }
        // Toteuta ohjelmasi tähän. 
    }
}
