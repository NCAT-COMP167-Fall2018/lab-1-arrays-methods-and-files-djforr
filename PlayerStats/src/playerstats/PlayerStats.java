/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerstats;

import java.util.logging.Logger;

/**
 *
 * @author djforrest
 */
public class PlayerStats {
     public static void main(String[] args) {
        String[] names= new String[80];
        int[] scores= new int[80];
        
        
    
     }
    
     public static void readData(String[] names, int[] scores, String filename);static {
         readData(names, scores, args[0]);
     try{
            Scanner reader= new Scanner(new File(filename));
            
            int counter = 0
            while(reader.hasNext()){
                
                String[] line= reader.nextLine().split(" ");
                names[currentIndex] = Integer.parseInt(line[1]);
                currentIndex ++;
            
          
            
            
            }       
             
  }catch(FileNotFoundException ex) {
      Logger.getLogger(PlayerStats.class.getName()).log(Level);     
      System.err.println("File was not found in main method.");
         
         
  }
     
   
  }
          
          
    }
    
}
}