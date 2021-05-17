public class Wall {
    private int height;

    // Проверка на положительные значения
    public Wall (int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Введено некорректное значение высоты препятствия");
        }
    }

    // Выводим значение препятствия
    public void info(){
        System.out.println("Стена высотой: " + height);
    }

    // Осуществляем действия
    public void jumpingR(Robot jum){
        jum.jumpingR(height);
    }
    public void jumpingC(Cat jum){
        jum.jumpingC(height);
    }
    public void jumpingH(Human jum){
        jum.jumpingH(height);
    }

}
