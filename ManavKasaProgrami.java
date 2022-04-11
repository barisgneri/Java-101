//https://app.patika.dev/barisgneri
package Giris;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutKG = 2.14, elmaKG = 3.67, domatesKG = 1.11, muzKG = 0.95, patlicanKG = 5.0;
        double armut, elma, domates, muz, patlican;

        System.out.println("Armut Kaç Kilo ? : ");
        armut = input.nextDouble();

        System.out.println("Elma Kaç Kilo ? : ");
        elma = input.nextDouble();

        System.out.println("Domates Kaç Kilo ? : ");
        domates = input.nextDouble();

        System.out.println("Muz Kaç Kilo ? : ");
        muz = input.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ? : ");
        patlican = input.nextDouble();

        double toplam = (armut * armutKG) + (elma * elmaKG) + (domates * domatesKG) + (muz * muzKG) + (patlican * patlicanKG);
        System.out.println("Toplam Fiyat : " + toplam);
    }
}
