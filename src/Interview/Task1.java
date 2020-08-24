package Interview;

public class Task1 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; count <= 100; i++) {
            boolean isDivisible = false;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isDivisible = true;
                }
            }
            if (!isDivisible) {
                count++;
                System.out.println(i);
            }
        }
    }
}

