import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tutar = 0.0;
        double kdv = 18;
        double tutar2;
        System.out.println("tutar giriniz:");
        tutar= scan.nextDouble();
        double KdvliFiyat= tutar*(kdv/100);
        tutar2= tutar+ KdvliFiyat;
        System.out.println(tutar2);




    }
}