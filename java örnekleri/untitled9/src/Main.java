import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("derece:");
        int derece = scan.nextInt();
        if (derece<5){
            System.out.println("kızak");
            
        } else if (derece>=5 && derece<25) {
            System.out.println("sinema");
            
        } else if (derece>=25 && derece<40) {
            System.out.println("yüzme");
        }


    }
}