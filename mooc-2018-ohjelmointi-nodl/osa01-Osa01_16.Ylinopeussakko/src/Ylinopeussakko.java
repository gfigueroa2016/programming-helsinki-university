
import java.util.Scanner;

public class Ylinopeussakko {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Kerro nopeus");
        
        int nopeus = Integer.parseInt(lukija.nextLine());
        
        if (nopeus > 120){
            
            System.out.println("Kerro nopeus: " + nopeus + "\n\n"
                + "Ylinopeussakko!");
            
        } else {
            
            System.out.println("Kerro nopeus: " + nopeus);
            // Toteuta ohjelmasi tähän.
        
        }
        
    }
    
}
