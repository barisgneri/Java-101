package Giris;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1, sayi2, islem;

        System.out.println("Birinci Sayıyı Giriniz: ");
        sayi1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("1- Toplama \n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.println("Yapmak İstediğiniz İşlmei Seçin: ");

        islem = input.nextInt();

        switch (islem) {
            case 1 :
                System.out.println("Toplama Sonucu : " + (sayi1 + sayi2));
                break;
            case 2 :
                System.out.println("Çıkarma Sonucu : " + (sayi1 - sayi2));
                break;
            case 3 :
                System.out.println("Çarpma Sonucu : " + (sayi1 * sayi2));
                break;
            case 4 :
                switch (sayi1) {
                    case 0 :
                        System.out.println("0 bölme işleminde kullanılamaz");
                        return;
                }
                switch (sayi2) {
                    case 0 :
                        System.out.println("0 bölme işleminde kullanılamaz");
                        break;
                    default: System.out.println("Bölme İşlemi Sonucu : " + (sayi1 / sayi2));
                }
        }
    }
}
