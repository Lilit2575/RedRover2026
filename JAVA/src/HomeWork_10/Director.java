package HomeWork_10;

import HomeWork_8.Month;

public class Director extends Manager {
    public Director(String name, double salari, int team){
        super(name,salari,team);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double salariTotal = 0;
        for (Month month : monthArray) {
            salariTotal = salariTotal + this.salari * month.getWorkingDays();
        }
        return salariTotal + salariTotal * this.team * 0.03;
    }



}








//Класс Director должен вести себя как Manager,
// но давать надбавку к зарплате в 3% за каждого подчиненного.
