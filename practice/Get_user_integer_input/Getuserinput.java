package Get_user_integer_input;

import java.util.Scanner;// scanner class is located here inside the util package


public class Getuserinput {

    public static void main(String[] args) {
    
 try (Scanner input = new Scanner(System.in)) {
    int number;// here "number is the variable in where we are gonna give the input"
    
    System.out.print("enter any number");// here we are saying the user enter any number and we are not putting ln here, because we dont want to create a new line after"Enter any number"
    
   
        number=input.nextInt();// now user is gonna give a number and im gonna put the number in to the "number" variable and the method of getting the number input from user is we have to use Scanner class' variable that we used:here that scanner variable is "input". Here we want to give integer input,thatswhy nextint
  
    System.out.println("Number="+number);  // here we are giving input into the "number" variable
}




}


    
}


