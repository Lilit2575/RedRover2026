package HomeWork_4;

public class Main4_hw2 {
    static void main() {
//   Необходимо возводить в степень
 //  //int intResult = (int) Math.pow(5, ++a);
//   число 5 начиная с показателя 1, пока результат возведения в степень меньше 10000,
//   вывести результат каждого возведения в степень.
        int a = 1;

        for (int intResult =(int) Math.pow(5,a) ; intResult < 10000; a++) {
            System.out.println(intResult);
            intResult = (int) Math.pow(5,a);

        }
//


    }
}
