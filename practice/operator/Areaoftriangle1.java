package operator;

import java.util.Scanner;

/**
 * Areaofcircle
 */
public class Areaoftriangle1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double height,base,area;

    height=input.nextDouble();
        System.out.print("Enter height= ");


    base=input.nextDouble();
    System.out.print("Enter base= ");

area=0.5*height*base;
System.out.println("Area of thriangle is= "+area);
input.close();

    }
}
