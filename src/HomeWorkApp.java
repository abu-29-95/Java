public class HomeWorkApp {
    public static void main (String [] args){
        printThreeWords();
        checkSumSihg();
        printColor();
        compareNumbers();
    }


    public static void printThreeWords () {
        System.out.println("Orange");
        printBanana();
        printApple();
    }
    public static void printBanana () {
        System.out.println("Banana");
    }
    public static void printApple () {
        System.out.println("Apple");
    }
    public static void checkSumSihg () {
        int a = 2;
        int b = -5;
        a += b;
        if (a >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor () {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value >0 && value <=100) {
            System.out.println("Жёлтый");
        }
        if (value >100){
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers () {
        int a = 10;
        int b = 50;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
