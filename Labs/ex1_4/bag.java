/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author harri
 * @param <E>
 */
public class bag<E> extends ArraySet {
    private Random rand;
    private int numElement;
    private E[] array;
    int capacity=0;
    
    public bag(int capacity){
    numElement=0;
    array=(E[])(new Object[capacity]);
    this.capacity=capacity;
    rand = new Random();
    }
    public boolean add(Object item){
    if(numElement < array.length){
        array[numElement]= (E) item;
        numElement++;
        return true;
    }
    else{
    return false;
    }
    }
    public E grab(){
    if (numElement > 0){
    return array[rand.nextInt(numElement)];
    }
    else
    System.out.println("Bag is Empty");
        return null;
    }

    public int size() {
        return numElement;//To change body of generated methods, choose Tools | Templates.
    }  
    public boolean isEmpty() {
    return numElement==0; 
    }

    public boolean contains(E o) {
        int i = 0;    
        boolean found =false;
        while (i<=numElement) {
        if(array[i]==o){
        found = true;
        break;
        }
    }   
        return found;
    }
}