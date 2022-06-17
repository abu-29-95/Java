package Lesson7;

public class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decriesFood(int appetite) {
            food -= appetite;
    }

    public void appFood (int food) {
        this.food += food;
    }

    public void info (){
        System.out.println("[ "+food+" ]");
    }
}
