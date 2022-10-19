package baekjoon.arry;

import java.util.Scanner;

public class n2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int best = 0;
        int index = 0;
        for(int i = 0; i < 9 ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] >= best) {
                best = arr[i];
                index = i;
            }
        }

        System.out.println(best);
        System.out.println(index+1);



    }
}
