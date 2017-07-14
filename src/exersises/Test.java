package exersises;

/**
 * Created by Ваня on 12.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        int[][] array = new int[2][3];

        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;
        array[0][2] = 5;
        array[1][2] = 6;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
       // System.out.println(array.length);
    }
}
