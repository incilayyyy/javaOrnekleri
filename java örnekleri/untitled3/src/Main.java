import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.kenarı giriniz:");
        double kenar1= scan.nextDouble();
        System.out.println("2.kenarı giriniz:");
        double kenar2= scan.nextDouble();
        double kenar3=  Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println(kenar3);

    }
}