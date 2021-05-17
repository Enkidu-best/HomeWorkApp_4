public class Robot {
    private int run;
    private int jump;
    private boolean checkR;
    private boolean checkJ;

    // Проверка на положительные значения
    public Robot (int run, int jump) {
        if (run > 0) {
            this.run = run;
        } else {
            System.out.println("Введено некорректное значение бега");
            // Досрочное прерывание программы
            System.exit(0);
        }
        if (jump > 0) {
            this.jump = jump;
        } else {
            System.out.println("Введено некорректное значение прыжка");
            // Досрочное прерывание программы
            System.exit(0);
        }
        checkJ = true;
        checkR = true;
        System.out.println("Робот прыгает на: " + jump + " и бегает на: " + run);
    }

    // Осуществляем подсчет прыжка
    public void jumpingR(int h){
        // Проверяем, что
        if (jump < h || !checkJ) {
            System.out.println("Робот не смог прыгнуть и сходит с дистанции");
            System.out.println();
            checkJ = false;
        }
        else {
            System.out.println("Робот удачно прыгнул");
            System.out.println();
        }
    }

    // Осуществляем подсчет бега
    public void lenghtR(int l){
        if (run < l || !checkR) {
            System.out.println("Робот не смог пробежать и сходит с дистанции");
            System.out.println();
            checkR = false;
        }
        else {
            System.out.println("Робот удачно пробежал");
            System.out.println();
        }
    }

}
