package org.example.JavaCoding;

public class Task3 {
    public static void main(String[] args) {
        //Create 2D array of integers type where you will store odd and even numbers.
        //Develop a program which will identify/print the even numbers only.

        int[][] numbers = {
                {20, 12, 46, 30, 60},
                {21, 11, 15, 65, 29},
                {22, 26, 10, 55, 16}
        };

        for (int i = 0; i < 3; i++) {
            for (int b = 0; b < 4; b++) {
                if (numbers[i][b] % 2 == 0) {
                    System.out.println(numbers[i][b] + " ");
                }
            }
            System.out.println();


        }
    }
}




