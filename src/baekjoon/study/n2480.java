package baekjoon.study;

import java.util.Scanner;


public class n2480 {
    public static int func(int n1, int n2, int n3){
        int reward = 0;

        if(n1 == n2 && n2 == n3){
            reward = 10000+(n1)*1000;
        } else if(n1 == n2 || n2 == n3){
            reward = 1000+(n2)*100;
        } else if(n3 == n1){
            reward = 1000+(n3)*100;
        }else {
            if(n1>n2 && n1>n3){
                reward =n1 * 100;
            } else if(n2>n1 && n2>n3){
                reward =n2 * 100;
            } else
                reward =n3 * 100;
        }


        return reward;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,n2,n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        System.out.println(func(n1,n2,n3));

    }
}
