package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;


    public Cat(String name, int appetite, boolean isHungry) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = isHungry;
    }

    public void eat(Plate plate) {
            if (plate.food >= appetite) {
                plate.decriesFood(appetite);
                isHungry = false;
            }
    }

    public void info (){
        System.out.println("[ "+name+","+appetite+", "+isHungry+" ]");
    }

}
