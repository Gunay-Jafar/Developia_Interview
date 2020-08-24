package Interview;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;

        while (input != 0) {
            int num = input % 10;
            sum += num;
            input = input / 10;
        }
        System.out.println(sum);
    }
}
