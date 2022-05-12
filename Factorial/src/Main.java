import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int factorial = new Scanner(System.in).nextInt();;

        if(factorial >= 1 && factorial <= 12) {
            System.out.printf(String.valueOf(getFactorial(factorial)));
        }
        if (factorial == 0) {
            System.out.println(1);
        }
        else System.out.println("Введите число от 1 до 12!");
    }

    public static int getFactorial(int value) {
        int result = 1;

        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
        return result;
    }
}
