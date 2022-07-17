package com.courses.lesson5;

import java.util.Scanner;

public class HomeworkMainTasks
{
    public void makeThreeDimensionalArray()
    {
        System.out.println("##Задание с трёхмерным массивом##");

        int[][][] threeDimensionArray =
                {
                        {
                                {1, 4, 6},
                                {1, 3, 7},
                                {2, 6, 8}
                        },
                        {
                                {1, -2, 3},
                                {2, 3, 4},
                                {5, 9, 1}
                        },
                        {
                                {4, 5, 6},
                                {1, 2, 3},
                                {2, 3, 1}
                        }
                };
        System.out.println("Начальный массив:");
        for (int[][] twoDimensionArray : threeDimensionArray)
        {
            System.out.println();
            for (int[] oneDimensionArray : twoDimensionArray)
            {
                System.out.println();
                for (int value : oneDimensionArray)
                {
                    System.out.print(value + " ");
                }
            }
        }

        System.out.println();
        Scanner additionalNumberScanner = new Scanner(System.in);
        System.out.print("Введите число на которое будет увеличен каждый член массива: ");
        int additionalNumber = additionalNumberScanner.nextInt();

        for (int[][] twoDimensionArray : threeDimensionArray)
        {
            System.out.println();
            for (int[] oneDimensionArray : twoDimensionArray)
            {
                System.out.println();
                for (int value : oneDimensionArray)
                {
                    System.out.print(value + additionalNumber + " ");
                }
            }
        }
    }

    public void makeChess()
    {
        String[][] chess = new String[8][8];
        for (int i = 0; i < chess.length; i++)
        {
            System.out.println();
            for (int j = 0; j < chess.length; j++)
            {
                if ((i + j) % 2 == 0)
                {
                    chess[i][j] = "W";
                }
                else
                {
                    chess[i][j] = "B";
                }
                System.out.print(chess[i][j]);
            }
        }

    }
}
