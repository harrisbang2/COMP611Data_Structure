/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4_4;

import java.util.NoSuchElementException;

/**
 *
 * @author harri
 */
public class priorityQueue implements QueueADT<task<?>> {
private ArrayHeap<task<?>> heap;
    public priorityQueue() {
        heap = new ArrayHeap<>();
    }

    @Override
    public void enqueue(task<?> element) {
    heap.add(element);
    }

    @Override
    public task<?> dequeue() throws NoSuchElementException {
    return heap.removeMin();
    }

    @Override
    public task<?> first() throws NoSuchElementException {
     return heap.getMin();
     }

    @Override
    public boolean isEmpty() {
    return heap.isEmpty();
    }

    @Override
    public int size() {
    return heap.size();
    }
@Override
    public String toString(){
    String output="[";
    output += heap.toString()+", \n";
    output += "]";
    return output;
    }
}
