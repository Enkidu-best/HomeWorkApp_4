public class AnimalsCounter {
    // 4. * Добавить подсчет созданных котов, собак и животных.
    public int catCount;
    public int dogCount;
    public int animalsCount;

    public AnimalsCounter() {
        catCount = 0;
        dogCount = 0;
        animalsCount = 0;
    }

    public Cat newCat(int maxRun){
        Cat cat = new Cat(maxRun);
        catCount = catCount + 1;
        animalsCount = animalsCount + 1;
        return cat;
    }

    public Dog newDog(int maxRun, int maxSwim){
        Dog dog = new Dog(maxRun, maxSwim);
        dogCount = dogCount + 1;
        animalsCount = animalsCount + 1;
        return dog;
    }

    public int getAnimalsCount(){
        return animalsCount;
    }
    public int getDogCount() {
        return dogCount;
    }
    public int getCatCount() {
        return catCount;
    }
}
