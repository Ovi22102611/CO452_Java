package operator;

import java.util.Scanner;

public class Evenoddcheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        num= input.nextInt();
        
        System.out.println("Enter any positive number: ");

       if (num%2==0) {System.out.println("Vowel");
        
       }

       else {System.out.println("Conostant");}

    }
}
