package HomeWork_6;

public class Main6_2hw5 {
    static void main() {
        String s = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println(count);
    }
}



//Дана строка:
//String s = “Перевыборы выбранного президента”;
//необходимо подсчитать количество букв “е” в строке.
//Для указанной строки ответ будет 4.