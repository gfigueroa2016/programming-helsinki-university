
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        for (int i = 0; i < maara; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        for (int i = 0; i < maara; i++){
            System.out.print(" ");
        }
    }

    public static void tulostaKolmio(int koko) {
        int j = 0;
        int s = koko;
        for (int i = 0; i < koko; i++){
            s--;
            tulostaTyhjaa(s);
            j++;
            tulostaTahtia(j);
        }
    }

    public static void jouluKuusi(int korkeus) {
        int j = 0;
        int s = korkeus;
        for (int i = 0; i < korkeus; i++){
            s--;
            tulostaTyhjaa(s);
            j++;
            tulostaTahtia(j);
            j++;
        }
        korkeus--;
        korkeus--;
        tulostaTyhjaa(korkeus);
        tulostaTahtia(3);
        tulostaTyhjaa(korkeus);
        tulostaTahtia(3);
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(4);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
