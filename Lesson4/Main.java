package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] field = initField(3);
        printField(field);
        while (true) {
            humenTurn(field);
            printField(field);
            if (isDraw(field)) {
                break;
            }
            if (isWin(field, "X")) {
                System.out.println("Вы победили");
                break;
            }
            /*if (isWinFor5x5(field, "X")) {
                System.out.println("Вы победили");
                break;
            }*/

            aiTurn(field);
            printField(field);
            if (isDraw(field)) {
                break;
            }
            if (isWin(field, "X")) {
                System.out.println("Комп победили");
                break;
            }
            /*if (isWinFor5x5(field,"0")) {
                System.out.println("Компьютер победил");
                break;
            }*/
        }

    }

    public static String[][] initField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = "*";
            }
        }
        return field;
    }

    public static void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
                ;
            }
            System.out.println();
        }
        System.out.println("-----");
    }

    public static void humenTurn(String[][] field) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Укажите клетку");
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            if (x < field.length && y < field.length && x >= 0 && y >= 0) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "X";
                    break;
                } else {
                    System.out.println("Ходите на другое место");
                }
            } else {
                System.out.println("Вы вышли за границу поля");
            }
        }
    }

    public static void aiTurn(String[][] field) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Random random = new Random();
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            if (field[x][y].equals("*")) {
                    field[x][y] = "0";
                    break;
            }

        }
    }


    public static boolean isDraw(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean isWin(String[][] field, String trun) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][0].equals(trun) && field[i][1].equals(trun) && field[i][2].equals(trun)) {
                    return true;
                }
                if (field[0][j].equals(trun) && field[1][j].equals(trun) && field[2][j].equals(trun)) {
                    return true;
                }
                if (field[0][0].equals(trun) && field[1][1].equals(trun) && field[2][2].equals(trun) ||
                field[0][2].equals(trun) && field[1][1].equals(trun)&&field[2][0].equals(trun)) {
                        return true;
                }

            }
        }
        return false;
    }

    public static boolean isWinFor5x5 (String[][] field, String trun) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][0].equals(trun)&& field[i][1].equals(trun) && field[i][2].equals(trun)&& field[i][3].equals(trun)||
                        field[i][1].equals(trun)&& field[i][2].equals(trun)&& field[i][3].equals(trun)&& field[i][4].equals(trun)) {
                    return true;
                }
                else if (field[0][j].equals(trun) && field[1][j].equals(trun) && field[2][j].equals(trun) && field[3][j].equals(trun)||
                        field[1][j].equals(trun) && field[2][j].equals(trun) && field[3][j].equals(trun) && field[4][j].equals(trun)) {
                    return true;
                }
            }
        }
        return false;
    }

}



