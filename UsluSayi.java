package Giris;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, us;
        System.out.println("Üssü Alınacak Sayı: ");
        sayi = input.nextInt();
        System.out.println("Üs Olacak Sayı: ");
        us = input.nextInt();

        int total = 1;

        for (int i = 1; i <= us; total *= sayi){
            i++;
        }
        System.out.println(total);
    }
}

