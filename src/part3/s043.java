package part3;

public class s043 {
    public static void showOddEvnew(int n){
        int temp = n;
        while(temp!=1){
            if(temp%2==1){ //홀수라면
                temp = temp*3+1;
            }else{
                temp/= 2;
            }
            System.out.print("["+temp+"]");
        }
        System.out.println("\n---------------");
    }
    public static void main(String[] args){
        showOddEvnew(1);
    }
}
