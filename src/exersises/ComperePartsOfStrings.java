package exersises;

/**
 * Created by Ваня on 12.07.2017.
 */
public class ComperePartsOfStrings {

    public static void main(String[] args) {
        String v="Я тебя люблю";                      //"Yes,I like it";
        String n="люблю";                     //"No,I do not like it";

        isPartOfStringsEquel(v,n);
    }

    public static boolean isPartOfStringsEquel(String a,String b) {
        boolean c;
        if(a.indexOf(b)>=0){
            c=true;
        }else{
            c=false;
        }

        System.out.println(c);
        return c;
    }
}
