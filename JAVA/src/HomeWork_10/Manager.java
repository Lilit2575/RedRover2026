package HomeWork_10;

import HomeWork_8.Month;
import HomeWork_8.MonthUtils;

public class Manager extends Employee {
    protected int team;

    public Manager(String name, double salari, int team) {
        super(name, salari);
        this.team = team;
    }
@Override
    public double getSalary(Month[] monthArray) {
        double salariTotal = 0;
        for (Month month : monthArray) {
            salariTotal = salariTotal + this.salari * month.getWorkingDays();
        }
        return salariTotal + salariTotal * this.team * 0.01;
    }

    static void main() {
        Manager manager = new Manager("Ira", 120, 6);
     double m =  manager.getSalary(MonthUtils.Qvr_1);
        System.out.println(m);
    }

}


// Класс Manager должен иметь все то, что имеет Employee, и вдобавок, хранить число подчиненных.
// Метод getSalary(Month[] monthArray) должен учитывать количество подчиненных,
// и давать надбавку к зарплате в 1% за каждого подчиненного.
