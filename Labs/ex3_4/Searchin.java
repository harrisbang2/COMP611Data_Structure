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
public class Searchin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Linkedlist a = new Linkedlist<String>();
        a.add("apple");
        a.add("pears");
        a.add("grapes");
        a.add("cake");
        a.Search(a,"pears");
        a.Search(a,"cake");
        a.Search(a,"algorism");
    }
    
}
