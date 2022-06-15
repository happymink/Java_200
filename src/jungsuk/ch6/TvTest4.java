package jungsuk.ch6;

public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3]; //길이가 3인 Tv 객체 배열
        // Tv 객체르 생성해서 Tv 객체 배열의 각 요소에 저장
        for(int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i+10;
        }
        for (int i = 0; i < tvArr.length; i++){
            tvArr[i].channelUP();
            System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);
        }
    }
}
