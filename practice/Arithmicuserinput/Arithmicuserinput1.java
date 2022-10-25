package Arithmicuserinput;

import java.util.Scanner; 

public class Arithmicuserinput1 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner("System.in")) {
            int num1,num2,numF;
            System.out.print("Enter first number=" );
            num1= input.nextInt();
            System.out.print("Enter sercond number= ");
            num2=input.nextInt();

            numF=num1+num2;

            System.out.println("Sum is="+numF);
        }
    
        
        




    }
}
