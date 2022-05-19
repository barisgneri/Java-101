package Giris;
import java.util.Scanner;
public class HelloWorld {

    static int toplama(int a, int b){
        int result = a + b;
        System.out.print(result);
        return result;
    }
    static int cikarma(int a, int b){
        int result = a - b;
        System.out.println(result);
        return result;
    }
    static int carpma(int a, int b){
        int result = a * b;
        System.out.println(result);
        return result;
    }
    static int bolme(int a, int b){
        int result = a / b;
        System.out.println(result);
        return result;
    }
    static int uslu(int a, int b){
        int result=(int)(Math.pow(a,b));
        System.out.println(result);
        return result;
    }
    static int faktoriel(int c){
        int result=1;
        for (int i=1;i<=c;i++){
            result*=i;
        }
        System.out.println("Sonuc:"+result);
        return result;
    }
    static int mod(int a, int b){
        int result = a % b;
        System.out.println(result);
        return result;
    }
    static int dikDortgen(int a, int b){
        int result1=2*(a+b);
        int result2=a*b;
        System.out.println("Cevre:"+result1);
        System.out.println("Alan:"+result2);
        return result1;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
        while (true){
            System.out.print("Yapmak istediğiniz işlemi giriniz: ");
            int select = input.nextInt();
            if (select>0 && select<=8 && select!=6) {
                System.out.println("Birinici Sayıyı Giriniz: ");
                int a = input.nextInt();
                System.out.println("İkinci Sayıyı Giriniz: ");
                int b = input.nextInt();
                switch (select) {
                    case 1:
                        toplama(a, b);
                        break;
                    case 2:
                        cikarma(a, b);
                        break;
                    case 3:
                        carpma(a, b);
                        break;
                    case 4:
                        bolme(a, b);
                        break;
                    case 5:
                        uslu(a, b);
                        break;
                    case 7:
                        mod(a, b);
                        break;
                    case 8:
                        dikDortgen(a, b);
                }
            }else if (select == 6){
                System.out.print("Faktoriel:");
                int c = input.nextInt();
                faktoriel(c);
            }else if (select == 0){
                System.out.println("Gule Gule");
                break;
            }else {
                System.out.println("Hatalı Giriş Yaptınız");
            }
        }

    }
}

