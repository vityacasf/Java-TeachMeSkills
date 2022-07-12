package com.courses.lesson3;

import java.util.Scanner;

public class HomeworkExecutor
{
        public void findSeasonByMonthNumberCase()
        {
            System.out.println("##Задание с определением поры года по номеру месяца, через case##");

            Scanner numberOfMonthScanner = new Scanner(System.in);
            System.out.print("Type in a number of month: ");
            int numberOfMonth = numberOfMonthScanner.nextInt();

            switch (numberOfMonth)
            {
                case 1:
                case 2:
                case 12:
                {
                    System.out.println("Winter");
                } break;
                case 3:
                case 4:
                case 5:
                {
                    System.out.println("Spring");
                } break;
                case 6:
                case 7:
                case 8:
                {
                    System.out.println("Summer");
                } break;
                case 9:
                case 10:
                case 11:
                {
                    System.out.println("Autumn");
                } break;
                default:
                {
                    System.out.println("Вы ввели бред");
                } break;
            }
        }

        public void findSeasonByMonthNumberByIfElse()
        {
            System.out.println("##Задание с определением поры года по номеру месяца, через if-else##");

            Scanner numberOfMonthScanner = new Scanner(System.in);
            System.out.print("Type in a number of month: ");
            int numberOfMonth = numberOfMonthScanner.nextInt();

            if (numberOfMonth == 1 || numberOfMonth ==2 || numberOfMonth == 12)
            {
                System.out.println("Winter");
            }
            else if (numberOfMonth == 3 || numberOfMonth == 4 || numberOfMonth == 5)
            {
                System.out.println("Spring");
            }
            else if (numberOfMonth == 6 || numberOfMonth == 7 || numberOfMonth == 8)
            {
                System.out.println("Summer");
            }
            else if (numberOfMonth == 9 || numberOfMonth == 10 || numberOfMonth == 11)
            {
                System.out.println("Autumn");
            }
            else
            {
                System.out.println("Вы ввели бред");
            }
        }

        public void identifyNumberParity()
        {
            System.out.println("##Задание с определением на чётность##");

            Scanner numberForParityIdentification = new Scanner(System.in);
            System.out.print("Type in a number: ");
            int numberForParity = numberForParityIdentification.nextInt();

            System.out.printf("Your number: %d \n", numberForParity);

            if (numberForParity % 2 == 0 )
            {
                System.out.println("Your number is even");
            }
            else
            {
                System.out.println("Your number is odd");
            }
        }

        public void identifyFeelingsOfWeather()
        {
            System.out.println("##Задание с температурой##");;

            Scanner temperatureValueScanner = new Scanner(System.in);
            System.out.print("Type in a temperature value: ");

            int temperatureValue = temperatureValueScanner.nextInt();
            System.out.printf("your temperature: %d \n", temperatureValue);

            if (temperatureValue > -5)
            {
                System.out.println("Тепло");
            }
            else if (temperatureValue < -5 && temperatureValue > -20)
            {
                System.out.println("Нормально");
            }
            else if (temperatureValue < -20)
            {
                System.out.println("Холодно");
            }
        }

        public void identifyRainbowColorByNumber()
        {
            System.out.println("##Задание с радугой##");

            Scanner colorNumberScanner = new Scanner(System.in);
            System.out.print("Type in a color number: ");
            int colorNumber = colorNumberScanner.nextInt();

            switch (colorNumber)
            {
                case 1:
                {
                    System.out.println("red");
                } break;
                case 2:{
                    System.out.println("orange");
                } break;
                case 3:
                {
                    System.out.println("yellow");
                } break;
                case 4:
                {
                    System.out.println("green");
                } break;
                case 5:
                {
                    System.out.println("blue");
                } break;
                case 6:
                {
                    System.out.println("dark blue");
                } break;
                case 7:{
                    System.out.println("purple");
                }break;
                default:
                {
                    System.out.println("Вы ввели бред");
                } break;
            }
        }

        public void outputAllOddNumbersByIncrement()
        {
            System.out.println("##Задание на нечётные числа в заданном диапазоне##");

            for (int i = 1; i < 100; i++){
                if (i %2 == 0){
                    continue;
                }
                else
                {
                    System.out.print(i + " ");
                }
            }
        }

        public void testOfDecrementOperation()
        {
            System.out.println();
            System.out.println("##Задание на декремент от 5 до 1##");

            for (int i = 5; i > 0; i--){
                System.out.print(i + " ");
            }
        }

        public void testOfSum()
        {
            System.out.println();
            System.out.println("##Задание на нахождение суммы##");

            Scanner maxNumberScanner = new Scanner(System.in);
            System.out.print("Type in maximum number: ");
            int maxNumber = maxNumberScanner.nextInt();

            int sum = 0;

            for (int i = 1, j = maxNumber; i < maxNumber+1; i++)
            {
                sum = sum + i;
            }
            System.out.println(sum);
        }

        public void outputOfSumWithSeven()
        {
            System.out.println("##Задача со сложением семёрок##");

            int number = 7;

            while(number < 100)
            {
                System.out.print(number+ " ");
                number = number + 7;
            }
        }

        public void outputOfSequence()
        {
            System.out.println();
            System.out.println("##Задача на убывающую последовательность##");

            int sequenceMember = 5;
            for (int i = 1; i < 11; i++)
            {
                System.out.print(sequenceMember = sequenceMember - 5);
            }
        }

        public void outputOfSquaredValue()
        {
            System.out.println();
            System.out.println("##Задача на вывод квадрата значений##");

            for (int i = 10; i < 21; i++)
            {
                System.out.print(" " + i * i);
            }
        }

        public void outputOfFirstNumbersOfFibonacciSequence()
        {
            System.out.println();
            System.out.println("##Задача на числа фибоначчи##");

            int[] fibonacciArray;
            fibonacciArray = new int[13];
            fibonacciArray[0] = 0;
            fibonacciArray[1] = 1;

            for (int i = 2; i < fibonacciArray.length; ++i)
            {
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
                System.out.print(fibonacciArray[i - 2] + " ");
            }
        }

        public void calculationOfFinalDepositAmount()
        {
            System.out.println();
            System.out.println("##Задача с банком##");

            Scanner depositValueScanner = new Scanner(System.in);
            System.out.print("Type in deposit value: ");
            float depositValue = depositValueScanner.nextInt();

            Scanner monthNumberScanner = new Scanner(System.in);
            System.out.print("Type in number of months: ");
            int monthNumber = monthNumberScanner.nextInt();

            for (int i = 1; i < monthNumber + 1; i++)
            {
                depositValue = + (float) (depositValue * (1.07));
            }

            System.out.println("Final sum:" + depositValue);
        }

        public void outputOfMultiplicationTable()
        {
            System.out.println();
            System.out.println("##Задача с таблицей умножения##");

            for (int i = 1; i < 10; i++)
            {
                System.out.println();
                for (int j = 1; j < 10; j++)
                {
                    System.out.print(i + "*" + j + "=" + i*j + "  ");
                }
            }
        }
    }

