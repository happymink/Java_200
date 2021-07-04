package javastudy;


@FunctionalInterface //단 하나의 추상 메서드만 가져야 함.
interface MyFunction2{
    public abstract int max(int a, int b);

    //public abstract 생략 가능
}
public class Funcinter {
    public static void main(String[] args) {

//      Object obj = (a, b) -> a > b ? a : b; //람다식
//        Object obj = new Object(){
//            int max(int a, int b){
//                return a > b? a : b;
//            }
//        };







//      Object obj = (a, b) -> a > b ? a : b; //람다식
//
//        Object obj = new Object(){
//            public int max(int a, int b){
//                return a > b? a : b;
//            }
//        };
//
//        int value = obj.max(3,5);
















        MyFunction2 f = new MyFunction2(){
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };


        int value = f.max(3,5);
    }
}
