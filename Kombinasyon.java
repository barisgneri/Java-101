package Giris;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        /*
        Ödev
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların
        sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        Java ile kombinasyon hesaplayan program yazınız.
        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
        */
        int n,r,f1=1,f2=1,f3=1;
        Scanner input=new Scanner(System.in);

        System.out.print("n nin: ");
        n= input.nextInt();
        System.out.print("r' li kombinasyonu: ");
        r= input.nextInt();
        for (int i=1;i<=n;i++){
            f1=f1*i;
        }
        for (int j=1;j<=r;j++){
            f2=f2*j;
        }
        for (int k=1;k<=(n-r);k++){
            f3=f3*k;
        }
        System.out.print("n'nin r'l kombinasyonu: ");
        System.out.println(f1/(f2*f3));
    }
}

