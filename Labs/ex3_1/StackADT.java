/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_1;

/**
 *
 * @author harri
 */
/**
An interface that defines the abstract data type
for a stack collection of elements with type E
*/
import java.util.NoSuchElementException;
public interface StackADT<E>
{
// adds one element to the top of this stack
public void push(E element);
// removes and returns the top element from this stack
public E pop() throws NoSuchElementException;
// returns without removing the top element of this stack
public E peek() throws NoSuchElementException;
// returns true if this stack contains no elements
public boolean isEmpty();
// returns the number of elements in this stack
public int size();
}
