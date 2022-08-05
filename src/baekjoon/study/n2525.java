package baekjoon.study;

import java.util.Scanner;

public class n2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();

        hour += time / 60;
        min += time % 60;

        if(min >= 60){
            hour += 1;
            min -= 60;
        }
        if(hour >= 24){
            hour -= 24;
        }
        System.out.println(hour +" "+ min);
    }
}
