/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_4;


/**
 *
 * @author harri
 */
public class Linkedlist<E extends Comparable<E>>{
    private int numElements;
    public Node<E> firstNode;
    //
   
    public boolean Search(Linkedlist o,E e){
    Node<E> next = o.firstNode;
    boolean found = false;
    int num=0;
    while(next !=null && !found){
    if(next.element.equals(e)){
    System.out.println("the search :"+e+" is found in index :"+num);
    found = true; 
    }
    else{
    next=next.next;
    num++;
    }
    }
    if(!found){
         System.out.println("the search :"+e+" is not in the List");
    }
    return found;
    }
    //add
    public void add(E o){
    Node<E> newNode = new Node<>(o);
    if(firstNode == null ||(o.compareTo(firstNode.element)<=0)){
        newNode.next=firstNode;
        firstNode=newNode;
    }
    else{
    Node<E> currentNode = firstNode;
    while(currentNode.next!=null){
    currentNode=currentNode.next;
    }
    currentNode.next=newNode;
    numElements++;
    }
    System.out.println("adding  "+ o);
    }
    /////////////////////////////////
    //remove
    public boolean remove(E e){
    if(firstNode == null){
       return false;
    }
    if(firstNode.element.equals(e)){
    firstNode = firstNode.next;
    numElements--;
    }
    else{
    Node<E> currentNode =firstNode;
    while(currentNode!=null){
        if(currentNode.next.element.equals(e)){
        currentNode.next=currentNode.next.next;
        return true;
        }
        else{
        currentNode =currentNode.next;
        }
    }
    }
    return false;
    }
    ////////////////-------------
    public boolean contains(E e){
    int num=0;
    Node<E> current =firstNode;
    boolean found = false;
    while(current !=null && !found){
    if(current.element.equals(e)){
    found = true; 
    }
    else{
    current=current.next;
    num++;
    }
    }
    if(!found){
    }
    return found;
    }
    
    //////////////////////////////////
    public int size(){
    return numElements;
    }
    
    public void clear(){
    firstNode=null;
    numElements=0;
    }
///////node
private class Node<E> {
public E element;
public Node<E> next;
public Node<E> prev;
public Node(E element){
this.element = element;
next=null;
prev=null;
}
}
public Linkedlist()
{ super();
numElements = 0;
firstNode = null;
}

}