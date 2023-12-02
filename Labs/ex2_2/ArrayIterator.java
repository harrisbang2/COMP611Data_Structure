package ex2_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author harri
 */
public class ArrayIterator<E> implements Iterator<E>{
private int numElements;
private E[] element;
private int nextIndex;
public ArrayIterator(E[] element,int numElements)
{
if(numElements > element.length){
numElements = element.length;
}
this.numElements=numElements;
this.element=element;
nextIndex=0;
}

    @Override
    public boolean hasNext() {
    return (nextIndex < numElements);    
    }
    @Override
    public E next() {
     if(!hasNext()){
     throw new NoSuchElementException();
     }
     return element[nextIndex++];
    }
    @Override
    public void remove() {
        Iterator.super.remove(); //To change body of generated methods, choose Tools | Templates.
    }    
}
