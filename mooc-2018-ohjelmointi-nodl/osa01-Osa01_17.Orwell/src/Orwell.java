
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna luku: ");
        
        int luku = Integer.parseInt(lukija.nextLine());
        
        if (luku != 1984){
            
            System.out.println("Anna luku: " + luku);
            
        } else {
            
            System.out.println("Anna luku: " + luku + "\n\n"
                + "Orwell");
            
        }
        // Toteuta ohjelmasi tähän. 
    }
    
}
