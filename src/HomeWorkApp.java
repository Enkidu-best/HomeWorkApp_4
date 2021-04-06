import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp
{
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    // Вызов из main других методов
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }


    // Массив 3*3 заполняем пустыми значениями (точками)
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    // Распечатываем поле с пустыми значениями и добавляем систему координат (от 0-3 в две оси)
    public static void printMap() {
        // Распечатываем сетку (поле) по горизонтали (0-3)
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Распечатываем сетку (поле) по вертикали (1-3)
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            // Добавляем пустые значения
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Ход человека знаком Х. Из метода вызываем проверку на возможность заполнения.
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            // Человеку удобно вводить 1-3, но массив 0-2, поэтому -1
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    // Вызываем метод с проверкой на возможность заполнения (вводимое значение 1-3).
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    // Ход компа знаком О. Из метода вызываем туже проверку на возможность заполнения.
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    // проверка победы. Меняем условия
    public static boolean checkWin(char symb) {
    int val = 0;
    int valDiag = 0;
    // Проверка по вертикали и 1й диагонали
        for (int i = 0; i < SIZE; i++) {
            val = 0;
            for (int j = 0; j < SIZE; j++) {
                // Проверка на заполнение 1й диагонали
                if (map[i][j] == symb && i == j){
                    valDiag = valDiag + 1;}
                // Проверка заполнения по вертикали
                if (map[j][i] == symb){
                    val = val + 1;}
                // Проверка суммы значений
                if (val == SIZE || valDiag == SIZE){
                    return true; }
            }
        }

        // Проверка второй диагонали
        valDiag = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb && i == (SIZE - 1) - j) {
                    valDiag = valDiag + 1; }
                // Проверка суммы значений
                if (valDiag == SIZE){
                    return true; }
            }
        }

        // Проверка по горизонтали
        for (int j = 0; j < SIZE; j++) {
            val = 0;
            for (int i = 0; i < SIZE; i++) {
                // Проверка заполнения по горизонтали
                if (map[j][i] == symb){
                    val = val + 1;}
                // Проверка суммы значений
                if (val == SIZE || valDiag == SIZE){
                    return true; }
            }
        }
        return false;
    }


//    public static boolean checkWin(char symb) {
//        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//        return false;
//    }

    // Проверка, что карта полностью заполнена (игра закончена) и проверяем победителя
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }


}
