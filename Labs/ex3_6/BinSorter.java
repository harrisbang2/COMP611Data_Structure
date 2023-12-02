/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_6;

import java.util.Random;

/**
 *
 * @author harri
 */
public class BinSorter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array = new int[100];
        Random rand = new Random();
        for(int i=0;i < 100;i++){
        array[i]= rand.nextInt(100);
        }
        System.out.println("before sorted");
        for(int i:array){
        System.out.print(i+" ,");
        } 
        System.out.println("\n==================");
        System.out.println("=====binsort=======");
        binsort(array,100);
        for(int i:array){
        System.out.print(i+" ,");
        } 
    }

    private static void binsort(int[] array,int max) {
    boolean[] flags = new boolean[max+1];
    for (int i=0; i<array.length; i++)
    flags[array[i]] = true;
        var flagNo = 0;
    for (int i=0; i<array.length; i++)
{ 
     while (flagNo<flags.length && !flags[flagNo])
     flagNo++;
     array[i] = flagNo++;
}
}
}
