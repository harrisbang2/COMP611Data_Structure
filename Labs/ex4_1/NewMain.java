/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4_1;

/**
 *
 * @author harri
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinikedBinaryTreeNode binaryt = new LinikedBinaryTreeNode<>();
      binaryt.insert(1);
      binaryt.insert(2);
      binaryt.insert(3);
      binaryt.insert(4);
      System.out.print(binaryt.toString());
      
    }
    
}
