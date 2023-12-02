/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_2;

import java.util.NoSuchElementException;

/**
 *
 * @author harri
 */
public class ArrayQueue<E> implements QueueADT{

    private int head;
    private int tail;
    private E[] elements;
    private int numelements;
    private int capacity;
public ArrayQueue(){
numelements=0;
head=0;
tail=0;
capacity=5;
elements = (E[])(new Object[capacity]);
}

    @Override
    public void enqueue(Object element) {
        if(numelements==capacity){
        expandCapacity();
        }
        elements[tail]=(E)element;
        tail++;
        if(tail==capacity){
        tail = 0;
        head ++;
        }
        numelements++;
    }

    @Override
    public Object dequeue() throws NoSuchElementException {
    if(isEmpty()){
    System.out.println("the queue is empty");
    return null;
    }
    E ele =  elements[tail];
    elements[tail] = null;
    tail--;
    if(tail<=0){
    tail = capacity;
    }
    return ele;
    }

    @Override
    public Object first() throws NoSuchElementException {
    return elements[tail];
    }

    @Override
    public boolean isEmpty() {
        return numelements==0;
    }

    @Override
    public int size() {
    return numelements;    
    }
    public void expandCapacity(){
        this.capacity *= 2;
        E[] largerArray = (E[])(new Object[capacity]);
       
        for(int i=0; i<numelements;i++){
        largerArray[i]=elements[i];
        }
        this.elements = largerArray;
        
    }
    @Override
    public String toString(){
    String output = "[ ";
     for(int i = 0;i<numelements;i++){
     output += elements[i];
     output += ",";
    }
     output += " ]";
    return output;
    }
    public boolean isfull(){
    boolean full=false;
    if(numelements==capacity){
    full = true;
    }
    return full;
    }
}
