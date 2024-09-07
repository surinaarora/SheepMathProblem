/*
@Author: Surina Arora 
@Date: Nov 10th 2023 
@Description: 
This program calculates the number of sheep increase over the course of
25 years. Around 10 years, there will be approximately 86 sheep, meaning 
they will not require any supervision forward. 
*/ 

import java.lang.Math;

class Surina_Arora_Sheep_Math_Problem{
   public static void main (String [] args){
   
//variable declaration and execution 

   for (double t = 0; t <= 25; t++) { //let t represent years 
            
      double N = 220/(1 + 10*(Math.pow(0.83,t))); //let N represent the number of sheep
      if (t < 10)
      
//program output
   
   System.out.println((int)N + " sheep after " + (int)t + " years are supervised");
      if (t >= 10)
   System.out.println((int)N + " sheep after " + (int)t + " years are not supervised");     
          
     }
   }//end main
}//end program 