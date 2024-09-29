package Chaewon.Section2;
import java.util.*;
import java.io.*;

public class Baekjoon_2018_수들의합5 {
    /**
     * 메모리 초과
     */
    public void myAnswer() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        // 합 배열 만듦
        long[] sumArray = new long[num + 1];
        sumArray[0] = 0;
        for(int i = 1; i <= num; i++){
            sumArray[i] = i + sumArray[i - 1];
        }

        for(int i = 0; i <= num - 1; i++){
            for(int j = i + 1; j <= num; j++){
                if(sumArray[j] - sumArray[i] == num) count++;
            }
        }

        System.out.print(count);
    }

    /**
     * 강의에선 투포인터 사용
     * sum < N : end_index++; sum 변경
     * sum == N : count++; end_index++; sum 변경
     * sum > N : start_index++; sum 변경
     */
    public void lectureAnswer(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1; // 자기자신 포함
        int startIdx = 1;
        int endIdx = 1;
        int sum = 1; // 제일 처음 합은 무조건 1

        while(endIdx != num){
            if(sum == num){
                count++;
                endIdx++;
                sum += endIdx;
            }else if(sum > num){
                sum -= startIdx;
                startIdx++;
            }else{
                endIdx++;
                sum += endIdx;
            }
        }

        System.out.print(count);
    }
}
