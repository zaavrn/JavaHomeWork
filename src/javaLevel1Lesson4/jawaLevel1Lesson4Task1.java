package javaLevel1Lesson4;
import java.util.Random;
import java.util.Scanner;

public class jawaLevel1Lesson4Task1 {
    private static final int SIZE = 5;
    private static final int DOTS_TO_WIN = 4;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    public static final String EMPTY_COLUMN_TITLE = "  ";

    private static char[][] map;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        playGame();
        System.out.println("Игра окончена!");
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();

            if (checkEnd(DOT_X, "Пользователь победил!"))
                break;

            aiTurn();
            printMap();
            if (checkEnd(DOT_O, "Компьютер победил!"))
                break;
        }
    }

    private static boolean checkEnd(char symbol, String winMessage) {
        if (checkWin(symbol)) {
            System.out.println(winMessage);
            return true;
        }
        if (isMapFull()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean checkWin(char symbol) { //проверяет все возможные расположения победного поля в игровом поле
        for (int i=0; i<SIZE-DOTS_TO_WIN+1; i++) {
            for (int j=0; j<SIZE-DOTS_TO_WIN+1; j++) {
                if (checkRowsColums (symbol, i, j) || checkDiagonal(symbol, i, j)) return true;
            }
        }
        return false;
    }


    private static boolean checkRowsColums (char symbol, int x, int y) {
        boolean rows, colums;
        for (int i=x; i<DOTS_TO_WIN+x; i++) {
            rows = true;
            colums = true;
            for (int j=y; j<DOTS_TO_WIN+y; j++) {
                rows &= (map[i][j] == symbol);
                colums &= (map[j][i] == symbol);
            }
            if (rows==true || colums==true) return true;
        }
        return false;
    }

    private static boolean checkDiagonal (char symbol, int x, int y) {
        boolean diag1, diag2;
        diag1 = true;
        diag2 = true;
        for (int i=0; i<DOTS_TO_WIN; i++) {
            diag1 &= (map[i+x][i+y] == symbol);
            diag2 &= (map[DOTS_TO_WIN-i-1+x][i+y] == symbol);
        }

        if (diag1==true || diag2==true) return true;

        return false;
    }

    private static void humanTurn() {
        int rowNumber, colNumber;
        do {
            System.out.println("Ход пользователя. Введите номер строки и столбца");
            System.out.print("Строка = ");
            rowNumber = scanner.nextInt();
            System.out.print("Колонка = ");
            colNumber = scanner.nextInt();
        } while (!isCellValid(rowNumber, colNumber));

        map[rowNumber - 1][colNumber - 1] = DOT_X;
    }

    private static void aiTurn() {
        System.out.println("Ход компьютера");
        int rowNumber, colNumber;
        int diag=ai4();// проверка на победный ход диагональ (если нет "вилки" все остальные варианты вернутся с значением"0")
        int diagai=ai3();// проверка на победный ход диагональ 2 (если нет "вилки" все остальные варианты вернутся с значением"0")
        int rowai=ai(); // проверка на победный ход строки (если нет "вилки" все остальные варианты вернутся с значением"0")
        int columnai=ai2(); // проверка на победный ход колонки (если нет "вилки" все остальные варианты вернутся с значением"0")

        do {
            if (diag>rowai&&diag>columnai){ // оценка риска победы по диагонали
                rowNumber=ai4();
                colNumber=ai4();

            } else if (diagai>rowai && diagai>columnai) {// оценка риска победы по диагонали 2
                rowNumber=ai3();
                colNumber=ai3();

            }else if(rowai>columnai){ // оценка риска победы по строкам

                rowNumber=ai();
                colNumber=random.nextInt(SIZE+1)-1;
            }else if (rowai<columnai){


                rowNumber=random.nextInt(SIZE+1)-1; // оценка риска победы по колонкам
                colNumber=ai2();
            }else{

                colNumber=random.nextInt(SIZE+1); // нет рисковых ходов свободное значение
                rowNumber=random.nextInt(SIZE+1);
            }


        }while (!isCellValid(rowNumber,colNumber));

        map[rowNumber - 1][colNumber - 1]=DOT_O;
    }

    private static int ai() {

        for (int i = 0; i < SIZE; i++) {
            int row = 0;
            int empty=0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_X) {
                    row++;
                }else if(map[i][j] == DOT_EMPTY){ // ищем пустые ячейки
                    empty++;
                    if (row ==DOTS_TO_WIN - 1 && empty!=0 && empty!=1) return i+1;// если остался один ход до победы и есть пустые ячейки(иначе зациклит)
                    //break;

                }
            }
        }

        return 0;
    }

    private static int ai2() {

        for (int j = 0; j < SIZE; j++) {
            int column = 0;
            int empty = 0;
            for (int i = 0; i <SIZE; i++) {
                if (map[i][j] == DOT_X) { // ищем занятые ячейки
                    column++;
                }else if(map[i][j] == DOT_EMPTY){ // ищем пустые ячейки
                    empty++;
                    if (column ==DOTS_TO_WIN - 1 && empty!=0 && empty!=1 ) return j+1;// если остался один ход до победы и есть пустые ячейки(иначе зациклит)
                    //break;
                }
            }
        }
        return 0;
    }
    private static int ai3() {
        int diag1 = 0;
        int empty = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[i][i] == DOT_X) {
                diag1++;
            } else if (map[i][i] == DOT_EMPTY) { // ищем пустые ячейки
                empty++;
                if (diag1 == DOTS_TO_WIN - 1 && empty != 0)
                    return i + 1;// если остался один ход до победы и есть пустые ячейки(иначе зациклит)
                //break;
            }

        }
        return 0;
    }

    private static int ai4() {
        int diag2 = 0;
        int empty = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {

            if (map[DOTS_TO_WIN - i - 1][i] == DOT_X) {
                diag2++;
            } else if (map[DOTS_TO_WIN - i - 1][i] == DOT_EMPTY) { // ищем пустые ячейки
                empty++;
                if (diag2 == DOTS_TO_WIN - 1 && empty != 0)
                    return DOTS_TO_WIN-i - 1-1;// если остался один ход до победы и есть пустые ячейки(иначе зациклит)
                //break;
            }
        }

        return 0;
    }


    private static boolean isCellValid(int rowNumber, int colNumber) {
        if (rowNumber < 1 || rowNumber > SIZE)
            return false;
        if (colNumber < 1 || colNumber > SIZE)
            return false;

        return map[rowNumber - 1][colNumber - 1] == DOT_EMPTY;
    }

    private static void printMap() {
        printMapHeader();
        printMapRows();
    }

    private static void printMapRows() {
        for (int i = 0; i < SIZE; i++) {
            printColumnNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printColumnNumber(int i) {
        int columnNumber = i + 1;
        System.out.print(columnNumber + " ");
    }

    private static void printMapHeader() {
        printEmptyHeaderForFirstColumn();
        for (int i = 0; i < SIZE; i++) {
            printColumnNumber(i);
        }
        System.out.println();
    }

    private static void printEmptyHeaderForFirstColumn() {
        System.out.print(EMPTY_COLUMN_TITLE);
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

}
