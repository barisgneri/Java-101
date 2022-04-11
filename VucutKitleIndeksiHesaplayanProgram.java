//https://app.patika.dev/barisgneri
package Giris;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo, boyKiloIndeks;

        System.out.println("Boyunuzu Girin; ");
        boy = input.nextDouble();
        System.out.println("Kilonuzu Giriniz: ");
        kilo = input.nextDouble();

        boyKiloIndeks = kilo / (boy * boy);

        System.out.println("Boy Kilo İndeksiniz: " + boyKiloIndeks);
    }
}
