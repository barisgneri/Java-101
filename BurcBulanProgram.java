package Giris;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int ay, gun;
        String burc = "";
        boolean isError = false;

        System.out.print("Doğduğunuz ay : ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz gün : ");
        gun = input.nextInt();


        if (ay == 1) {
            if (gun >= 1 && gun <= 31)
                if (gun < 22) {
                    burc = "Oğlak burcu";
                } else
                    burc = "Kova burcu ";
        }


        if (ay == 2) {
            if (gun >= 1 && gun <= 28)
                if (gun < 20) {
                    burc = "Kova burcu";
                } else
                    burc = "Balık burcu ";
        }

        if (ay == 3) {
            if (gun >= 1 && gun <= 31)
                if (gun < 21) {
                    burc = "Balık burcu";
                } else burc = "Koç burcu ";
        }

        if (ay == 4) {
            if (gun >= 1 && gun <= 30)
                if (gun < 21) {
                    burc = "Koç burcu";
                } else burc = "Boğa burcu ";
        }

        if (ay == 5) {
            if (gun >= 1 && gun <= 31)
                if (gun < 22) {
                    burc = "Boğa burcu";
                } else burc = "İkizler burcu ";
        }

        if (ay == 6) {
            if (gun >= 1 && gun <= 30)
                if (gun < 23) {
                    burc = "İkizler burcu";
                } else burc = "Yengeç burcu ";
        }

        if (ay == 7) {
            if (gun >= 1 && gun <= 31)
                if (gun < 23) {
                    burc = "Yengeç burcu";
                } else burc = "Aslan burcu ";
        }

        if (ay == 8) {
            if (gun >= 1 && gun <= 30)
                if (gun < 23) {
                    burc = "Aslan burcu";
                } else burc = "Başak burcu ";
        }

        if (ay == 9) {
            if (gun >= 1 && gun <= 31)
                if (gun < 23) {
                    burc = "Başak burcu";
                } else burc = "Terazi burcu ";
        }

        if (ay == 10) {
            if (gun >= 1 && gun <= 30)
                if (gun < 23) {
                    burc = "Terazi burcu";
                } else burc = "Akrep burcu ";
        }

        if (ay == 11) {
            if (gun >= 1 && gun <= 31)
                if (gun < 22) {
                    burc = "Akrep burcu";
                } else burc = "Yay burcu ";
        }

        if (ay == 12) {
            if (gun >= 1 && gun <= 30)
                if (gun < 22) {
                    burc = "Yay burcu";
                } else burc = "Kova burcu ";
        } else

            System.out.print("Burcunuz : " + burc);

    }

}
