package com.Arraysworkshop;

import java.util.Arrays;
import java.util.Scanner;

/* Write a program to SEARCH AN ELEMENT IN THE EXISTING ARRAY?*/
public class SearchElement {

     void searchEle(int data , int[] searchArray){

         //by using for-loop
//        for (int i=0;i<searchArray.length;i++){
//           if (searchArray[i] == data){
//               System.out.println("Given element exist in Array");
//                break;
//            }else {
//               System.out.println("element doesn't exist");
//           }
//
//
//        }

         //by using while-loop
         int length=searchArray.length;
         int i=0;
         boolean found = false;
         while(i<searchArray.length){
             if (searchArray[i] == data){
                 found = true;
              System.out.println("Given element exist in Array");

           }
             i++;
         }

         if (found == true){
             System.out.println("Element exist ");
         }else {
             System.out.println("Element doesn't exist");
         }
    }

    int[] createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements you want add to array");
        int length = sc.nextInt();
         int[] array = new int[length];
        System.out.println("Enter element's");
         for (int i=0;i<length;i++){
             array[i] = sc.nextInt();
         }
         return array;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the element you want to search");
        int element = sc.nextInt();

        SearchElement obj1 = new SearchElement();
        SearchElement obj2 = new SearchElement();
        obj2.searchEle(element , obj1.createArray());

    }
}
