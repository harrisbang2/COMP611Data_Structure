/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_3;

/**
 *
 * @author harri
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JosephList j = new JosephList<Integer>();
        j.enqueue(1);
        j.enqueue(2);
        j.enqueue(3);
        j.enqueue(4);
        j.enqueue(5);
        j.enqueue(6);
        j.enqueue(7);
        System.out.println(j);
        j.josephdequeue();
        j.josephdequeue();
        j.josephdequeue();
        System.out.println(j);
        j.josephdequeue();
        j.josephdequeue();
        j.josephdequeue();
        j.josephdequeue();
        System.out.println(j);
    }
    
}
