/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bitmapGenerator;
import java.util.*;

/**
 * 
 * Creates and displays an 8 x8 bitmap from
 * 8 given hex values
 *
 * @author s0n_of_a_glitch
 * @date   2014.19.07
 */
public class BitmapGenerator
{
   
   // Instance variables
   String[] hexArray;
   
   
   // Constructors   
   
   /**
   * Constructor for object of the Bitmap Generator class
   * Initialises the hexArray to default values
   */  
   public BitmapGenerator()
   {
      hexArray = new String[8];
      hexArray[0] = "18";
      hexArray[1] = "3C";
      hexArray[2] = "7E";
      hexArray[3] = "7E";
      hexArray[4] = "18";
      hexArray[5] = "18";
      hexArray[6] = "18";
      hexArray[7] = "18";   
   }
   
   
   /**
   * Constructor for objects of the Bitmap Generator class
   * Initialises the hexArray to the value of aHexArray
   * 
   * @param aHexArray String array representing hex values
   */ 
      public BitmapGenerator(String[] aHexArray)
   {
      hexArray = aHexArray;
   }
   
   /**
    * Sets the hexArray to the values of the Strings
    * hex1 - hex8, respectively
    * 
    * @param hex1
    * @param hex2
    * @param hex3
    * @param hex4
    * @param hex5
    * @param hex6
    * @param hex7
    * @param hex8
    */
   public void setHexArray(String hex1, String hex2, String hex3, String hex4, String hex5, String hex6, String hex7, String hex8)
   {
      hexArray[0] = hex1;
      hexArray[1] = hex2;
      hexArray[2] = hex3;
      hexArray[3] = hex4;
      hexArray[4] = hex5;
      hexArray[5] = hex6;
      hexArray[6] = hex7;
      hexArray[7] = hex8;   
   }


   public String[] getHexArray()
   {
      return this.hexArray;
   }


   // Instance methods

   /**
   *  converts an array of hex values (String) to binary and
   *  creates bitmap (0 = ' ', 1 = 'x')
   * @return   outputString a String representing a bitmap
   */
   public StringBuilder getBitmap()
   {
   StringBuilder outputString = new StringBuilder();   
      
      // For each value in the hexArray
      for(String aHex : getHexArray())
      {

         // Convert to binary and store as StringBuilder object, outputString
         String binaryString = this.convertToBinary(aHex);
        
         // Convert binary string to bitmap
        outputString = outputString.append(this.convertToBitmap(binaryString) + "\n");
         
      }
       return outputString;
      
}

   /**
   * Helper method - convertToBinary
   * Takes a String hex value and converts to a binary String
   * Creates new StringBuilder objects and outputs
   * @return 
   */
   private String convertToBinary(String aHex)
   {
   int binaryInt = Integer.parseInt(aHex, 16);
   String binaryString = String.format("%8s", Integer.toBinaryString(binaryInt)).replace(' ', '0');
 
   return binaryString;
   }
   
   
  /**
   * Helper method - convertToBitmap
   * Takes a String binary value and converts to a bitmap
   * (0 = ' ', 1 = ' ')
   * 
   * @return String  A bitmap representation of the binary input
   */
   private StringBuilder convertToBitmap(String aBinaryString)
   {
      StringBuilder outputString = new StringBuilder(aBinaryString);
      
    // For each character in aBinaryString
         for(int i = 0; i < aBinaryString.length(); i++)
         {
           
            // If '0' convert to ' '
            if(aBinaryString.charAt(i) == '0') 
               {
                  outputString.setCharAt(i, ' ');
               }
            else if(aBinaryString.charAt(i) == '1')
               {
                  outputString.setCharAt(i, 'x');
               }

         }
      return outputString;
   }
   
   
   
}
