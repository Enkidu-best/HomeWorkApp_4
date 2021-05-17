public class HomeWorkApp {
    public static void main(String[] arg) {

        // Параметры участников
        Robot robot1 = new Robot(15, 6);
        Cat cat1 = new Cat(4, 4);
        Human human1 = new Human(20, 10);

        // Значения препятствий стена (способ 1)
        Wall[] wall = {
                new Wall(5),
                new Wall(7),
                new Wall(4),
        };

        // Цикл по перечислению стен
        for (Wall i : wall) {
            i.info();
            // Вызываем методы с осуществляем действий:
            i.jumpingR(robot1);
            i.jumpingC(cat1);
            i.jumpingH(human1);
        }

    // Значения препятствий дистанция (способ 2)
    Treadmill[] treadmill = new Treadmill[3];
    treadmill[0] = new Treadmill (2);
    treadmill[1] = new Treadmill (16);
    treadmill[2] = new Treadmill (4);

    // Цикл по перечислению стен
        for (Treadmill i : treadmill) {
        i.info();
        // Вызываем методы с осуществляем действий:
        i.runningR(robot1);
        i.runningC(cat1);
        i.runningH(human1);
    }
}
}
