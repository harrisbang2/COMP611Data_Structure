/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_1;

/**
 *
 * @author harri
 */
public class ArrayStacknoteff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numElements = 10000;
      ArrayStack<Integer> efficient = new ArrayStack<Integer>();
      InefficientStack<Integer> bad = new  InefficientStack<Integer>();
  long start =System.currentTimeMillis();
  System.out.println("testing a good stack");
      for(int i = 0; i< numElements;i++){
  efficient.push(i);
  }
  long end =System.currentTimeMillis();
  long badstart =System.currentTimeMillis();
   System.out.println("testing a bad stack");
  for(int i = 0; i< numElements;i++){
  bad.push(i);
  }
  long badend =System.currentTimeMillis();
  long goodresult = end-start;
  System.out.println("efficient stack took "+goodresult+" milliseconds");
  long badresult = badend-badstart;
   System.out.println("Inefficient stack took "+badresult+" milliseconds");
  }
    
}
