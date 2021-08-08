package part3;

public class s50 {
    public static String shifts(int a){
        String s = "";
        for(int i=0; i<3; i++){
            int aa = a%2;
            s=(aa>0)? aa+s : (-aa)+s;
            a>>=1; //  a/=2;
        }
        return s;
    }
    public static void main(String[] args){
        int intNum = 123;
        int intNum2 = -123;
        System.out.println(intNum+shifts(intNum));
        System.out.println(intNum2+shifts(intNum2));
    }
}
