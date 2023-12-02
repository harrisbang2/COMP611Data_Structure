/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4_4;

/**
 *
 * @author harri
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       QueueADT<task<?>> queue = new priorityQueue();
       
       queue.enqueue(new task<>(1,"apple"));
       queue.enqueue(new task<>(2,"cake"));
       queue.enqueue(new task<>(1,"choco"));
       queue.enqueue(new task<>(2,"grapes"));
       queue.enqueue(new task<>(3,"pears"));
       queue.enqueue(new task<>(4,"juice"));
       queue.enqueue(new task<>(6,"coke"));
       queue.enqueue(new task<>(4,"noodles"));
       queue.enqueue(new task<>(5,"food"));
       System.out.println(queue.toString());
       while(!queue.isEmpty()){
       System.out.println("the deque by sort(comparable) :"+queue.dequeue());  
       } 
       
    }
    
}
