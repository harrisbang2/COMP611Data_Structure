/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4_3;

import java.util.Iterator;
import java.util.SortedSet;
/**
 *
 * @author harri
 */
public class rotation {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args)
   {  // create the binary search tree
      BinarySearchTree<String> tree = new BinarySearchTree<String>();
      // build the tree
      tree.add("cow");tree.add("fly");tree.add("dog");tree.add("bat");
      tree.add("fox");tree.add("cat");tree.add("eel");tree.add("ant");
      System.out.println("Original Tree: " + tree);
      System.out.println("left Rotation");
      tree.leftRotationOfroot();
       System.out.println("left Rotation(root cow -> fly): " + tree);
      System.out.println("Right Rotation");
      tree.rightRotationOfroot();
      System.out.println("right Rotation:(root fly -> cow) " + tree);


   }
    
}
