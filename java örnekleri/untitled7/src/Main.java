import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("km verisini veriniz:");
        double km = scan.nextDouble();
        double ucret =10+(km*2.10);
        System.out.println(ucret);
        ucret= (ucret<20.00)? 20.00 : ucret;
        System.out.println(ucret);

    }
}