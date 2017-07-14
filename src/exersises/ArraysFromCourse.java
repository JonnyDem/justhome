package exersises;

import java.util.Arrays;

/**
 * Created by Ваня on 12.07.2017.
 */
public class ArraysFromCourse {
    public static void main(String[] args) {
        int[] mas = print(69);
        System.out.println(Arrays.toString(mas));
    }
        private static int[] print(int a) {
        int[] mas = {4, 2, 3, 4, 5, 6, 43, 67};
        mas[0] = a;
        return mas;
    }
}
