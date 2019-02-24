
package cit360.JUnit;


public class RandomMethods {
    private int randomInteger = 10;
    private String randomString = "Howdy";

    public int getRandomInteger() {
        return randomInteger;
    }


    public String getRandomString() {
        return randomString;
    }

    public int [] addOneToArray(int [] numbers) {
        int length = numbers.length;
        int output[] = new int[length];
        for(int i=0; i<length; i++){
            output[i] = numbers[i] + 1;
        }
        return output;
    }
    
    public double areaSquare(int base, int height){
        return base * height;
    }
    
    public boolean compareString(String first, String second){
        if(first.equalsIgnoreCase(second)){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public String student(String student){
       return student;
            
    }
    
    public String favoriteColor(String color1){

        return color1;
    }
    
  
}


