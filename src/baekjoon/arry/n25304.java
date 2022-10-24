package baekjoon.arry;

import java.util.Scanner;

public class n25304 {
    public static void main(String[] args) {
        int tot = 0;
        int money = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);

        tot = sc.nextInt();
        n = sc.nextInt();
        int price, ea;
        for(int i = 0; i < n ; i++){
            price = sc.nextInt();
            ea = sc.nextInt();

            money += price * ea;
        }
        if(money == tot){
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
