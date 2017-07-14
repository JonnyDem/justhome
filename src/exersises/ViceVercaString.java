package exersises;

import java.util.Arrays;

/** Переварачивает строку
 * Created by Ваня on 12.07.2017.
 */
public class ViceVercaString {
    public static void main(String[] args) {
        String a="как не крути а все равно";
     stringBackwords(a);
    }

    private static String stringBackwords(String s) {
        char[] word=new char[s.length()];
       int index=0;
       char[] backwordWord=new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            word[i]=s.charAt(i);
        }
        for (int i =s.length()-1; i>=0 ; i--) {
            backwordWord[index]=word[i];
            index++;
        }
        String target=new String(backwordWord);

        System.out.println(target);
        return target;
    }
}
