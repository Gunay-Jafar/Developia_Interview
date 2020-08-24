package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[1000];
        Random r = new Random();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(100);
        }

        for (int i = 0; i < mas.length; i++) {
            if (!hashMap.containsKey(mas[i])) {
                hashMap.put(mas[i], 1);
            } else {
                hashMap.put(mas[i], hashMap.get(mas[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }

}
