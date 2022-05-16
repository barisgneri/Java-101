package Giris;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int n = input.nextInt();
        int toplam = 0;

        for (int i = 1;i < n; i++){
            if (n % i == 0){
                toplam += i;
            }
        }
        if (toplam == n){
            System.out.println(n+ " Mükemmel sayıdır");
        }else{
            System.out.println(n+ " Mükemmel sayı değildir.");
        }
    }
}

