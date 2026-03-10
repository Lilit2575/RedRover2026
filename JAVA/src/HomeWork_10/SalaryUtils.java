package HomeWork_10;

import HomeWork_8.Month;
import HomeWork_8.MonthUtils;

public class SalaryUtils {
    public static double getTotalSalary(Employee[] employees, Month[] months) {
        double sumSalari = 0;
        for (Employee employee : employees) {
            double employeeSalary = employee.getSalary(months);
            sumSalari = sumSalari + employeeSalary;
        }
        return sumSalari;
    }

    static void main() {
        Employee employee1 = new Employee("Anna", 120);
        Manager manager = new Manager("Ira", 120, 6);
        Director director = new Director("ivan", 500,7);

        Employee[] employees = {employee1, manager, director};

        System.out.println(getTotalSalary(employees, MonthUtils.YEAR));

    }
}


//Создать класс SalaryUtils, и в нем написать метод
// getTotalSalary(Employee[] employees, Month[] months), который подсчитает общую сумму к
// выплате на всех сотрудников — простых работников, менеджеров и директоров.
