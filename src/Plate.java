public class Plate {
    private int food;
    private int add;

    // Метод, принимающий значение переменной food
    public Plate(int food){
        this.food = food;
        // Проверка, что значение еды в тарелке не отрицательное
        if (food < 0){
            System.out.println("Введите корректное значение еды в тарелке");
            // Досрочный выход из программы
            System.exit(0);
        }
    }

    // Метод, который выводит значение еды в тарелке
    public void info(){
        System.out.println("Значение еды в тарелке: " + food);
    }

    // Метод вызван из метода decreaseFood. Передано значение аппетита из p в переменную n. Уменьшили значение переменной food
    public void decreaseFood(int n){
            // Проверка, что после вычитания, значение еды не будет отрицательным
            if ((food - n) >= 0) {
                food -= n;  // что равно food = food - n;
                System.out.println("Поел на: " + n + " и наелся!");
            }
    }
        // Метод по добавлению еды в тарелку
    public void addFood(int add){
        System.out.println("Кладем в тарелку еды на: " + add);
        food += add;
    }

    // Метод по изменению состояния сыточти
    public boolean fullNess(int appetite) {
        // возвращаем true, если аппетит меньше количества еды (т.е. кот наелся)
            return appetite <= food;
    }


}
