package HomeWork_9;

public class Salary {
   static double  getSum(Employee[] employeeArray){
       double sum =0;
        for (int i = 0; i < employeeArray.length; i ++){
            sum = sum + employeeArray[i].salari;
        }
        return  sum;
    }
}
