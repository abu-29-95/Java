package Lesson6;

public abstract class Animal {
    private String name;
    private int age;
    private String color;

    public static int count=0;

    public Animal (String name,int age,String color){
        this.name =name;
        this.age=age;
        this.color=color;
    }

    public void print(){
        System.out.println("[ "+name+", "+age+", "+color+ " ]");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public static int getCount() {
        count++;
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public static void setCount(int count) {
        Animal.count = count;
    }

    public void run(int length){
        System.out.println("Я бегаю"+length);
    }


}
