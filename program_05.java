//WAP in java to check even number

import java.util.*;
public class program_05 {;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("The number is ");
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
