package cit360.ApplicationControllerPattern;

import java.util.Scanner;

public class Parrelelogram implements ShapeInterface {
    
    Scanner in = new Scanner(System.in);
    Double num1;
    Double num2;
    Double parArea;
    public void getNums(){
        System.out.println("Please enter the base");               
        num1 = Double.parseDouble(in.nextLine());
        System.out.println("Please enter the height");
        num2 = Double.parseDouble(in.nextLine());
        parArea = num1 * num2;
        System.out.println("The area of the parrelelogram is " + parArea);
    }  
}
