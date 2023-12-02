/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_2;
import java.util.Collection;
/**
 *
 * @author harri
 */
public class LinkedSortedSet <E extends Comparable<E>> extends LinkedSet<E>
{
    public LinkedSortedSet(){
    super();
    }
    public LinkedSortedSet(Collection<? extends E> c){
    super(c);
    }
    public synchronized boolean add(E o){
     if(contains(o)){
     return false;
     }
     Node<E> newNode = new Node<E>(o);
     if(firstNode == null || o.compareTo(firstNode.element)<= 0){ 
      newNode.next = firstNode;firstNode = newNode;}
      else{   
      Node<E> currentNode = firstNode;
      while(currentNode.next != null && o.compareTo(currentNode.next.element)>=0){ 
          currentNode = currentNode.next;
      }    
     newNode.next = currentNode.next;
     currentNode.next = newNode;
}          
numElements++;
return true;
}
     public synchronized boolean remove(E o){
        return super.remove(o);
    }
    public synchronized void clear(){
    super.clear();
    }
}
