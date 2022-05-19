package Giris;
import java.util.Scanner;
public class HelloWorld {
    static int uslu(int a, int b){
        if(b==0){
            return 1;
        }
        return a*uslu(a,b-1);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.print("Taban değerini giriniz: ");
            int a=input.nextInt();
            System.out.print("Üs değerini giriniz: ");
            int b= input.nextInt();
            System.out.println("Sonuc: "+uslu(a,b));
        }
    }
}

