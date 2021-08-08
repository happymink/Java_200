package part3;

public class s049 {
    public static boolean isPrime(int n){
        boolean isS = true;
        for (int i=2 ; i < (int)Math.sqrt(n); i++){
            if(n%i==0){
                isS =  false;
                break;
            }
        }
        return isS;
    }

    public static void main(String[] args){
        int number = 1234567;
        boolean ifPrime = isPrime(number);

        if(ifPrime){
            System.out.println(number+"은 1과 자기 자신으로만 나눠떨이지는 수이다");
        }else{
            System.out.println(number+"은 소수가 아니다");
        }
    }
}
