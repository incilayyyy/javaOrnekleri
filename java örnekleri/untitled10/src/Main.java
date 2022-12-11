import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz:");
        double a = scan.nextDouble();
        System.out.println("2. sayıyı giriniz:");
        double b = scan.nextDouble();
        System.out.println("3.sayıyı giriniz:");
        double c = scan.nextDouble();
        if (a>b && a>c){
            if (b>c){
                System.out.println("a>b>c");
            }
        } else {
            System.out.println("a<b<c");
        }  if (b>c && b>a){
            if (c>a){
              System.out.println("b>c>a");
            }
        } else {
            System.out.println("b<c<a");
        }
        if (c>a && c>b) {
            if (a > b) {
                System.out.println("c>a>b");
            }
        }else {
            System.out.println("c<a<b");
        }



    }
}