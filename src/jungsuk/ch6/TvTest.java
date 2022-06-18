package jungsuk.ch6;

class Tv {
    String color; //색상
    boolean power; //전원상태
    int channel; //채널

    void power(){ power = !power; }
    void channelUP(){ ++channel; }
    void channelDOWN(){ --channel; }
}

public class TvTest {
    public static void main(String[] args) {
        Tv t;
        t= new Tv();
        t.channel = 7;
        t.channelDOWN();
        System.out.println("현재 채널은 " + t.channel + "입니다.");
    }
}
