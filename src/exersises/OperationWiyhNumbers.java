package exersises;

import java.util.Scanner;

/**
 * Created by Ваня on 08.07.2017.
 */
public class OperationWiyhNumbers {
    public static int getMultyPly(int a,int b){
        int res = a * b;
        return res;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1-th number");
        int a=scan.nextInt();
        System.out.println("Enter 2-th number");
        int b=scan.nextInt();
        int res=getMultyPly(a,b);
        System.out.println();
        System.out.print("The multyple result is ");
        System.out.println(res);
    }
}
