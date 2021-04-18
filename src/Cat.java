
public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    // Создаем метод, который принимает на вход значение имени и аппетита кота
    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    //2.Метод вызван из main для объекта cat1. Отсюда вызываем decreaseFood и передаем значение аппетита,
    // которое занесено в переменную p
    public void eat(Plate p){
        System.out.println(name + ":");
            // Проверяем что значение аппетита не отрицательное и, что кот не сыт
            if ((appetite > 0) && (fullness != true)) {
                // Вызываем метод в классе Plate, который возвращает значение сыточти
                p.fullNess(appetite);
                // Проверка на сытость. Условие - кот будет есть, только если в тарелке достаточно еды
                    if (p.fullNess(appetite) == true) {
                        fullness = true;
                        p.decreaseFood(appetite);
                    }
                    // Если еды недостаточно - пройдет мимо
                    else {System.out.println("Гордые коты не едят наполовину! Кот проходит мимо миски...");}

            } else if ((appetite == 0) || (fullness == true)) {
                System.out.println("Не хочет кушать - лениво валяется на диване!");
                fullness = true;
//                p.decreaseFood(appetite);
            }
            else if (appetite < 0) {
                System.out.println("Введите корректное значение аппетита кота");
                // Досрочный выход из программы
                System.exit(0);
            }

//        else {
//
//        }
    }


}