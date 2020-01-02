package day58_ExceptionContinue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


/*
1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
       parameters: double seconds
       return-type: void
       Thread.sleep();
       
   Note: Exceptions MUST be handled within the methods
   
2. write a method called "getData" that can retrieve the data from properties files
       parameters: String Key, String FilePath
       return-type: String
       
   Note: Exceptions MUST be handled within the methods
*/

public class WarmUp {
    public static void main(String[] args) {
        
        Wait( 3 );
        System.out.println( "Batch 12");
        
        Properties property = new Properties();
        
        String path = "/Users/tugbaelitok/Desktop/Data.properties";
        
        try {
            FileInputStream file = new FileInputStream(path);
            property.load( file);
            
        }catch(Exception e) {
            
        }
        
        String Name =   property.getProperty("ID");
        System.out.println(Name);
        
        
    System.out.println(   getData("Name", "/Users/tugbaelitok/Desktop/Data.properties")  );
        
    System.out.println( property.getProperty("URL"));
    
    String Age1 = getData("Age","TestData.properties");
        //         to get this location, right click on the file => click Properties at the bottom, copy the path given on the window
      //       if the file and the class we are working on are in the same project, we do not need to give the entire path name, we can just give the file name.
          //               "TestData.properties" will be enough in this case.
    
    System.out.println("My age is: "+Age1);
    
    
    String URL = getData("URL","files/TestData2.properties");

    System.out.println(URL);
    
    }
    public static void Wait(double seconds) {
        
        try {
          Thread.sleep( (long)(seconds*1000) );  // 1 seconds = 1000 milliseconds
        } catch(Exception e) {  }
        
    }
    
    
    
    public static String getData(String Key, String Path) {
        String data ="";
        Properties property = new Properties();
        
        
        try {
            FileInputStream file = new FileInputStream(Path);
            property.load( file);
            
        }catch(Exception e) {
        	//we do not need to put anything here at the moment because exception we are dealing with is checked exception,
    		// therefore, try block will get executed.
        }
        
        data = property.getProperty(Key);
        
        return data;
    }
    
    
    
    
}






	


