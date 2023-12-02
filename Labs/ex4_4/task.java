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
public class task<E extends Comparable> implements Comparable<task>{
private int p;
private E element;
public task(int p,E element){
this.p=p;
this.element=element;
}

    public int getP() {
        return p;
    }

    public E getElement() {
        return element;
    }
@Override
public String toString(){
String output= "[";
output +=p+","+element;
output += "]";
return output;
}
    @Override
    public int compareTo(task o) {
      if(p == o.getP()){
      return element.compareTo(o.element);
      }
      else{
      return p-o.p;
      }
    }
    
}
