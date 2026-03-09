package HomeWork_9;

public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter attacker;
        Fighter defender;
        if (firstAttacker.equals(fighter1.name)) {
            attacker = fighter1;
            defender = fighter2;
        } else {
            attacker = fighter2;
            defender = fighter1;
        }
        while (attacker.health > 0 && defender.health > 0) {
            defender.health -= attacker.damagePerAttack;
            if (defender.health <= 0) {
                return attacker.name;
            }
            Fighter temp = attacker;
            attacker = defender;
            defender = temp;
        }
        return attacker.name;
    }


    static void main() {
        String s = declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4),
                "Lew");
        System.out.println(s);

    }
}

class Fighter {
    String name;
    int health;
    int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}
