package Giris;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int akenar, bkenar, ckenar;
        System.out.println("1. Kenar Uzunuluğu Giriniz");
        akenar = input.nextInt();
        System.out.println("2. Kenar Uzunuluğu Giriniz");
        bkenar = input.nextInt();
        System.out.println("3. Kenar Uzunuluğu Giriniz");
        ckenar = input.nextInt();

        double formul = (akenar + bkenar + ckenar)/2;
        double ucgencevre = 2*formul;
        System.out.println("Üçgenin çevresi: "+ucgencevre);
        double hipotenus = Math.sqrt ((akenar * akenar) + (bkenar * bkenar));
        System.out.println("Üçgenin Hipotenüsü: "+ hipotenus);
        double alan = Math.sqrt(formul * (ucgencevre - akenar) * (ucgencevre - bkenar) * (ucgencevre - ckenar));
        System.out.println("Üçgenin Alanı: "+alan);


    }
}
