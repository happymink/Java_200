package baekjoon.arry;

import java.util.Scanner;

public class n3052 {
    public static void main(String[] args) {

        int arr[] = new int [10];
        int total = 0;
        Scanner sc = new Scanner(System.in);
        int num;
        for(int i = 0; i<10; i++){
            num = sc.nextInt();
            arr[i] = num % 42;
        }

        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                if(arr[i] != arr[j]){
                    break;
                }
                total++;
            }
        }
        System.out.println(total);
    }
}
