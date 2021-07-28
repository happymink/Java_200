package part3;

public class s047 {
    public static void main(String[] args) {
        int range = 10;
        int start = 1;
        int a=0,b=0,c=0;

        while(a==b || b==c || c==a){
            a = (int)(range*Math.random()+start);
            b = (int)(range*Math.random()+start);
            c = (int)(range*Math.random()+start);
            System.out.printf("\n%d,%d,%d",a,b,c);
        }
        System.out.printf("\n%d,%d,%d",a,b,c);
    }
}
