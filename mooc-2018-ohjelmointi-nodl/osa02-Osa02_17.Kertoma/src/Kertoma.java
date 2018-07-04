import java.util.Scanner;

public class Kertoma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna luku: ");
        int startNumber = Integer.parseInt(lukija.nextLine());
        int i = 0;
        int kertoma = 1;
        while (true) {
            if (i < startNumber) {
                i++;
                kertoma *= i;
            } else {
                break;
            }
        }
        System.out.println("Kertoma on " + kertoma);
    }
}
