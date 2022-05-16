package Giris;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç Adet Sayı Grieceksiniz: ");
        int n = input.nextInt();

        int i = 1, min = 0, max = 0, x = 0;

        while(i<=n) {
            System.out.println(i + ". Sayıyı Giriniz: ");
            x = input.nextInt();
            if (i == 1) {
                max = x;
                min = x;
            } else {
                if (x > max) {
                    max = x;
                } else if (x < min) {
                    min = x;
                }
            }
            i++;
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}

