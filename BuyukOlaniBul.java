package Giris;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int a,b,c;
        Scanner giris = new Scanner(System.in);

        System.out.println("1. Sayıyı Girin:");
        a = giris.nextInt();
        System.out.println("2. Sayıyı Girin:");
        b = giris.nextInt();
        System.out.println("3. Sayıyı Girin:");
        c = giris.nextInt();

        if ((b < a) && (c < a)) {
           if (b > c){
               System.out.println("a > b > c");
           }else{
               System.out.println("a > c > b");
           }
        }else if ((b > a) && (b > c)){
            if (a>c){
                System.out.println("b > a > c");
            }else{
                System.out.println("b > c > a");
            }
        }else if ((c > a) && (c > b)) {
            if (a > b){
                System.out.println("c > a > b");
            }else {
                System.out.println("c > b > a");
            }
        }
    }

}
