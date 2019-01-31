package cit360.ApplicationControllerPattern;

import java.util.Scanner;


public class RightCylinder implements ShapeInterface {
    Scanner in = new Scanner(System.in);
    Double num1;
    Double num2;
    Double rcylArea;
    public void getNums(){
        System.out.println("Please enter the radius");               
        num1 = Double.parseDouble(in.nextLine());
        System.out.println("Please enger the height");
        num2 = Double.parseDouble(in.nextLine());
        rcylArea = (2 * Math.PI * num1 * num2) + (2 * Math.PI * Math.pow(num1, 2));
        System.out.println("The area of the right cylinder is " + rcylArea);
    }
    
}
