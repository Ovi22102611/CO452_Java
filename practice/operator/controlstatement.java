package operator;

import java.util.Scanner;

public class controlstatement {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num;

            num=input.nextInt();

     if (num>0) {  System.out.println("positive");  }
                
   

      else if (num<0) {  System.out.println("Negative");  }
                
            
      else {   System.out.println("Equal to Zero");   
            
        }
        }
            
    }




}
