/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.MVCExample;

/**
 *
 * @author brucem
 */
public class MVCPattern {
    public static void main(String[] args)  
    { 
        Tools model  = retriveToolsFromDatabase(); 
  
        ToolView view = new ToolView(); 
  
        ToolController controller = new ToolController(model, view); 
  
        controller.updateView(); 
  
        controller.setToolName("Rake"); 
  
        controller.updateView(); 
    } 
  
    private static Tools retriveToolsFromDatabase() 
    { 
        Tools tools = new Tools(); 
        tools.setToolName("Hammer"); 
        tools.setNumberOf(5);
        return tools; 
    } 
}
