package Giris;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kAdi , sifre = "1234", girisSifre, soru, sifreKontrol ;
        System.out.println("Kallanıcı Adınızı Giriniz: ");
        kAdi = input.nextLine();
        System.out.println("Şifrenizi Giririniz: ");
        girisSifre = input.nextLine();
        if (kAdi.equals("baris") && girisSifre.equals(sifre)){
            System.out.println("Giriş Başarılı");
        }else if (girisSifre != sifre){
            System.out.println("Bilgileriniz Yanlış");
            System.out.println("Şifrenizi Sıfırlamak İstiyorumusunuz? (Evet/Hayır)");
            soru = input.nextLine();
            if (soru.equals("Evet")){
               System.out.println("Yeni Şifrenizi Giriniz:");
               sifreKontrol = input.nextLine();
               if (sifreKontrol.equals(sifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                   sifre = sifreKontrol;
                   System.out.println("Şifre oluşturuldu");
               }
            }
        }

    }
}
