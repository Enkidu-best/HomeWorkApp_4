public class Cat {              // Создаем новый класс Cat
    private String name;   // Определяем в классе переменные (до вызова первого метода) с модификатором доступа private
    private int age;

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }
    public int getAge() {
        return age;  }
    public void setName(String name) {
        this.name = name;  }
    public String getName() {
        return name;
    }
}



//    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        Cat cat2 = new Cat();
//        cat1.name = "Барсик";
////        cat1.color = "Белый";
//        cat1.age = 2;
//        cat2.name = "Котя";
////        cat2.color = "Серый";
//        cat2.age = 4;
//        cat1.setAge(2);
//        cat2.getName();
//    }


