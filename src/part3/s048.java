package part3;

public class s048 {
    public static int sumEach(int n){
        int tot = 0;
        while(n!=0){
            tot += n%10;
            n /= 10;
        }
        return tot;
    }
    public static void main(String[] args){
        int number = 1234567;
        int value = sumEach(number);
        System.out.printf("%d 에 대한 각 자리의 숫자 합 : %d",number, value);
    }
}
