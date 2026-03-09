package HomeWork_2;

public class Main2_hw1 {
    static void main() {
        int x = 10;
        if (x % 2 == 0){
            System.out.println(x + " - Четное");
        }
        else {
            System.out.println(x +" -Нечетное");}
        int y = 3;
        if (y % 2 == 0){
            System.out.println(y + " - Четное");
        }
        else {
            System.out.println(y +" -Нечетное");}


        int result2 = x - y;
        int result3 = x * y;
        double result4 = x * 1.0 / y;
        int result5 = x % y;

        System.out.print("x + y = ");
        System.out.println(x + y);
        System.out.print("x - y = ");
        System.out.println(x -y);
        System.out.print("x * y = ");
        System.out.println(x * y);
        System.out.print("x * 1.0 / y = ");
        System.out.println(x * 1.0 / y);
        System.out.print("x % y = ");
        System.out.println(x % y);
    }
}
