package exersises;

import java.util.Scanner;

/**
 * Created by Ваня on 08.07.2017.
 */
public class MaxNumber {
public static int getMax(int a,int b){
    int s=0;
    if(a>b){
        s=a;}
    else if(b>a){
         s=b;
    }else{
        System.out.println("This nambers are equel");
    }
    return s;
}

    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1-th number");
      int a=scan.nextInt();
        System.out.println("Enter 2-th number");
        int b=scan.nextInt();
        int res=getMax(a,b);
        System.out.println(res);

    }
}
