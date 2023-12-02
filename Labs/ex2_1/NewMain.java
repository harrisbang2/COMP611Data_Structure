/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_1;
import java.util.Random;
import java.util.Set;


/**
 *
 * @author harri
 */
public class NewMain{
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      ArraySet<Integer> set = new ArraySet<Integer>();
      Random rand = new Random();
      
      long start = System.currentTimeMillis();
      for(int i = 0; i <1000;i++){
      int a = rand.nextInt();
       set.add(a);
      }
      long end = System.currentTimeMillis();      
      System.out.println("Set Took "+((double)(end-start))+" Milliseconds");
    }
}

