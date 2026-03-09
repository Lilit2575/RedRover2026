package HomeWork_3;//Необходимо создать две целочисленные переменные (a, b),
// присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
//maybe a and b are even - если сумма переменных четная
//some variable is odd - если сумма переменных нечетная


public class Main3_hw2 {
    static void main() {
        int a = 2;
        int b = 3;
        int summa = (a+b);
        if (summa % 2 == 0){
            System.out.println("maybe a and b are even");
        }else{
            System.out.println("some variable is odd");
        }

    }
}
