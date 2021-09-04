package jungsuk.ch7;

class Tv{
    boolean power; //전원상태
    int channel; //채널

    void power() { power = !power;}
    void channelUp() { ++channel;}
    void channelDown(){ --channel;}

}
class CaptionTv extends Tv {
    boolean caption;
    void displayCaption (String text){
        if (caption){
            System.out.println(text);
        }
    }
}
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.caption = true;
        ctv.displayCaption("Hello world1");
        ctv.caption = false;
        ctv.displayCaption("Hello world2");
    }
}