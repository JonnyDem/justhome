package exersises;

import java.util.Arrays;

/**
 * Created by Ваня on 12.07.2017.
 */
public class ArrayWithStepOfTwo {

    public static void main(String[] args) {
        int[] mas=getArray(25);
      // printVector(mas);
    }

    private static void printVector(int[]vector) {
        System.out.println(Arrays.toString(vector));
    }

    public static int[] getArray(int k) {
        int[] array = new int[k];
        int index=0;
        for (int i = 0; i <k ; i++) {
            array[i]=10+index;
            index+=2;
        }
       printVector(array);
       // System.out.println(Arrays.toString(array));
        return array;
    }

}
