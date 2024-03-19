package org.example.JavaCoding;

public class Task2 {
    public static void main(String[] args) {
        //Create an array of integer values. After the array is created,
        // calculate the sum of all stored elements in that array.

        int [] numbers = {10, 17, 20, 23, 21};
        int sum = 0;
        for (int num:numbers){
            sum=sum+num;
        }
        System.out.println(sum);


    }
}




