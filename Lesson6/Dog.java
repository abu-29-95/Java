package Lesson6;

public class Dog extends Animal implements Swimable {
    public static int count=0;

    public Dog(String name, int age, String color) {
        super(name,age,color);
    }

    public static void setCount (int count){
        Dog.count = count;
    }

    public static int getCount() {
        count++;
        return count;
    }

    public void run(int length) {
        if (length< 500) {
            System.out.println(getName() + " пробежал " + length + " м");
        }
        else {
            System.out.println(getName()+" устал ");
        }
    }

    @Override
    public void swim(int length) {
        if (length<10){
            System.out.println(getName()+" проплыл "+length+" м");
        }
    }

}

