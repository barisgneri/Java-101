package Giris;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Pattern Number...:");
        int patternNumber = scanner.nextInt();
        System.out.print(patternNumber + " ");
        createPattern(patternNumber, patternNumber, false);
    }

    static void createPattern(int patternNumber, int tempPatternNumber, boolean isComplateNegativeNumber) {
        if (tempPatternNumber <= patternNumber){
            if (isComplateNegativeNumber) {
                tempPatternNumber += 5;
            } else {
                if (tempPatternNumber <= 0) {
                    tempPatternNumber += 5;
                    isComplateNegativeNumber = true;
                } else {
                    tempPatternNumber -= 5;
                }
            }
            if (tempPatternNumber <= patternNumber){
                System.out.print(tempPatternNumber + " ");
            }
            createPattern(patternNumber, tempPatternNumber, isComplateNegativeNumber);
        }
    }
}
