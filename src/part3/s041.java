package part3;

public class s041 {
    public static boolean isLeapYear(int year){
        boolean isS = false;
        if(((year%4==0)&&(year%100!=0)) || (year%400==0) ){
            isS= true;
        }
        return isS;
    }

    public static void main(String[] args){
        System.out.println(isLeapYear(2021));

    }
}
