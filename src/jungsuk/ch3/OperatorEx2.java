package jungsuk.ch3;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j = 0;
        j = i++;
        System.out.println("j=i++; 실행 후, i=" + i + ", j= " + j);

        i = 5;
        j = 0;

        j = ++i;
        System.out.println("j=++i; 실행 후, i=" + i + ", j= " + j);

        j = ++i;
        System.out.println(j);
        System.out.println(j--);
        System.out.println(i);
    }
}
