package HomeWork_8;

public class HomeWork {
    static void main() {

        Employee employee = new Employee();  // Создаем новый экземляр класса Employee
        employee.name = "Lilit";
        employee.ag = 25;
        employee.gender = 'F';
        employee.dailySalary = 5.80;

        System.out.println(SalaryUtils.calculateSalaryForOneMonth(employee, MonthUtils.JANUARY));// заработал в январе


        System.out.println(
                SalaryUtils.calculateSalaryForManyMonths(employee, MonthUtils.Qvr_1 ))
        ; // Заработал за янв фев март
    }

}
