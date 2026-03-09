package HomeWork_6;

public class Main6_2hw6 {
    static void main() {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum= 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма = " + sum);
    }
}


//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести сумму всех значений массива.