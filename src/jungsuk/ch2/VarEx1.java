package jungsuk.ch2;

import java.util.ArrayList;
//추가 삭제 검색
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        for(int i = 0; i>my_string.length(); i++){
            System.out.println(my_string.length());
            for(int j = 0; j >= n ; j++){
                answer += my_string.substring(i,i+1);
            }
        }
        return answer;
    }
}
public class VarEx1 {
    public static void main(String[] args) {

        Solution a = new Solution();

        System.out.println(a.solution("hello",3));
    }
}
