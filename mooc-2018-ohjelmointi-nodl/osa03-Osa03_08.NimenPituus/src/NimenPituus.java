
import java.util.Scanner;

public class NimenPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna nimi: ");
        String name = lukija.nextLine();
        System.out.println("Kirjainmäärä: " + laskeKirjaimet(name));
    } 
    public static int laskeKirjaimet(String nameInput){
        int nameLength = nameInput.length();
        return nameLength;  
    }
}
