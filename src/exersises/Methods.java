package exersises;

/**
 * Created by Ваня on 08.07.2017.
 */
public class Methods {
    public static int getSumm(int a,int b){
        int res = a + b;
        return res;
    }

    public static void main(String[] args) {
        int c=20;
        int f=10;
        int s=getSumm(c,f);
        System.out.println(s);
    }
}
