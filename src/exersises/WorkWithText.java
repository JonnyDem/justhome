package exersises;

/**
 * Created by Ваня on 12.07.2017.
 */
public class WorkWithText {
    public static void main(String[] args) {
        String text="      Я хочу быть здоровым, богатым и успешным             1";
        String text2="      Я хочу быть здоровым, богатым и успешным             1";
        text=text.concat(" и чтоб девки любили.");
        System.out.println(text);
        System.out.println(text2.trim());
        char a=text2.charAt(0);
        char b=text2.charAt(18);
        System.out.println(a);
        System.out.println(b);
        System.out.println(text.substring(1, 6));

    }
}
