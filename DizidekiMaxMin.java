import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        System.out.println("Bir Sayı Giriniz:");
        int a = input.nextInt();

        Arrays.sort(list);
        for (int i : list) {
            if (i < a) {
                min = i;
            }
            if (i > a) {
                max = i;
                break;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

    }
}
