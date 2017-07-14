package exersises;

/** Проверяет являеться ли слово полиндромом (Одинакова читаеться с првава на лево и наоборот)
 * Created by Ваня on 12.07.2017.
 */
public class Polindrom {
    public static void main(String[] args) {
        String a="ValaV";
        isStringPolindrom(a);
    }

    public static boolean isStringPolindrom(String s) {
        boolean check;
        char[] word=new char[s.length()];
        char[] word2=new char[s.length()];
        int index=0;
        for (int i = 0; i <s.length() ; i++) {
            word[i]=s.charAt(i);
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            word2[index]=word[i];
            index++;
        }

        String target=new String(word2);
        if(s.equals(target)){
            check=true;
        }else{
            check=false;
        }
        System.out.println(s);
        System.out.println(target);
        System.out.println(check);
        return check;
    }
}
