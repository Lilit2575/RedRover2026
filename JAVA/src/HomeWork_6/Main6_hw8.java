package HomeWork_6;

import java.util.Arrays;

public class Main6_hw8 {
    static void main() {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}
        };
        int[] maxResalt = new int[4];
        for (int i = 0; i < array.length; i++) {
            int[] podmassiv = array[i]; //    {1, 2, 3, 4, 5},
            int sumPodmasiva = 0;
            for (int j = 0; j < podmassiv.length; j++) {
                sumPodmasiva = sumPodmasiva + podmassiv[j];
            }
            maxResalt[i] = sumPodmasiva;
        }
        int maximum = maxResalt[0];
        for (int m = 0; m < maxResalt.length; m++) {
            if (maximum < maxResalt[m]) {
                maximum = maxResalt[m];
            }
        }
       System.out.println(maximum); //необходимо вывести максимальное значение массива.
        System.out.println(array.length);// задача 9 необходимо вывести количество элементов в массиве.

    }
}

//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести максимальное значение массива.



