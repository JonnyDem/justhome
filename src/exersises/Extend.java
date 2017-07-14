package exersises;

/**
 * Created by Ваня on 08.07.2017.
 */
public class Extend {
    public static void main(String[] args) {
        double a=Math.pow(2,7);
        System.out.println(a);
        System.out.println();
        double b=0;
        for (int i = 0; i <8 ; i++) {
           b+=Math.pow(2,i);
            System.out.println(b);
        }
        System.out.println();
        System.out.println(Math.pow(2,0));
    }
}
