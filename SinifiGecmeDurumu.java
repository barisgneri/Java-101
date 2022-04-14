package Giris;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int matematik , fizik , kimya , turkce , muzik , toplam = 5 ;


        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        matematik = input.nextInt();
        if (matematik < 0 || matematik > 100) {
            matematik = 0;
            toplam = --toplam;
            System.out.println("Geçersiz Değer Girdiğiniz İçin Bu Ders Ortalamaya Dahil Değil!");
        }
        System.out.println("Matematik Notunuz: " + matematik);

        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100){
            fizik = 0;
            toplam = --toplam;
            System.out.println("Geçersiz Değer Girdiğiniz İçin Bu Ders Ortalamaya Dahil Değil!");
        }
        System.out.println("Fizik Notunuz: " + fizik);

        System.out.println("Kimya Noutunuzu Giriniz: ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100){
            kimya = 0;
            toplam = --toplam;
            System.out.println("Geçersiz Değer Girdiğiniz İçin Bu Ders Ortalamaya Dahil Değil!");
        }
        System.out.println("Kimya Notunuz: " + kimya);

        System.out.println("Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100){
            turkce = 0;
            toplam = --toplam;
            System.out.println("Geçersiz Değer Girdiğiniz İçin Bu Ders Ortalamaya Dahil Değil!");
        }
        System.out.println("Türkçe Notunuz: " + turkce);

        System.out.println("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100){
            muzik = 0;
            toplam = --toplam;
            System.out.println("Geçersiz Değer Girdiğiniz İçin Bu Ders Ortalamaya Dahil Değil!");
        }
        System.out.println("Müzik Notunuz: " + muzik);

        System.out.println("Geçerli Ders Sayınız: "+ toplam);

        double ortalama = (matematik+fizik+kimya+turkce+muzik)/toplam;
        if (ortalama >= 55){
            System.out.println("Tebrikler! Sınıfı "+ortalama+" ortalama ile geçtiniz.");
        }else {
            System.out.println("Malesef "+ortalama+" ortalama ile sınıfta kaldınız.\nSeneye Görüşürüz");
        }
    }
}
