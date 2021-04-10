/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.ca1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Awa
 */
public class ProgrammingCA1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // Read text from the file.
        
        // Some people information in the file then I have put this here so I can change it easily if I need to do!
        String myFileName = "people.txt";
        
        
        // Open file to read.
        // Using BufferedReader to reading the characters and lines.
        BufferedReader myFile = new BufferedReader(new FileReader(myFileName));
        
        
        String text = myFile.readLine();
        
        String Ageput = myFile.readLine();
                
        String matcher = myFile.readLine();
                
        String gender = myFile.readLine();

        
        try { // Must have a try catch because the file might not exist.            
            
            // Nothing was there - file must be empty.
            if (text == null){
                
                System.out.println("The file " + myFileName + " is empty!");
                
                int Age = Integer.parseInt(Ageput);
            
            if (Age > 100 && Age < 0){
                
                System.out.println("The age must be an integer between 0 and 100!");
            }
            
            
                
                
                
            // Matches the word characters must be letter.
            matcher = "^[a-zA-Z]$";
            
            if(matcher.matches("[A-Za-z]+")) {

                System.out.println("Error name! Please enter a name.");
            }
                    
            // invalid – need all letters
            
                    
            
            
            
            char sex1 = 'M';
            char sex2 = 'F';
            char sex3 = 'T';
                    
            if (sex1 != 'M' && sex2 != 'F' && sex3 != 'T') {
                        
                System.out.print("The gender only F, M, T ");
            }
            }
            
            
            // Read file line by line and end of file.
            // The loop will iterate until it is not null.
            else {
                
                while (text != null){
                    
                    System.out.println(text);
                    
                    text = myFile.readLine();            
                }
                            
        
            }
            
            
            // Close the BufferedReader that is save file.
            myFile.close();    
        }

        
        catch (IOException e){
            // Error opening file
            System.out.println("Error -- unable to find file " + myFileName); 
        }

                

        
                
                                       
            
   
        
        
        /**
         * This is output the data to a new file. 
         */
        
        // This is to store the name of my file rather than having to re-type it several times.
        String FileName = "status.txt";
        
        
        try (BufferedWriter myWriter = new BufferedWriter(new FileWriter(FileName, false));) {       
        // Create a BufferedWriter and FileWriter and writer a file.
        // True = append to the file.
        // False = overwrite the file.
        
        // Write the data to the file.
        // From first to the firstname initial character.
        String textWord1 ="Ms. Angelina, Jolie";
        myWriter.write(textWord1.substring(0,15) + "\nSchool");
        myWriter.newLine();
        
        String textWord2 = "Mr. Leonardo, DiCaprio";
        myWriter.write(textWord2.substring(0,15) + "\nSchool");
        myWriter.newLine();
        
        String textWord3 = "Ms. Anne, Hathaway";
        myWriter.write(textWord3.substring(0,11) + "\nSchool");
        myWriter.newLine();
        
        String textWord4 = "Mr. Tom, Hanks";
        myWriter.write(textWord4.substring(0,10) + "\nCollege");
        myWriter.newLine();
        
        String textWord5 = "Ms. Charlize, Ther";
        myWriter.write(textWord5.substring(0,15) + "\nCollege");
        myWriter.newLine();
        
        String textWord6 = "Mr. Keanu, Reeves";
        myWriter.write(textWord6.substring(0,12) + "\nRetired");
        myWriter.newLine();
        
        String textWord7 = "Ms. Julia, Roberts";
        myWriter.write(textWord7.substring(0,12) + "\nRetired");
        myWriter.newLine();
        
        String textWord8 = "Mr. Denzel, Washington";
        myWriter.write(textWord8.substring(0,13) + "\nRetired");
        myWriter.newLine();
        
        
        
        // Looking for a space.
        String myStr;
        myStr = " ";
            System.out.println(myStr.indexOf(" "));

        
                
        
        // Close the BufferedWriter.
        myWriter.close();
        
        }
        
        // Error writing file.
        catch (IOException e){
            System.out.println("Error writing to file " +  FileName);        
        }
            
               
    }
    
}
