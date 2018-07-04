
import java.util.Scanner;

public class TyontekijanElakevakuutus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä bruttopalkka: ");
        int number = Integer.parseInt(lukija.nextLine());
        int employerTyelPayments = (int)(number * 0.18);
        System.out.println("Työnantaja maksaa TyEL-maksuja: " 
                + employerTyelPayments);
        int employeeCost = number + employerTyelPayments;
        System.out.println("Työntekijän kustannus työnantajalle vähintään: " 
                + employeeCost);
        System.out.print("\n");
        int employeePays = (int)(number * 0.06);
        System.out.println("Työntekijä maksaa TyEL-maksuja: " + employeePays);
        int employeeSalary = number - employeePays;
        System.out.println("Työntekijän palkka TyEL-maksun jälkeen: " 
                + employeeSalary);
        System.out.print("\n");
        int tyelTotal = employerTyelPayments + employeePays;
        System.out.println("TyEL-kulut yhteensä: " + tyelTotal);
    }
}