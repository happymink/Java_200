package part3;

public class s035 {
    public static void main(String[] args){
        int temp = 99;
        temp = (temp%2==1)? temp*3+1 : temp/2;

        System.out.println("계산 후 "+ temp);
    }
}
