package Giris;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz: ");
        int n1 = input.nextInt();
        System.out.println("n2 sayısını giriniz: ");
        int n2 = input.nextInt();

        int ebob, i = n1, k = 0;
        System.out.println("*****EBOB******");
        while (i <= n1){
            i--;
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
                System.out.println(ebob);
                break;
            }
        }
        System.out.println("*****EKOK******");
        while (k <= (n1 * n2)){
            k++;
            if (k % n1 == 0 && k % n2 == 0){
                System.out.println(k);
                break;
            }
        }
    }
}

