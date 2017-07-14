package exersises;

import java.util.Arrays;

/**
 * Created by Ваня on 12.07.2017.
 */
public class EvenArray {
    public static void main(String[] args) {
        int[]vector={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        fillArray(vector);
    }

    private static int[] fillArray(int[] array) {
        int evenCount=0;
        int index=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;

            }
        }
            int[]mas=new int[evenCount];
            for (int i = 0; i <array.length ; i++) {
                if (array[i] % 2 == 0) {
                    mas[index] = array[i];
                    index++;
                }

        }
        System.out.println(Arrays.toString(mas));
        return  mas;
    }
}
