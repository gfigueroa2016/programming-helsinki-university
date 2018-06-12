
import java.util.Scanner;

public class Wanha {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna vuosiluku: ");
        
        int vuosiluku = Integer.parseInt(lukija.nextLine());
        
        if (vuosiluku >= 2015){
            
            System.out.println("Anna vuosiluku: " + vuosiluku);
            
        } else {
            
            System.out.println("Anna vuosiluku: " + vuosiluku + "\n\n"
                + "Wanha!");
            
        }
        // Toteuta ohjelmasi tähän. 
    }
    
}
