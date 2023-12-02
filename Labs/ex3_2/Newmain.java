/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_2;

/**
 *
 * @author harri
 */
public class Newmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayQueue<Integer> circlequeue = new ArrayQueue<Integer>();
        circlequeue.enqueue(1);
        circlequeue.enqueue(2);
        circlequeue.enqueue(3);
        System.out.println(circlequeue.toString());
        circlequeue.enqueue(4);
        circlequeue.enqueue(5);
        System.out.println(circlequeue.toString());
        circlequeue.enqueue(6);
        System.out.println(circlequeue.toString());
        circlequeue.enqueue(7);
        circlequeue.enqueue(8);
        circlequeue.enqueue(9);
    
        System.out.println(circlequeue.toString());
        circlequeue.dequeue();
        System.out.println(circlequeue.toString());
        
    }
}
