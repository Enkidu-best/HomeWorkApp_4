// 1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Animal {

    // 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
// плавание: кот не умеет плавать, собака 10 м.).
    int maxRun;
    int maxSwim;

public Animal(int maxRun, int maxSwim){
    this.maxRun = maxRun;
    this.maxSwim = maxSwim;
}

// 2. Все животные могут бежать и плыть. В качестве параметра каждому методу
// передается длина препятствия.
// Результатом выполнения действия будет печать в консоль.
// (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

    // Для бега
public void run(int distRun){
    if (maxRun < distRun) {
        System.out.println("Животное не может пробежать такую дистанцию." + "\n" + "Максимальная дистанция: " + maxRun + " м.");
    }
    else if (maxRun <= 0){
        System.out.println("Укажите корректное значение для бега");
    }
    else {
        System.out.println("Животное успешно пробежало " + distRun + " м.");
    }
//        System.out.println();
}

    // Для плавания
    public void swim(int distswim){
        if (maxSwim < distswim) {
            System.out.println("Животное не может проплыть такую дистанцию." + "\n" + "Максимальная дистанция: " + maxSwim + " м.");
        }
        else if (maxSwim <= 0){
            System.out.println("Укажите корректное значение для плавания");
        }
        else {
            System.out.println("Животное успешно проплыло " + distswim + " м.");
        }
        System.out.println();
    }

}



