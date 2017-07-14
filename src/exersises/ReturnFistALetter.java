package exersises;

/**
 * Created by Ваня on 12.07.2017.
 */
public class ReturnFistALetter {
    public static void main(String[] args) {
        String f="Я люблю електроавтомобили";
    fistA(f);
    }

    private static int fistA(String s) {
        int a=s.indexOf('а');
        System.out.println(a);
        return a;
    }

}
