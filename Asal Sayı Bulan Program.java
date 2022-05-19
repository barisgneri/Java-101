package Giris;
import java.util.Scanner;
public class HelloWorld {
    static boolean asal(int a, int b){

        if(a<=2){
            return (a==2)?true:false;
        }
        if(a % b==0){
            return false;
        }
        if(b*b>a){
            return true;
        }
        return asal(a,b+1);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.print("Sayı giriniz: ");
            int a=input.nextInt();
            if(asal(a,2)){
                System.out.println(a+" sayısı asaldır!");
            }else{
                System.out.println(a+" sayısı  asal değildir!");
            }
        }
    }
}

