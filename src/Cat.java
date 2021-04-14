// 1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Cat extends Animal {

    public Cat(int maxRun) {
        super(maxRun, Integer.MIN_VALUE);
//        catCount = catCount + 1;
    }

    // 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
// плавание: кот не умеет плавать, собака 10 м.).
    @Override
    public void swim(int maxSwim){
        if(maxSwim > 0){
        System.out.println("Кошки не умеют плавать!");}
        if(maxSwim < 0){
            System.out.println("Указано некорректное значение и кошки не умеют плавать!");}

        System.out.println();
    }

}