package exersises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Ваня on 12.07.2017.
 */
public class ExamoleFromSlack {
    public static void main(String[] args) {
        int[] mas = {4, 6, 9, 2, 5, 33, 6, 7, 8, 9, 99, 100};
        int[] arr = new int[mas.length];
        Random random = new Random();
        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < 5; i++) {
            int value = random.nextInt(mas.length);
            arr[value] = mas[value];
        }
        System.out.println(Arrays.toString(arr));

    }



}
