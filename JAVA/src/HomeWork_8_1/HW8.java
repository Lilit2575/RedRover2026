package HomeWork_8_1;

import HomeWork_9.Employee;

public class HW8 {
    static void main() {
        MonthUtils.getjanuary();
        Month[] months = {MonthUtils.getjanuary()};
        Employee lilit = new Employee();
        lilit.name = "lilit";
        lilit.ag = 50;
        lilit.gender = 'f';
        lilit.salary = 350;

        System.out.println(SalaryUtils.calculateSalaryForManyMonths(lilit, months));
        System.out.println(SalaryUtils.calculateSalaryForOneMonth(lilit, MonthUtils.getjanuary()));
    }
}

class Month {
    String name;
    int quantyDay;
    int quantyWorkDay;
}

class MonthUtils {
    public static Month getjanuary() {
        Month january = new Month();
        january.name = "Январь";
        january.quantyDay = 31;
        january.quantyWorkDay = 20;
        return january;
    }


}

class SalaryUtils {
    public static int calculateSalaryForOneMonth(Employee chelovek, Month mesyac) {
        int salaryEmployee = mesyac.quantyWorkDay * chelovek.salary;
        return salaryEmployee;

    }

    // mesyaci[]
    // - january [0]
    // - may [1]
    // - novemer [2]
    public static int calculateSalaryForManyMonths(Employee person, Month[] mesyacs) {

        int sumSalariTotal = 0;
        for (int i = 0; i < mesyacs.length; i++) {
            int salaryMount = calculateSalaryForOneMonth(person, mesyacs[i]);
            sumSalariTotal = sumSalariTotal + salaryMount;

        }
        return sumSalariTotal;
    }


//    public static int calculateSalaryForManyMonths(Employee chelovek, Month[] mesyacs) {
//        int sumWorkDay = 0;
//        for (int i = 0; i <  mesyacs.length; i++) {
//            sumWorkDay = sumWorkDay + mesyacs[i].quantyWorkDay;
//        }
//
//
//        int salaryEmploeeTotal = chelovek.salary * sumWorkDay;
//        return  salaryEmploeeTotal;
//    }
}