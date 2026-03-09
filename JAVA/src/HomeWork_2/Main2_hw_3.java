package HomeWork_2;
//Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля,
// половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
//Размер добычи (например, в дублонах) и количество пиратов на корабле задать переменными.
//Вывести на экран кому сколько дублонов полагается
//Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?

public class Main2_hw_3 {
    static void main() {
        int dobicha = 500; // дублонов
        int pirati = 20; //количество
        int kapitan=1;
        int vladelec = dobicha / 2; // дублонов
        int ostatok = (dobicha - vladelec);
        System.out.println("Владелец = " + vladelec + " дублонов");
        System.out.println("Капитан = " + ostatok/2 + " дублонов");
        ostatok = ostatok - ostatok/2;
        System.out.println("Каждый член команды = " + ostatok /(pirati + kapitan) + " дублонов");
        System.out.println("Джек Воробей = " + (vladelec + ostatok + ostatok /(pirati + kapitan)) + " дублонов");
        ostatok = ostatok - (ostatok / (pirati + kapitan) * (pirati + kapitan));
        System.out.println("На пиво = "+ ostatok + " дублонов");


    }

}
