package Lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String telephone;

    private int salary;
    public int age;

    public Employee(String fullName, String position, String email, String telephone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println("[ " + fullName + ", " + position + ", " + email + ", " + telephone + ", " + salary + ", " + age + " ]");

    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}


