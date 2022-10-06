package javastudy.ch6;

class Car{
    String color;
    String gearType;
    int door;

    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}


public class Cons {
    public static void main(String[] args) {

        Car c = new Car("white", "auto", 4);
        System.out.println(c.color+c.gearType+c.door);
    }
}
