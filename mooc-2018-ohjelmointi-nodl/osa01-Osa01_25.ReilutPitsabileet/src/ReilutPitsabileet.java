
import java.util.Scanner;

public class ReilutPitsabileet {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Montako osallistujaa? ");
        int participants = Integer.parseInt(lukija.nextLine());
        System.out.println("Montako pitsaa? ");
        int pizzaPies = Integer.parseInt(lukija.nextLine());
        System.out.println("Montako palaa per pitsa? ");
        int pizzaCuts = Integer.parseInt(lukija.nextLine());
        
        int pizzaPieces = pizzaCuts * pizzaPies;
        int pizzaLeftOvers = pizzaPieces %  participants;
        
        System.out.println("\n\nPaloja jää yli: " + pizzaLeftOvers);
        
    }
    
}
