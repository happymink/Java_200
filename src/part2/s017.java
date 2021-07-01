package part2;

class JLocation{
    public double lat;
    public double lng;
}

public class s017 {
    public static void main(String[] args) {
        //두 개의 기본 타입
        double latitude = 37.43524353453425;
        double longitude = 127.12342345234;

        //사용자 정의 객체 생성
        JLocation jloc = new JLocation();
        jloc.lat = latitude;
        jloc.lng = longitude;

        JLocation newLoc = jloc;//객체를 대입
        System.out.println(newLoc.lat);
    }
}
