package part3;

public class s042 {
    public static void main(String[] args){
        for(int i = 0; i<101; i++){
            double fahrenheit = 9.0 / 5*i + 32;
            System.out.println("섭씨 "+i+"도"+"화씨"+fahrenheit+"도");
        }
    }
}
