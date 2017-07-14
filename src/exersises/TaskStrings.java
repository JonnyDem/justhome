package exersises;

/**Проверяет одинаковы ли первая и последняя буквы строки
 * Created by Ваня on 12.07.2017.
 */
public class TaskStrings {
    public static void main(String[] args) {
        String s="Хорошо когда хорошо Х";
        isFirstLastCharsEquals(s);
    }

    public static boolean isFirstLastCharsEquals(String s) {
        boolean c;
        if(s.charAt(0)==s.charAt(s.length()-1)) {
            c=true;
        }else{
            c=false;
        }
        System.out.println(c);
        return c;
    }
}
