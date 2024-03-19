package org.example.JavaCoding;

public class Task1 {
    public static void main(String[] args) {
        //Create a program that uses an array to store a list of temperature for a week,
        // and then uses a loop to find the highest and lowest temperature for the week.

        int [] temp = {28,37,31,58,45,32,21};
        int high=temp[0];
        for (int num:temp){
            if (high<num){
                high=num;
            }
        }
        int low=temp[0];
        for (int num:temp){
            if (low>num){
                low=num;
            }
        }
        System.out.println("The highesttemp of the week is "+high);
        System.out.println("The lowest temp of the week is "+low);

    }
}




