package part3;

public class s030 {
    public static final int PHYSICAL = 23; //static 변수 생성 없이 사용

    public double getBioRhythm(long days, int index, int max){
        return max* Math.sin((days%index) * 2 * Math.PI/index);
    }
    public static void main(String[] args){
        int days = 1200;
        s030 bio = new s030(); // 객체를 생성
        double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
        System.out.println("나의 신체지수는 "+phyval+"입니다");
    }
}
