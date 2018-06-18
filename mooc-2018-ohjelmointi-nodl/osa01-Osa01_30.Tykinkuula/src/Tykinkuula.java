
import java.util.Scanner;

public class Tykinkuula {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        
        double maksimikorkeus = 0;
        double korkeuskorkeus = 0;
        int i = 0;
        
        System.out.println("Syötä tykinkuulan lähtönopeus:");
        double simikorkeus = Double.parseDouble(lukija.nextLine());
        
        System.out.println("Syötä painovoima:");
        double painovoima = Double.parseDouble(lukija.nextLine());
        System.out.println("");
        
        while (true){
            
            System.out.println(i + "\t" + korkeuskorkeus + "\t" 
                    + simikorkeus);
            
            korkeuskorkeus = korkeuskorkeus + simikorkeus;
            
            if (korkeuskorkeus > maksimikorkeus){
                
                maksimikorkeus = korkeuskorkeus;
                
            }
            
            simikorkeus = simikorkeus -
                    painovoima;
            
            if (i > 8) {
                
                break;
                
            }
            
            i = i + 1;
            
        }
        
        System.out.println("\n" + "Tykinkuulan suurin korkeus oli " 
                + maksimikorkeus);
        
    }
    
}
