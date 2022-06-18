package jungsuk.ch6;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod();
    }
    static void firstMethod() {
        System.out.println("first 메소드 시작");
        secondMethod();
        System.out.println("first 메소드 끝");
    }
    static  void secondMethod() {
        System.out.println("second 메소드 시작");
        System.out.println("second 메소드 끝");
    }
}
