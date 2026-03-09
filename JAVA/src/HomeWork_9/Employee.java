package HomeWork_9;

public class Employee extends Person{

  protected   double salari;

  public Employee(String name, int age, char gender, double salari){

      super(name,age,gender); // Вызов конструктора Person (должен быть первой строкой)
      this.salari = salari;
  }
  public boolean isSameName(Employee emp){
      // Проверка на null, чтобы избежать ошибки, если передадут пустой объект
      if (emp == null) {
          return false;
      }
      // Сравниваем имена текущего сотрудника и переданного
      return this.name.equals(emp.name);

  }


}
