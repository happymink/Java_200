package part3;

public class s037 {
    public static final int PHY = 23;
    public static final int EMO = 28;
    public static final int INTF = 33;

    public static String textInfor(int index, double value){
        String result = "";

        switch (index){
            case PHY: result = "신체지수 :"; break;
            case EMO: result = "감정지수 :"; break;
            case INTF: result = "지성지수 :"; break;
            default: result = "미결정"; break;
        }
        return result + (value * 100);
    }

    public static void main(String[] args){
        int index = PHY;
        double value = 0.86;
        String st = textInfor(index, value);
        System.out.println(st);
    }
}
