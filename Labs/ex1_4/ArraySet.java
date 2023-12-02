/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_4;

/**
 *
 * @author harri
 */
public class ArraySet <E>{
    private ArraySet ob;
    public void add(ArraySet ob){
    this.ob = ob;
    }
    public ArraySet get(){
    return ob;
    }
    public void print(ArraySet<? extends System> ob){
    System.out.print(" ");
    } 
}
