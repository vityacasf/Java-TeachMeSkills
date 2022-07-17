package com.courses.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMainTasks
{
    public void findNumberInArray()
    {
        System.out.println("##Задание: 'Есть ли число в массиве?'##");

        int[] array = {1,3,5,7,15};

        Scanner numberScanner = new Scanner(System.in);
        System.out.print("Type in a number: ");
        int number = numberScanner.nextInt();

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == number)
            {
                System.out.println(i+1 + "-e число совпало");
            }
            else
            {
                System.out.println(i+1 + "-e число не совпало");
            }
        }
    }

    public void deleteNumberFromArray()
    {
        System.out.println("##Задание: 'Убрать число из массива'##");

        int[] arr = {1,6,12,11,7,8};
        int[] newArr = null;
        System.out.println("Изначальный массив: " + Arrays.toString(arr));

        Scanner numberForDeleteScanner = new Scanner(System.in);
        System.out.print("Type in a number, which you want delete: ");
        int numberForDelete = numberForDeleteScanner.nextInt();

        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] == numberForDelete)
            {
                newArr = new int[arr.length - 1];
                for (int index = 0; index < i; index++)
                {
                    newArr[index] = arr[index];
                }
                for (int j = i; j < arr.length - 1; j++)
                {
                    newArr[j] = arr[j + 1];
                }
                System.out.println("New array: " + Arrays.toString(newArr));
            }
            else
            {
                System.out.println("Заданного числа нет в массиве, массив не изменился");
            } break;
        }
    }

    public void makeRandomArray()
    {
        System.out.println("##Задание: 'Рандомный массив'##");

        Scanner quantityOfNumbersInArrayScanner = new Scanner(System.in);
        System.out.print("Type in quantity of numbers in array: ");
        int quantityOfNumbersInArray = quantityOfNumbersInArrayScanner.nextInt();

        int[] array = new int[quantityOfNumbersInArray];
        int min = 20;
        int max = 0;
        int sum = 0;
        int average;

        for (int i = 0; i < quantityOfNumbersInArray - 1; i++)
        {
            array[i] = (int)(Math.random() * 20);
        }

        System.out.println("Наш массив: " + Arrays.toString(array));

        for (int j = 0; j < quantityOfNumbersInArray - 1; j++)
        {
            sum = sum + array[j];
            if (min > array[j])
            {
                min = array[j];
            }
            if (max < array[j])
            {
                max = array[j];
            }
        }
        average = sum / quantityOfNumbersInArray;
        System.out.println("минимальное: " + min);
        System.out.println("макисмальное: " + max);
        System.out.println("среднее: " + average);
    }

    public void operationsWithTwoArrays()
    {
        System.out.println("##Задание: 'Всякие операции с двумя массивами'##");

        int[] firstArray = {4,5,6,7,12};

        int[] secondArray = {5,4,6,7,22};

        int sumOfFirstArray = 0;
        int sumOfSecondArray = 0;

        for (int i : firstArray)
        {
            sumOfFirstArray = sumOfFirstArray + i;
        }

        System.out.println("Первый массив: " + Arrays.toString(firstArray));

        for (int k : secondArray)
        {
            sumOfSecondArray = sumOfSecondArray + k;
        }

        System.out.println("Второй массив: " + Arrays.toString(secondArray));

        if (sumOfSecondArray > sumOfFirstArray)
        {
            System.out.println("Second array bigger");
        }
        else if (sumOfFirstArray > sumOfSecondArray)
        {
            System.out.println("First array bigger");
        }
        else
        {
            System.out.println("Суммы равны");
        }
    }
}

