package Giris;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        int k, ort;
        int toplam =0 , n=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Giriniz:");
        k = input.nextInt();

        for (int i = 1; i <= k;i++){
            if (i%3==0 && i%4==0) {
                System.out.println(i);
                toplam = toplam + i;
                n++;
            }
        }
        System.out.println("Ortalama: " + toplam/n);
    }
}

