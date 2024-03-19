package org.example.JavaCoding;

public class Task4 {
    public static void main(String[] args) {
        //Create a 2D array of integers. Develop a program which will calculate the
        //sum of even and odd numbers for that array.

        int[][] numbers = {
                {13, 14, 24, 18, 30},
                {25, 24, 50, 16, 10},
                {30, 31, 68, 44, 45}
        };
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (numbers[i][j] % 2 == 0) {
                    sum = sum + numbers[i][j];
                } else if (numbers[i][j] % 2 != 0) {
                    sum1 = sum1 + numbers[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers is " + sum);
        System.out.println("The sum of odd numbers is " + sum1);


        }
    }





