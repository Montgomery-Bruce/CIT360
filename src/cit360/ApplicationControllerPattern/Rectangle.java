package cit360.ApplicationControllerPattern;

import java.util.Scanner;


public class Rectangle implements ShapeInterface {
    Scanner in = new Scanner(System.in);
    Double num1;
    Double num2;
    Double recArea;
    public void getNums(){
        System.out.println("Please enter the base");               
        num1 = Double.parseDouble(in.nextLine());
        System.out.println("Please enter the height");
        num2 = Double.parseDouble(in.nextLine());
        recArea = num1 * num2;
        System.out.println("The area of the rectangle is " + recArea);
    }
  
}
