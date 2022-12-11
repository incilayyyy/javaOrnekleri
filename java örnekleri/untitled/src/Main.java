import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int fizik,matematik,kimya,turkce,ortalama;
    System.out.println("fizik notunu giriniz:");
    fizik= input.nextInt();
    System.out.println( "matematik notunu giriniz:");
matematik=input.nextInt();
System.out.println( "kimya notunu giriniz:");
kimya= input.nextInt();
System.out.println( "turkce notunu giriniz:");
turkce= input.nextInt();
 ortalama= (matematik+fizik+kimya+turkce)/4;
System.out.println( "ortalamanız:" + ortalama);
















    }
}