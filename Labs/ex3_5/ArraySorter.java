/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_5;

import java.util.Random;

/**
 *
 * @author harri
 */
public class ArraySorter<E extends Comparable> {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[1000];
        Random rand = new Random();
        for(int i=0;i < 1000;i++){
        array[i]= rand.nextInt(1000);
        }
        System.out.println("before sorted");
        for(int i:array){
        System.out.print(i+" ,");
        } 
        System.out.println("==================");
          /////////////////////////////////////////selection sort
       
        System.out.println("=======SelectionSort========");
        long Selectionstart =System.currentTimeMillis(); 
        SelectionSort(array); 
        for(int i:array){
        System.out.print(i+" ,");
        } 
        long Selectionend =System.currentTimeMillis();
        long Selectiontime = Selectionend - Selectionstart;
        System.out.println("\n=====timetook is : "+Selectiontime+"=========");
        ////////////////////////////////////////////bubble sort
        
        System.out.println("=======bubbletsort========");
        long bubblestart =System.currentTimeMillis();
        bubbleSort(array); 
        for(int i:array){
        System.out.print(i+" ,");
        } 
        long bubbleend =System.currentTimeMillis();
        long bubbletime = bubbleend - bubblestart ;
        System.out.println("\n=====timetook is : "+bubbletime+"=========");
          /////////////////////////////////////////merge Sort
         
        System.out.println("=======mergesort========");
        long mergestart =System.currentTimeMillis();
        MergSort(array); 
        for(int i:array){
        System.out.print(i+" ,");
        } 
        long mergeend =System.currentTimeMillis();
        long mergetime = bubbleend - bubblestart;
        System.out.println("\n=====timetook is : "+mergetime+"=========");
        
          ///////////////////////////////////////// Quick Sort
          
        System.out.println("=======Quicksort========");
        long Quickstart =System.currentTimeMillis();
        QuickSort(array,0,array.length-1); 
        for(int i:array){
        System.out.print(i+" ,");
        } 
        long Quickend =System.currentTimeMillis();
        long Quicktime = bubbleend - bubblestart;
        System.out.println("\n=====timetook is : "+Quicktime+"=========");
    }

    private static void bubbleSort(int[] array) {
    for(int i = 0 ; i <array.length;i++){
    for(int j=0;j<array.length;j++){
        if(array[j]>array[i]){
        int temp = array[j];
        array[j] = array[i];
        array[i]=temp;
        }
    }
    } 
    }
    private static void SelectionSort(int[] array) {
       for(int i = 0 ; i <array.length -1 ;i++){
       int min = i;
    for(int j=i+1;j<array.length;j++){
        if(array[min] > array[j]){   
        min = j;
        }
    }
    int temp= array[i];
    array[i] = array[min];
    array[min] = temp;
    } 
    }
    //merge
    private static void MergSort(int[] array){
    int length = array.length;
    if(length<=1){
        return;
    }
    int middle =length/2;
    int []Larray= new int[middle];
    int []Rarray= new int[length-middle];
 
    int l = 0; //left  
    int r = 0; //right
    
    for(;l<length;l++){
        if(l<middle){
        Larray[l] = array[l];
        }
        else{
        Rarray[r] = array[l];
        r++;
        }
    }
    MergSort(Larray);
    MergSort(Rarray);
    merge(Larray,Rarray,array);
     
    }
  
static void merge(int[] arr, int[] left_half, int[] right_half) {
if (arr.length < 2) return;
        int mid = arr.length / 2;

        int[] lefthalf = new int[mid];
        int[] righthalf = new int[arr.length - mid];

        // copying the elements of array into left_half
        for (int i = 0; i < mid; i++) {
            lefthalf[i] = arr[i];
        }
        
        // copying the elements of array into right_half
        for (int i = mid; i < arr.length; i++) {
            righthalf[i - mid] = arr[i];
        }
    }
 

    private static void QuickSort(int[] array, int begin,int end) {
    if(end <= begin) return;
     int piviot = partition(array,begin,end);
     QuickSort(array,begin,piviot-1);
     QuickSort(array,piviot+1,end);
    }

    private static int partition(int[] array, int begin, int end) {
   int pivot = array[end];
   int i = begin-1;
   for(int j = begin;j<=end-1;j++){
   if(array[j]<pivot){
   i++;
   int temp = array[i];
   array[i]=array[j];
   array[j]=temp;
   }
   }
   i++;
   int temp = array[i];
   array[i]=array[end];
   array[end]=temp;
   return i;
   }
  
}
