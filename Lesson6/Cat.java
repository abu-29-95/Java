package Lesson6;

public class Cat extends Animal{
    public static int count=0;

    public Cat (String name, int age, String color){
        super(name,age,color);
    }

    public static void setCount(int count){
        Cat.count=count;
    }

    public static int getCount() {
        count++;
        return count;
    }

    public void run(int length) {
        if (length < 200) {
            System.out.println(getName() + " пробежал " + length + " м");
        } else {
            System.out.println(getName() + " устал ");
        }
    }


}
