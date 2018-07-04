
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

// Luokka (ohjelma) Puisevaa "perii" graafisen käyttöliittymän rakentamiseen
// tarvittavia ominaisuuksia Application-luokalta (ohjelmalta)
public class Puisevaa extends Application {

    // Käyttöliittymän käynnistäminen kutsuu metodia alla olevaa
    // metodia
    @Override
    public void start(Stage ikkuna) throws Exception {

        // luodaan 640 pikseliä leveä ja 480 pikseliä korkea alusta
        // piirtämiselle ja otetaan alustaan liittyvä piirtoväline
        // käyttöön
        Canvas piirtoalusta = new Canvas(640, 480);
        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();

        // kutsutaan piirtämiseen käytettävää metodia piirrä
        // -- metodiin tullaan toteuttamaan piirtotoiminnallisuus
        piirra(piirturi);

        // asetetaan käyttöliittymän osat paikalleen ja 
        // näytetään se käyttäjälle
        Pane ruutu = new Pane(piirtoalusta);
        Scene nakyma = new Scene(ruutu);

        ikkuna.setTitle("Niin hyvää puuta!");
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    // Ohjelma käynnistetään metodilla public static void main. 
    // Metodissa kutsutaan Application luokalta perittyä toiminnallisuutta, 
    // joka lopulta suorittaa yllä kuvatun start-metodin
    public static void main(String[] args) {
        launch(Puisevaa.class);
    }

    // Oma piirra-metodimme, jonne toteutetaan piirtotoiminnallisuus
    public static void piirra(GraphicsContext piirturi) {

        int i = 0;
        int palitoX = 106;
        int circuloX = 40;
        int palitoXTotal = 0;
        int circuloXTotal = 0;

        while (i < 5) {

            i++;
            piirturi.strokeRect(palitoXTotal = palitoXTotal + palitoX, 200, 0, 220);
            piirturi.strokeOval(circuloXTotal = palitoXTotal - circuloX, 120, 80, 
                    80);
            
        }
        
        piirturi.strokeRect(0, 400, 640, 0);
        piirturi.strokeRect(0, 400, 0, 80);
        piirturi.strokeRect(640, 400, 0, 80);
        
    }

}
