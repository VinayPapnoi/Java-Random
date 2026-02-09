// WAP in java to find the samllest and the greatest of three numbers

import java.util.*;

public class program_03 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if(a>b && a>c){
            System.out.println("greatest number is: "+a);
        }
        else if(b>c){
            System.out.println("greatest number is: "+b);
        }
        else{
            System.out.println("greatest number is: "+c);
        }

    }
}
