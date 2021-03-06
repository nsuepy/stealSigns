/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nick
 */

// need arrays to input the sign
// loop through substrings see matching pairs
// need to store if steal or not
// boolean var for if steal
// need to hold arrays 
// check nums that match back to back in each array to check for steal 


import java.util.*;

public class stealSigns {
    
    
     public static void main(String[] args) {
         
         Scanner scn = new Scanner(System.in);
         boolean go = true;
         boolean findingSteals = true;
         int signs1 = 0;
         int signs2 = 0;
         int n = 0;
         int s = 0;
         int rows = 10;
         int x;
         int y = 0;
         int num2 = 1;
         int steal1 = 0;
         int steal2 = 0;
         int steal3;
         int steal4;
         int steal5;
         int steal6;
         int numOfNonsteal = 0;
         
         List<Integer> stealOrNot = new ArrayList<Integer>();       
         ArrayList<Integer>[] al = new ArrayList[rows];
         
         for(int i = 0; i < n; i++){
         
             go = true;
             
         while(go == true){                                                     // setting up the array lists with sign data
             System.out.println("What was the sign: ");
             int sign = scn.nextInt();
             
             al[i].add(sign);
             
             System.out.println("More signs? (y/n) ");
             String more = scn.next();
             
             if(more == "y"){
                    go = true;
                }
                else {
                    System.out.println("steal? (y/n) ");
                    more = scn.next();
                        if(more == "y"){
                            stealOrNot.add(1);
                        }
                        else{
                            stealOrNot.add(0);
                        }
                   go = false;
                }
         }
         
        }
         
         while(findingSteals == true){                                      //getting 2 sequences that are steals 
             
             
             for(int j = 0; j < rows; j++){
                 if(stealOrNot.get(j) == 1 && signs1 != 0){
                     signs1 = j;
                 }
                 else if(stealOrNot.get(j) == 1){
                     signs2 = j;
                     findingSteals = false;
                 }
             }
         }
         
         
             for(int p = 0; p <= al[signs1].size(); p++){                   //sets the two signs that match to steal 1 and 2 ints
                 y++;
                 for(int t = 0; t <= al[signs2].size(); t++){
                     if(al[signs1].get(p) == al[signs2].get(t) && al[signs1].get(y) == al[signs2].get(num2)){
                         steal1 = al[signs1].get(p);
                         steal2 = al[signs1].get(y);
                     }
                     else{
                         num2++;
                     }
                 }
             }
             
             for(int r = 0; r < stealOrNot.size(); r++){            //comparing to a non steal signs to thought to be steal sign
                 if(stealOrNot.get(r) == 0){
                     if(al[r].get(numOfNonsteal) == steal1 && al[r].get(numOfNonsteal + 1) == steal2){
                         System.out.println("Picked wrong sign");
                         steal1 = 0;
                         steal2 = 0;
                     }
                     else{
                         System.out.println("Correct steal signs");
                     }
                 }
     }
         }
         
     }


