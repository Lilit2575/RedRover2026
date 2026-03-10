package HomeWork_10;

import HomeWork_8.Month;
import HomeWork_8.MonthUtils;

public class Employee {
    // Обязательные поля
    protected String name;
    protected double salari;

    // Необязательные поля (можно оставить null или 0)
    protected char gender;
    protected int age;

    // Конструктор только с обязательными полями
    public Employee(String name, double salari) {
        this.name = name;
        this.salari = salari;
    }

    public double getSalary(Month[] monthArray){
        double salariTotal = 0;
        for (Month month : monthArray){
            salariTotal = salariTotal+this.salari * month.getWorkingDays();
        }
        return  salariTotal;
    }

    static void main() {
        Employee employee1 = new Employee("Anna", 120);

        Month month = new Month();
        month.workDays=38;
        Month[] kvartal={month};
      double a = employee1.getSalary(kvartal);
        System.out.println(a);
    }
}
