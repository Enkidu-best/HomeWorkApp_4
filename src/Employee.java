// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    String full_Name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    // 2. Конструктор класса должен заполнять эти поля при создании объекта.
    Employee(String full_Name, String position, String email, String phone, int salary,int age) {
        this.full_Name = full_Name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
     void info() {
            System.out.println("ФИО: " + full_Name + "\n" + "Должность: " + position + "\n" + "email: " + email + "\n" + "Телефон: " + phone + "\n" + "З/П: " + salary + "\n" + "Возраст: " + age + "\n");
        }
}
