package Giris;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sinir, i;
        System.out.println("Bir Sınır Belirleyin: ");
        sinir = scanner.nextInt();

        for(i = 1; i <= sinir; i *= 4){

            System.out.println(i);

        }

        System.out.println("------------------");

        for(i = 1; i <= sinir; i *= 5){

            System.out.println(i);

        }
    }
}
