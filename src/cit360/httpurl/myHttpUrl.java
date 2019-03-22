
package cit360.httpurl;

import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class myHttpUrl {
    
    public static void main(String[] args) throws Exception {
      
    try  {
        
        
            URL webPage = new URL("https://www.finfun.com"); //Create the URL object
       
            HttpURLConnection connection = (HttpURLConnection) webPage.openConnection(); //Open a connection to the webPage
            
            BufferedReader readIn = new BufferedReader(new InputStreamReader(connection.getInputStream())); //reads in the webPage from the connection
            
            System.out.println("Response Code: " + connection.getResponseCode() ); //prints out the response Code
            System.out.println("Response Message: " + connection.getResponseMessage()); //prints out the response message
            System.out.println("Header field 1: " + connection.getHeaderField(1)); //prints out field one in the header of the website.
            
            String code; //declares a string variable called code for the while loop below. 
            
            while((code = readIn.readLine()) != null) { //as long as there is code to bring in, run this.
                System.out.println();
                System.out.println(code);
            }
            
            readIn.close(); //close connection
            
        
       } catch (Exception e) {
           System.out.println("Error Message: " + e.getMessage());
       }
    }
}
