package part3;

public class s032 {
    public static void main(String[] args) {

        double latitudel = 37.52312312;
        double longtitudel = 127.000213213;
        double latitudel2 = 35.123123124;
        double longtitudel2 = 129.321124;

        System.out.println(latitudel + "\t"+ longtitudel);
        //실수 1차원ㅂ ㅐ열

        double [] latlng1 = {latitudel, longtitudel};
        double [] latlng2 = {latitudel2, longtitudel2};

        System.out.println(latlng1[0] + "\t" + latlng1[1]);

        //실수 2차원 배열
        double [][]latlng = {{latitudel, longtitudel},
                {latitudel2, longtitudel2}
        };
        System.out.println(latlng[0][0] + "\t" + latlng[0][1]);


    }
}
