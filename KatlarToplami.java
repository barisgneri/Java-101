package Giris;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int n;
        do {
            System.out.println("Bir sayı girin:");
            n = scanner.nextInt();
            if(n%4==0) {
                toplam +=n;
            }
        }
        while(n%2==0 && n>0);
        System.out.println("Dörtün katları toplamı : "+toplam);
    }
}

