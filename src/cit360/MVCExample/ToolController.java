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
public class ToolController {
    private Tools model; 
    private ToolView view; 
  
    public ToolController(Tools model, ToolView view) 
    { 
        this.model = model; 
        this.view = view; 
    } 
  
    public void setToolName(String name) 
    { 
        model.setToolName(name);         
    } 
  
    public String getToolName() 
    { 
        return model.getToolName();         
    } 
  
    public void setNumberOfTools(int numberOf) 
    { 
        model.setNumberOf(numberOf);         
    } 
  
    public int getNumberOfTools() 
    { 
        return model.getNumberOf();         
    } 
  
    public void updateView() 
    {                 
        view.printToolDetails(model.getToolName(), model.getNumberOf()); 
    }     
}
