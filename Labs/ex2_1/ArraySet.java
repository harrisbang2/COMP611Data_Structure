/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_1;


/**
 *
 * @author harri
 */
public class ArraySet<E>{


protected boolean a;
protected int size;
private int capacity=10;
private E[] elements;
    public ArraySet() {
     size = 0;
     elements = (E[])(new Object[capacity]);
    }
public boolean add(E o)
{ 
if(contains(o)){
return false;
}
if(size >= elements.length){
expandcapacity();
}
elements[size] = o;
size++;
return true;
}
    public boolean remove(Object o) {
    int index = 0;
boolean found = false;
for (int i=0; i<size && !found; i++)
{  if (elements[i].equals(o))
{  index = i;
found = true;
}
}
if (found) 
{  // replace the element by last element
elements[index] = elements[size-1];
elements[size-1] = null; 
size--;
}
return found;
}    


    public int size() {
    return size;      
    }

    public boolean isEmpty() {
        return (size==0);
    }

    public boolean contains(E o) {
     boolean found = false;
     for(int i = 0;i < size; i++){
     if(elements[i] == null){
     return false;
     }
     if(elements[i].equals(o)){
     found = true;
     }
     }
     return found;
    }
    public void clear() {
        elements = null;
        size = 0;
    }
    public void expandcapacity(){
    E[] largerArray = (E[])(new Object[elements.length*2]);
// copy the elements array to the largerArray
    for (int i=0; i<size; i++)
    largerArray[i] = elements[i];
    elements = largerArray;
    }
}
