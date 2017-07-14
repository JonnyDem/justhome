package exersises;

import java.util.Scanner;

/**
 * Created by Ваня on 08.07.2017.
 */
public class Calculator {

    public static int getInt(){
        System.out.println("Enter some number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        return n;
    }
    public static char getOperation(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter some operation");
        String a = scan.next();
        char s='+';
        if(a.equals("-")){
            s='-';
        }else if(a.equals("+")){
            s='+';
        }
        else if(a.equals("*")){
            s='*';
        }else if(a.equals("/")){
            s='/';
        }else {
            System.out.println("This operation is not avalable");
        }
        return s;
    }
    public static int calc(int a,int b,char s){
        int res=0;
        if(s=='+'){
            res=a+b;
        }else if(s=='-'){
            res=a-b;
        }else if(s=='*'){
            res=a*b;
        }else if(s=='/'){
            res=a/b;
        }
        System.out.println("The result is: "+res);
        return res;

    }

    public static void main(String[] args) {
        int a=getInt();
        char s=getOperation();
        int b=getInt();
        System.out.println();
        int c=calc(a,b,s);
    }
}
