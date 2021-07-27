package baekjoon.study.week5;

import java.util.Scanner;

//더하기 싸이클
public class code_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();
        int N2 = 0;
        int count = 0;
        int arrN[] = new int[2];

        while(Integer.parseInt(N) == N2) {
            if (Integer.parseInt(N) < 10) {
                arrN[0] = 0;
                arrN[1] = Integer.parseInt(N);
            }

            String Num2 = Integer.toString(arrN[0]) + Integer.toString(arrN[1]);
            if(Num2 == N){
                break;
            }
            count++;
            N = Num2;
        }
        System.out.println(count);
    }
}
