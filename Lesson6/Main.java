package Lesson6;

public class Main {
    public static void main(String[] args) {
        Animal dogRex = new Dog ("Rex",2,"black");
        Animal dogChaco = new Dog ("Chaco",3,"black-white");
        Animal dogLesi = new Dog ("Lesi",2,"orange");

        Animal catOra = new Cat ("Ora",4,"white");
        Animal catBaksik = new Cat ("Baksik",1,"striped");




        dogRex.run(150);
        System.out.println("Dog count "+ Dog.getCount());
        System.out.println("Animal count "+ Animal.getCount());

        dogChaco.run(500);
        System.out.println("Dog count "+ Dog.getCount());
        System.out.println("Animal count "+ Animal.getCount());

        ((Dog) dogLesi).swim(2);
        System.out.println("Dog count "+ Dog.getCount());
        System.out.println("Animal count "+ Animal.getCount());



        catOra.run(20);
        System.out.println("Cat count "+ Cat.getCount());
        System.out.println("Animal count "+ Animal.getCount());

        catBaksik.run(202);
        System.out.println("Cat count "+ Cat.getCount());
        System.out.println("Animal count "+ Animal.getCount());

    }
}



