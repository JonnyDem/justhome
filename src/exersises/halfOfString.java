package exersises;

/**
 * Created by Ваня on 12.07.2017.
 */
public class halfOfString {

    public static void main(String[] args) {
        String a = "I love you!";
        cutString(a);
    }

    private static String cutString(String a) {
        String b = a.substring(a.length() / 2);
        System.out.println(b);
       return b;
    }
}
