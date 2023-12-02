/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_2;

import java.util.Set;
/**
 *
 * @author harri
 */
public class run {

    public static void main(String[] args) {
       LinkedSortedSet<String> fruit = new LinkedSortedSet<String>();
       fruit.add("straw berry");
       System.out.println(fruit);
       fruit.add("rasp berry");
       fruit.add("apple");
       fruit.add("banana");
       fruit.add("banana");
       System.out.println(fruit);
    }
}
