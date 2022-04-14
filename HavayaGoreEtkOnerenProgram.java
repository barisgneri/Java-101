package Giris;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int sıcaklık;
        Scanner in = new Scanner(System.in);

        System.out.println("Hava Sıcaklığı Giriniz: ");
        sıcaklık = in.nextInt();

        if(sıcaklık <= 5){
            System.out.println("Kayak Yapabilirsiniz");
        }else if (sıcaklık >= 6 && sıcaklık <= 14){
            System.out.println("Sinamaya Gidebilirsiniz");
        }else if (sıcaklık >= 15 && sıcaklık >= 24){
            System.out.println("Pikniğe Gidebilirsiniz");
        }else {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }

    }
}
