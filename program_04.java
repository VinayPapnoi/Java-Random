//WAP in java to swap two numbers

import java.util.*;
public class program_04 {;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("the numbers were "+ a + " "+ b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("the numbers are now "+ a + " "+ b);
        
    }
}
