package HomeWork_6;

import java.util.Arrays;

public class Main6_hw11 {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1= new int[arr.length];
        for (int i = 0; i< arr.length-1; i++){
            arr1[i] =arr[i+1];

        }
        arr1[arr1.length-1]= arr[0];
        arr = arr1;
        System.out.println(Arrays.toString(arr));
    }
}

//public class MainLilit {
//    static void main() {
//        int[] arr = {1, 2, 3, 4, 5};
//       int firstElement = arr[0]; // запоминаем первое
//        сдвигаем все элементы влево
//        for (int i = 0; i < arr.length-1; i++){
//            arr[i]=arr[i+1];
//        }
//         последний элемент в смещенном массиве
//        arr[arr.length-1]=firstElement;
//        System.out.print("{ ");
//       цикл берем каждое целое значение из массива arr
//        for (int i : arr){
//            System.out.print(i + " ");
//
//        }
//        System.out.println( "}");
//
//
//    }
//
//}

//Задача №11 (со звездочкой)
//
//Дан массив:
//int[] arr = {1, 2, 3, 4, 5};
//
//Необходимо “сдвинуть” этот массив влево на одну позицию так, чтобы получилось:
//{2, 3, 4, 5, 1}

