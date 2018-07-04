
public class Tulostelua {

    public static void tulostaTahtia(int maara) {
        for (int i = 0; i < maara; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        for (int i = 0; i < sivunpituus; i++){
            tulostaTahtia(sivunpituus);
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        for (int i = 0; i < korkeus; i++){
            tulostaTahtia(leveys);
        }
    }

    public static void tulostaKolmio(int koko) {
        int j = 0;
        for (int i = 0; i < koko; i++){
            j++;
            tulostaTahtia(j);
        }
    }

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(5);
        tulostaTahtia(3);
        tulostaTahtia(9);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(17, 3);
        System.out.println("\n---");
        tulostaKolmio(4);
        System.out.println("\n---");
    }

}
