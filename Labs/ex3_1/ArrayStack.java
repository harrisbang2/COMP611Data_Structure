/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_1;

import java.util.NoSuchElementException;

/**
 *
 * @author harri
 */
public class ArrayStack<E> implements StackADT{
private E[] elements;
int numelements;
int capacity;
public ArrayStack(){
numelements=0;
capacity=10;
elements = (E[])(new Object[capacity]);
}
    @Override
   public void push(Object element) {
     if(numelements >= elements.length){
     expandCapacity();
     }
     elements[numelements]=(E) element;
     numelements++;
    }

    @Override
    public Object pop() throws NoSuchElementException {
       if(numelements >0){
        E topElements= elements[numelements];
        elements[numelements]=null;
        numelements--; 
       return topElements;
       }
      return null;
    }

    @Override
    public Object peek() throws NoSuchElementException {
    if(numelements > 0)
    return elements[numelements-1]; 
    else
     throw new NoSuchElementException();
    }

    @Override
    public boolean isEmpty() {
    return (numelements == 0);  
    }

    @Override
    public int size() {
    return numelements;       
    }
public String toString(){
    String output="[";
    for(int i =numelements-1;i>=0;i-- ){
    output += elements[i];
    if(i>0){
    output += ", ";
    }
    }
      output += " ]";
    return output;
}
    private void expandCapacity() {
        E[] largerArray = (E[])(new Object[capacity*2]);
        capacity*=2;
        for(int i=0; i<numelements;i++){
        largerArray[i]=elements[i];
        }
        elements = largerArray;
    }
}
