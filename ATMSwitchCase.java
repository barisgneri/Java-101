package Giris;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, pass;
        int right = 3;
        int balance = 1500;
        int price = 0;
        int select;


        while (right > 0){
            right = 0;
            System.out.println("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.println("Şifreniz: ");
            pass = input.nextLine();

            if (userName.equals("baris") && pass.equals("1234")){
                System.out.println("PATIKA BANKASINA HOŞGELDİNİZ");
                        System.out.println("Yapmak İstediğniz İlemi Seçiniz:\n1-Para yatırma\n" +
                                "2-Para Çekme\n" +
                                "3-Bakiye Sorgula\n" +
                                "4-Çıkış Yap");
                        select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Yatırmak İstediğiniz Tutarı Giriniz:");
                            price = input.nextInt();
                            System.out.println("Para Yatırma Başarılı Mevcut Bakiyeniz: " + (balance + price));
                            break;
                        case 2:
                            System.out.println("Çekmek İstediğiniz Tutarı Girin:");
                            price = input.nextInt();
                            if (price < balance){
                                System.out.println("Para Çekme İşleminiz Başarılı\nHesabınızda Kalan Tutar: " +(balance-price));
                            }else {
                                System.out.println("Yetersiz Bakiye Mevcut Bakiyeniz: "+balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz "+balance);
                            break;
                        case 4:
                            System.out.println("Bye Bye");
                            break;
                    }
            }else{
                --right;
                System.out.println("Kullanıcı Adı veya Şifre Yanlış! Tekrar Deneyin\nKalan Giriş Hakkınınız "+right);
                switch (right){
                    case 0: System.out.println("Hesabınız Bloke Olmuştur Banka ile İltişime Geçiniz");
                    break;
                }
            }
        }
    }
}

