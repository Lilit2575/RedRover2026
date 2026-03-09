package HomeWork_6;

public class Main6_hw7 {
    static void main() {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
        for (int i= 0; i < array.length; i++){
            int[] element = array[i];
            for (int a= 0; a < element.length; a++){
                sum= sum + element[a];
            }
        }

        System.out.println(sum);
    }
}
//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести сумму элементов массива.