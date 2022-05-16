package Giris;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int n = input.nextInt();
        for (int i=1;i<=n;i++){
            for (int bosluk=1; bosluk<=i; bosluk++){
                System.out.print(" ");
            }
            for (int y=1;y<=2*(n-i)-1; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

