public class Treadmill {
    private int lenght;

    // Проверка на положительные значения
    public Treadmill (int lenght) {
        if (lenght > 0) {
            this.lenght = lenght;
        } else {
            System.out.println("Введено некорректное значение дистанции");
        }
    }

    // Выводим значение препятствия
    public void info(){
        System.out.println("Трек длиной: " + lenght);
    }

    // Осуществляем действия
    public void runningR(Robot jum){
        jum.lenghtR(lenght);
    }
    public void runningC(Cat jum){
        jum.lenghtC(lenght);
    }
    public void runningH(Human jum){
        jum.lenghtH(lenght);
    }
}
