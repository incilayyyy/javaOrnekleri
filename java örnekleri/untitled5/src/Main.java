import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salatalik = 3.50;
        double kabak = 5.25;
        double domates = 3.00;
        double biber = 3.75;
        double patlican = 5.50;
        System.out.println("salatalık kaç kilo:");
        double SalatalikKilo = scan.nextDouble();
        System.out.println("kabak kaç kilo:");
        double KabakKilo = scan.nextDouble();
        System.out.println("domates kaç kilo:");
        double DomatesKilo = scan.nextDouble();
        System.out.println("biber kaç kilo:");
        double BiberKilo = scan.nextDouble();
        System.out.println("patlican kaç kilo:");
        double PatlicanKilo = scan.nextDouble();
        double toplam = (salatalik * SalatalikKilo) + (kabak * KabakKilo) + (domates * DomatesKilo) + (biber * BiberKilo) + (patlican * PatlicanKilo);
        System.out.println(toplam);








    }
}