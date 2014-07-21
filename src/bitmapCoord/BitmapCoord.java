/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bitmapCoord;
import bitmapGenerator.*;

/**
 * Coordinating class for members of the BitmapGenerator class
 * 
 * @author Fleetwood
 */
public class BitmapCoord
{
   
   BitmapGenerator bitmapGen;
   
   /**
    * Constructor for objects of the BitmapCoord class
    */
   public BitmapCoord()
   {
      bitmapGen = new BitmapGenerator();
   }
   
   /**
    * Sets the bitmapGenerator's hexArray to the values of the text areas
    */
   public void SetHex(String hex1, String hex2, String hex3, String hex4, String hex5, String hex6, String hex7, String hex8)
   {
      bitmapGen.setHexArray(hex1, hex2, hex3, hex4, hex5, hex6, hex7, hex8);
   }
   
   /**
    * Updates the output area of the GUI
    * @return bitmap a String representing a bitmap
    */
   public StringBuilder getBitmap()
   {
      StringBuilder bitmap = new StringBuilder(bitmapGen.getBitmap());
      return bitmap;
   }
   
}
