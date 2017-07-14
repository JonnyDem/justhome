package exersises;

/**
 * Created by Ваня on 12.07.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        int[]vector=new int[12];
        System.out.println("vector="+vector);
        System.out.println(vector[0]+","+vector[1]+","+vector[2]);
        fillVector(vector);
        System.out.println(vector[0]+","+vector[1]+","+vector[2]);
    }

    private static void fillVector(int[] vect) {
        vect[0]=10;
        vect[1]=20;
        System.out.println("vect="+vect);
        System.out.println("vectLength="+vect.length);
    }
}
