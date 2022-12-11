import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz:");
        int a = scan.nextInt();
        System.out.println("2. sayıyı giriniz:");
        int b = scan.nextInt();
        System.out.println("işlem seçiniz:");
        System.out.println("1.işlem toplama:");
        System.out.println("2. işlem çıkarma:");
        System.out.println("3. işlem çarpma:");
        System.out.println("4. işlem bölme");
        int islem= scan.nextInt();
        if (islem==1) {
            System.out.println("sonuç:" +(a+b));
        } else if (islem==2) {
            System.out.println("sonuç:"+(a-b));
        } else if (islem==3) {
            System.out.println("sonuç:"+(a*b));
        } else if (islem==4) {

        }if (b==0) {
            System.out.println("sayı sıfıra bölünemez");
        } else {
            System.out.println("sonuç:"+(a/b));

    }















    }
}