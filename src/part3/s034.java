package part3;

public class s034 {
    public static void main(String[] args) {
        int temp = 88;
        if (temp %2 == 1){
            temp = temp*3+1;
        }else{
            temp = temp/2;
        }
        System.out.println("계산 후"+temp);
    }
}
