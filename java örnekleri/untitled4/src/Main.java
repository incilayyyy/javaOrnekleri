import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("boyunuzu metre cinsinden giriniz:");
        double boy = scan.nextDouble();
        System.out.println("kilonuzu giriniz:");
        double kilo = scan.nextDouble();
        double indeks = kilo / (boy * boy);
        System.out.println("vücut kitle indeksiniz :" + indeks);

    }
}









