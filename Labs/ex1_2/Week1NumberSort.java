package ex1_2;

import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sehun bang 20111406
 */

public class Week1NumberSort {
public static void selections_sort(int[] array){
    int max=10;
    for (int i=0;i<max;i++){
        for (int k=0;k<max;k++)
        if(array[i]<array[k]){
            int mem = array[k];
            array[k]=array[i];
            array[i]=mem;
        }
    }
}
    public static void main(String args[]) {
        int max=10;
        int[] number=new int[max];
        Random gen = new Random();
        for(int i = 0;i<max;i++){
        number[i]=gen.nextInt(100);
        } 
        System.out.println("number were");
        System.out.println(Arrays.toString(number));
        selections_sort(number);
        System.out.println("number are now sorted");
        System.out.println(Arrays.toString(number));

    }
}
