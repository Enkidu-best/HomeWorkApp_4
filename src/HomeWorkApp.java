// Домашнее задание №7

public class HomeWorkApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Котя", 2),
                new Cat("Лакки", 3),
        };
//        Cat cat1 = new Cat("Котя", 1, false);
        Plate plate1 = new Plate(4);

        // Выводим значение тарелки в консоль в классе Plate
        plate1.info();

        // 1. Объект cat1 обращается к методу eat в классе Cat, который вызывает метод decreaseFood
        // в классе Plate и передает туда значение appetit
        for (Cat i : cats) {
            i.eat(plate1);
        }
        // Добавляем еду в тарелку
        plate1.addFood(1);

        //Второй проход
        for (Cat i : cats) {
            i.eat(plate1);
         }
        plate1.info();


    }
}