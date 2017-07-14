package exersises;

import java.util.Scanner;

/**
 * Created by Ваня on 08.07.2017.
 */
public class CheckAndShowNumbers {
    public static void checkNumbers(int k,int n){
     if(k>n){
         while(n<=k) {
             if (n % 2 == 0) {
                 System.out.print(n+",");

             }
     } n++;
     }else if(n>k){
         while(k<=n){
             if(k%2==0){
                 System.out.print(k+",");
             }k++;
         }
     }else{
         System.out.println("This numbers are equel");
     }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1-th number");
        int a=scan.nextInt();
        System.out.println("Enter 2-th number");
        int b=scan.nextInt();
        System.out.println();

        checkNumbers(a,b);
    }
}
