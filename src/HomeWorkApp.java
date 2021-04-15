// Домашнее задание №6

public class HomeWorkApp {
    public static void main(String[] args) {
            AnimalsCounter animCount = new AnimalsCounter();
            Cat cat = animCount.newCat(200);
            Dog dog = animCount.newDog(500, 10);

            cat.run(201);
            cat.swim(20);

            dog.run(180);
            dog.swim(40);

            Cat cat2 = animCount.newCat(100);
            cat.run(101);
            cat.swim(0);

            System.out.println("Было вызвано собак: " + animCount.getDogCount());
            System.out.println("Было вызвано кошек: " + animCount.getCatCount());
            System.out.println("Было вызвано животных: " + animCount.getAnimalsCount());
    }
}