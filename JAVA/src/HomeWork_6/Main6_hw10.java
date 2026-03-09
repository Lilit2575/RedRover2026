package HomeWork_6;

public class Main6_hw10 {
    static void main() {
        int[] temps = {18, 20, 17, 19, 16, 15, 21};
        int count = 0;
        for (int i = 0; i < temps.length-1; i++) {
            if (temps[i] > temps[i+1]) {
                count = count + 1;
            }
        }
        System.out.println(count);

    }
}


//Задача №10 (со звездочкой)
//
//Даны температуры воздуха за несколько дней:
//
//int[] temps = {18, 20, 17, 19, 16, 15, 21};
//
//Необходимо посчитать сколько раз за эти дни температура падала в сравнении с предыдущим днем.
