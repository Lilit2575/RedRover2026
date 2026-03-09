package HomeWork_8;

import java.time.Year;

public class SalaryUtils {
    //    зарплата за 1 месяц
    public static double calculateSalaryForOneMonth(Employee employee, Month monhyttthjthjgjmgjmgmth) {
        return employee.dailySalary * monhyttthjthjgjmgjmgmth.workDays;

    }

    public static double calculateSalaryForManyMonths(Employee employee, Month[] months) {
        int totalDais = 0;
        for (int i = 0; i < months.length; i++) {
            Month month = months[i];
            totalDais = totalDais + month.workDays;
        }
        return totalDais * employee.dailySalary;
    }
}
