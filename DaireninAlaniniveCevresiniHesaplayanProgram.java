package Giris;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double pi = 3.14, a;
        System.out.println("Yarıçap Giriniz: ");
        r = input.nextInt();
        double alan = pi * r * r ;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);

        System.out.print("Alanını hesaplamak istediğiniz dilime ait merkez açıyı girin: ");
        a = input.nextDouble();

        double dilimAlan = (pi * (r * r) * a) / 360;

        System.out.println("Dilimin Alanı : " + dilimAlan);

    }
}
