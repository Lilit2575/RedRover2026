package HomeWork_5;
//
//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо увеличить все значения массива на 15.


import java.util.Arrays;

public class Main5_hw3 {
    static void main() {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 15;
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
