
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna tunnus: ");
        String userInput = lukija.nextLine();
        System.out.print("Anna salasana: ");
        String passwordInput = lukija.nextLine();
        passVerify(userInput, passwordInput);
    }

    public static void passVerify(String user, String password) {
        if (user.equals("aleksi") && password.equals("tappara")
            || user.equals("elina") && password.equals("kissa")) {
            System.out.println("Olet kirjautunut järjestelmään");
        } else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }
    }
}
