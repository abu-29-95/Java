package Lesson2;

public class Lesson2 {
    public static void main(String [] args) {
        int a = sum(4, 1);
        System.out.println(a);

        number1();

        int b = number2(-10);

        string();

        int c = leapYear(1592);

    }

    public static int sum (int num1, int num2) {
        int result = num1 + num2;
        if (result >= 10 && result <= 20) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        return result;
    }

    public static void number1() {
        int a = 10;
        if (a >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отриательное");
        }
    }


    public static int number2 (int b) {
        int  result = b;
        if (result < 0) {
            System.out.println ("true");
        }
        else {
            System.out.println("false");
        }
        return result;
    }

    public  static void string () {
        int day = 0;
        int goal = 10;
        while (day < goal) {
            day ++;
            System.out.println("День " + day);
        }
    }

    public static int leapYear (int year) {
        int result = year;
        if (year % 4 == 0) {
            System.out.println("true");
       }
        else if (year % 400 == 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        return result;
   }



}
