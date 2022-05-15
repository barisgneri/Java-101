package Giris;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N Sayısını Giriniz: ");
        int n = input.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int ii=1;ii<=n;ii++){
            for (int bosluk=1; bosluk<=ii; bosluk++){
                System.out.print(" ");
            }
            for (int y=1;y<=2*(n-ii)-1; y++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

