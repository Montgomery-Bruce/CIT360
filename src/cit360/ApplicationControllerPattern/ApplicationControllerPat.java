package cit360.ApplicationControllerPattern;
import java.util.HashMap;

public class ApplicationControllerPat {
    private HashMap<String,ShapeInterface> hashMapShapes = new HashMap();
    
    public void handleCommand(String shape){
        hashMapShapes.put(("Rectangle"), new Rectangle());
        hashMapShapes.put(("RightCylinder"), new RightCylinder());
        hashMapShapes.put(("Parrelelogram"), new Parrelelogram());
        hashMapShapes.put(("Triangle"), new Triangle());
        
        ShapeInterface handler = hashMapShapes.get(shape);
        
        handler.getNums();
    }
}