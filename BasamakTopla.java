package Giris;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int number;
        number = input.nextInt();
        int result=0;
        int remain;

        while (number !=0){
            remain=number%10;
            number /=10;
            result +=remain;

        }
        System.out.println("Girilen Sayilerin Basamak Toplami:"+result);
    }
}

