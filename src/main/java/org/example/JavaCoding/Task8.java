package org.example.JavaCoding;

public class Task8 {
    public static void main(String[] args) {


        // Maximum and minimum number in array

        int[] numbers = {23, 45, 44, 21, 80};
        int max = numbers[0];
        for (int num : numbers) {
            if (max < num) {
                max = num;
                System.out.println(max = num);

            }
        }
        int minimum = numbers[0];
        for (int num : numbers) {
            if (minimum > num) {
                minimum = num;

                System.out.println(minimum = num);


            }
        }
    }
}









