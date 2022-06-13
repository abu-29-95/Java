package Lesson5;


public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Ivanov Ivan Ivanovich", "tester", "ivan@gmail.com", "+79991112233", 70000, 25);
        Employee employee2 = new Employee("Petrova Elena Stanislavna", "marketer", "elena@gmail.com", "+89992223344", 60000, 30);
        Employee employee3 = new Employee("Alekseev Yri Alekseevich", "qa engineer", "yri@gmail.com", "+87774445533", 120000, 45);
        Employee employee4 = new Employee("Kuatov Ruslan Nurlanovich", "development", "rus@gmail.com", "+79991457898", 170000, 41);
        Employee employee5 = new Employee("Rasulova Yana Ilyasovna", "tester", "yana@gmail.com", "+78881232333", 120000, 34);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age>40){
              employees[i].print();
            }
        }

    }
}




