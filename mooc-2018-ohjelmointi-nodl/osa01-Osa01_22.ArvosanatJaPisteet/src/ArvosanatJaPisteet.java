
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        System.out.println("Enter score [0-100]: ");

        int arvosana = Integer.parseInt(lukija.nextLine());

        if (arvosana >= 0 && arvosana <= 69) {

            System.out.println("\n\nArvosana: hylätty");

        } else if (arvosana >= 70 && arvosana <= 75) {

            System.out.println("\n\nArvosana: 1");

        } else if (arvosana >= 76 && arvosana <= 80) {

            System.out.println("\n\nArvosana: 2");

        } else if (arvosana >= 81 && arvosana <= 85) {

            System.out.println("\n\nArvosana: 3");

        } else if (arvosana >= 86 && arvosana <= 90) {

            System.out.println("\n\nArvosana: 4");

        } else if (arvosana >= 91 && arvosana <= 100) {

            System.out.println("\n\nArvosana: 5");

        } else if (arvosana > 100) {

            System.out.println("\n\nArvosana: uskomatonta!");

        } else {

            System.out.println("\n\nArvosana: mahdotonta!");

        }

    }
    
}
