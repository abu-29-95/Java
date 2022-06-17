package Lesson7;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik",100,true);
        Cat cat2 = new Cat("Ora",70,true);


        Plate plate = new Plate(150);
        plate.appFood(30);

        Cat [] cats = new Cat [2];
        cats[0]=cat1;
        cats[1]=cat2;
        for (int i=0; i< cats.length; i++) {
            cats[i].eat(plate);
            cats[i].info();
            plate.info();
        }
    }
}
