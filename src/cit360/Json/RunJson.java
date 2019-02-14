package cit360.Json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.util.*;
import java.io.*;


public class RunJson {

    public static void main(String[] args) throws JsonProcessingException, FileNotFoundException, IOException {
        
        Student stu = new Student("Jason", "Smith", 24, true); //create a student object
        ObjectMapper mapper = new ObjectMapper();
     try{   
        
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(stu);
        
        System.out.println(json);
     }catch (JsonParseException e) {e.printStackTrace();}
     
     
     //Write object to file in json
     Student stu2 = new Student("Bob", "Taylor", 33, true);
     File studentFile = new File("studentFile.json");
     ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
     writer.writeValue(new File("test.json"), stu2);
     
     //Convert a json object into a java object
     
     String json = "{\"firstname\":\"Bob\",\"lastName\":\"Taylor\",\"age\":\"33\",\"isMale\":\"true\"}";
     
     Student bobTaylor = mapper.readValue(json, Student.class);
     System.out.println(bobTaylor);
     
  
     
    }
}
