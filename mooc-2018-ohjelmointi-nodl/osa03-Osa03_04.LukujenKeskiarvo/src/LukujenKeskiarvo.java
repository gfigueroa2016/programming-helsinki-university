
public class LukujenKeskiarvo {
    
    
    public static int summa(int luku1, int luku2, int luku3, int luku4) {
        return luku1 + luku2 + luku3 + luku4;
    }
    
    public static double keskiarvo(int luku1, int luku2, int luku3, int luku4) {
        int[] array = new int[4];
        array[0] = luku1;
        array[1] = luku2;
        array[2] = luku3;
        array[3] = luku4;
        double summaAll = summa(luku1, luku2, luku3, luku4);
        double count = 0;
        for (int i = 0; i <= array.length; i++){
            count = i;
        }
        return summaAll / count;
    }
    public static void main(String[] args) {
        double vastaus = keskiarvo(4, 3, 6, 1);
        System.out.println("Keskiarvo: " + vastaus);
    }
}
