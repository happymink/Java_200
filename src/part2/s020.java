package part2;

public class s020 {
    public static void main(String[] args) {
        int kor = 90;
        int eng = 80;
        int math = 89;
        int tot = kor + eng + math ;
        int ave = tot/3; // 정수 연산 86.333 -> 86
        //정수끼리 연산하면 결과도 정수이다.
        System.out.printf("국어 %d점, 영어 %d점, 수학 %d점 =>\t",kor, eng, math);
        System.out.printf("총점 %d점, 평균 %d점 \n",tot, ave);

    }
}
