package part3;

public class s033 {
    public static void main(String[] args) {
        Geo geo1 = new Geo();
        geo1.latitude = 35.33;
        geo1.longitude = 123.3434;

        System.out.println(geo1.latitude + geo1.longitude );

        Geo geo2 = new Geo();

        Geo geo = geo1;

        System.out.println(geo.latitude + geo.longitude);

        geo1.latitude = 0;
        geo1.longitude = 0;
        System.out.println("edit geo1");
        System.out.println(geo.latitude + geo.longitude);
    }
}
