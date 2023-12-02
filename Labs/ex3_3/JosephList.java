/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_3;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 *
 * @author harri
 */
public class JosephList<E> implements QueueADT{
private E[] elements;
private int head;
private int tail;
private int numelements=0;
private int capacity;
JosephList(){
numelements=0;
head=0;
tail=0;
capacity=7;
elements = (E[])(new Object[capacity]);
}
    @Override
    public void enqueue(Object element) {
// I dont think i need to expand capacity for this lab
        elements[head]=(E)element;
        head++;
        if(head==capacity){
        head = 0;
        head ++;
        }
        numelements++;
    }
    
    public void josephdequeue() throws NoSuchElementException {
    if(isEmpty()){
    System.out.println("the queue is empty");
    }    
    tail += 2;

    System.out.println(elements[tail]+" is killed");

    elements[tail] = null;
    if(tail+2>=capacity){
    tail = tail-capacity;
    }
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
