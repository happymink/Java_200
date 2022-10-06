package jungsuk.ch7;

class DrawShape {
    public static void main(String[] args){
        Point[] p = {   new Point(100, 100),
                        new Point(140, 50),
                        new Point(200, 100)};
    }
}

class Shape{
    String color = "black";
    void draw(){
        System.out.printf("[color= %s] \n", color);
    }
}

class Point{
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
        Point(){
            this(0,0);
        }
        String getXY(){
        return "("+x+", "+y+")";
        }
}
