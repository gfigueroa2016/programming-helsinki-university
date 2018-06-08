
public class SekunnitVuodessa {

    public static void main(String[] args) {

        // Tässä on hieman puolitiehen jäänyt versio vuoden sekunnit
        // laskevasta ohjelmasta. Korjaapa se!
        int paiviaVuodessa = 365;
        int tuntejaPaivassa = 0;
        int minuuttejaTunnissa = 0;
        int sekuntejaMinuutissa = 0;
        int sekuntejaVuodessa = paiviaVuodessa * tuntejaPaivassa;

        // Älä muuta alla olevaa tulostuslausetta (muokkaa vain yllä olevia muuttujia ja laskua)
        System.out.println("Vuodessa on " + sekuntejaVuodessa + " sekuntia.");
    }

}
