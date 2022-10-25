package Arithmicuserinput;

import java.util.Scanner;

public class Arithmicuserinput {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
 try (Scanner input = new Scanner(System.in)) {
    int num1,num2,result;  


 System.out.print("Enter First Number: ");
num1 = input.nextInt(0);

 System.out.println("Enter Second Number: ");
 num2=input.nextInt(0);



        result=num1+num2;
        System.out.println("sum="+result);

        result=num1-num2;
        System.out.println("sub="+result);

    
        result=num1*num2;
        System.out.println("mul="+result);

        result=num1/num2;
        System.out.println("div="+result);

        result=num1%num2;
        System.out.println("remainder="+result);}

        
           
    }
    
}




    
