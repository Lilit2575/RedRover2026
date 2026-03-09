package HomeWork_9;

public class Person {
    protected String name;
    protected int age;
    protected char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        String prefix = "";
        if (gender == 'M') {
            prefix = "Mr";
        }
        if (gender == 'F') {
            prefix = "Mrs";
        }
        return prefix + " " + name;
    }

    static void main() {
        Person person1 = new Person("Anna", 25, 'F');
        Person person2 = new Person("Jan", 40, 'M');
        System.out.println(person1.getName());
        Employee employee1 = new Employee("Anna", 25, 'F', 130);
        Employee employee2 = new Employee("Jan", 40, 'M', 150);
        System.out.println(employee1.isSameName(employee2));
        Employee[] employees = {employee1, employee2};
        System.out.println(Salary.getSum(employees));

    }
}
