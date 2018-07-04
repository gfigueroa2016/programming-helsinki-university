
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luvut: ");
        int startNumber = Integer.parseInt(lukija.nextLine());
        int lukuja = 0;
        int summa = 0;
        double keskiarvo = 0;
        int parillisia = 0;
        int parittomia = 0;
        while (startNumber != -1) {
            lukuja++;
            summa += startNumber;
            if (startNumber % 2 == 0) {
                parillisia++;
            } else {
                parittomia++;
            }
            startNumber = Integer.parseInt(lukija.nextLine());
        }
        keskiarvo = (double)(summa) / (double)(lukuja);
        System.out.println("Kiitos ja näkemiin!" + "\n" + "Summa: " + 
                summa + "\n" + "Lukuja: " + lukuja + "\n" + "Keskiarvo: " + 
                keskiarvo + "\n" + "Parillisia: " + parillisia + "\n" + 
                        "Parittomia: " + parittomia);
    }
}
