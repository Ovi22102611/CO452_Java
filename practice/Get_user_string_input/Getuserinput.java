package Get_user_string_input;

import java.util.Scanner;

public class Getuserinput {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String name;
            
            System.out.print("Enter your name : ");
             name= input.nextLine(); // here we can use 2 method (1)next (2) nextLine . the difference between these two is "next method" cant show after MD , because it cut off other words after the space. But by putting "nextLine" method my full name is visible , because it can take all the words after the space , 
                                    // to get double value we use here "num= input.nextdouble();" Rest of the things are same
            
            System.out.println("Welcome : "+name);
        } 
    }
    
}