package Giris;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yıl, kalan;
        System.out.println("Doğum Yılınızı Giriniz:");
        yıl = input.nextInt();
        if (yıl % 4 == 0){
            if (yıl % 100 != 0){
                System.out.println(yıl +" artık yıldır!");
            }else if ((yıl % 100 == 0) && (yıl % 400 == 0)){
                System.out.println(yıl +" artık yıldır!");
            }else{
                System.out.println(yıl + " artık yıl değildir!");
            }
        }else{
            System.out.println(yıl + " artık yıl değildir!");
        }

    }
}
