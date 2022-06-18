package jungsuk.ch6;

import static jungsuk.ch6.CallStackTest.firstMethod;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main 메소드 시작");
        firstMethod();
        System.out.println("main 메소드 끝");
    }
}
