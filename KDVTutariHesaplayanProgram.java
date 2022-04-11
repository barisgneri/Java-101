package Giris;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        double fiyat, kdvoran , kdvfiyat, kdvtoplam;
        System.out.println("Ürünün Fiyatını Girin: ");
        Scanner input = new Scanner(System.in);
        fiyat = input.nextDouble();

        kdvoran = fiyat < 1000 ? 0.18 : 0.08;

        System.out.println("Kdvsiz Fiyat; "+ fiyat);
        kdvfiyat = fiyat + (fiyat * kdvoran);
        System.out.println("Kdv'li Fiyat: " + kdvfiyat);
        System.out.println("Kdv Oranı: " + kdvoran);
        kdvtoplam = kdvfiyat - fiyat;
        System.out.println("Toplam Kdv: "+ kdvtoplam);

    }
}
