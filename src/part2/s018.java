package part2;

public class s018 {
    public static void main(String[] args) {
        String slat = "37.452244      ";
        //String slat = "hello" ;
        //공백 제거 후 double 타입으로 변환

        double latitude = Double.parseDouble(slat.trim()); //double 랩퍼 클래스 사용 , trim() 양 쪽 공백 제거 메서드
        System.out.println(latitude);
    }
}
