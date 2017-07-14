package exersises;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Ваня on 12.07.2017.
 */
public class FillArraysMathod {
    public static void main(String[] args) {
        int[] array = new int[12];
        fillArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void fillArray(int[]vect) {
        for (int i = 0; i <vect.length ; i++) {
            if(i%2==0){
                vect[i]=i+1;
            }else{
                vect[i]=0;
            }
        }
    }
}
