package part3;

public class s046 {
    public static void main(String[] args) {
        int range = 10;
        int start = 1;
        int a = 0, b = 0, c = 0;
        while(true){
            a = (int)(range*Math.random()+start);
            b = (int)(range*Math.random()+start);
            c = (int)(range*Math.random()+start);
            System.out.printf("\n%d \t %d \t %d",a,b,c);
            if(a!=b && b!=c && c!=a) break;
        }
        System.out.printf("\n%d \t %d \t %d",a,b,c);

    }
}
