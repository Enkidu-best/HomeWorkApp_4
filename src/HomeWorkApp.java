// Домашнее задание №5
public class HomeWorkApp {
    public static void main(String[] args) {
//        Для задания 2, 4
        // Создать массив из 5 сотрудников.
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Вася", "Специалист", "vasia@gmail.com", "12345", 100, 25);
        persArray[1] = new Employee("Петя", "Главный специалист", "petia@gmail.com", "012345", 300, 26);
        persArray[2] = new Employee("Катя", "Ведущий специалист", "kate@gmail.com", "34500", 200, 30);
        persArray[3] = new Employee("Миша", "Руководитель", "mike@gmail.com", "1234500", 500, 45);
        persArray[4] = new Employee("Даша", "Зам. руководителя", "daria@gmail.com", "9912345", 400, 43);

        // Для задания 3, 5
        int testAge = 40;
        for (Employee i : persArray) {
            // По заданию 3 - выводим информацию обо всех сотрудниках
            i.info();
        }
        // По заданию 5 - выводим информацию о сотрудниках, старше 40 лет
        for (Employee i : persArray) {
            if (i.age > testAge) {
                i.info();
            }

        }

    }
}