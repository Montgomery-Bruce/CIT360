package cit360.ApplicationControllerPattern;
import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        ApplicationControllerPat appController = new ApplicationControllerPat();
                String triangle = "triangle";
                String parrelelogram = "parrelelogram";
                String rightcylinder = "rightcylinder";
                String rectangle = "rectangle";
                Double num1;
                Double num2;
                String shape;
                
                Scanner in = new Scanner(System.in);
                
                System.out.println("Enter Triangle, Parrelelogram, Right Cylinder, or Rectangle to find the area");
                shape = in.nextLine();
                
                appController.handleCommand(shape);
                
                  
                
                        
    }
    
}
