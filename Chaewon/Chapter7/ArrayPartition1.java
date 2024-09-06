package Chaewon.Chapter7;

import java.util.Arrays;
public class ArrayPartition1 {

    /**
     * 처음엔 정렬하고 인덱스 0에서부터 최솟값을 찾도록 했는데 그러면 input의 갯수가 홀수일 때 answer의 최댓값을 찾지 못해서
     * 맨 끝부터 최솟값을 찾는 걸로 변경
     */
    public int myAnswer(){
        int[] input = {1, 3, 4, 2, 5};
        int answer = 0;

        Arrays.sort(input);
        int totalPair = input.length / 2;

        if(input.length % 2 == 0) {
            for(int i = totalPair; i > 0; i--){
                answer += Math.min(input[i * 2 - 1], input[i * 2 - 2]);
            }
        }else {
            for(int i = totalPair; i > 0; i--){
                answer += Math.min(input[i * 2], input[i * 2 - 1]);
            }
        }

        return answer;
    }

    /**
     * min 함수에 2개씩 들어가니까 가장 작은 수는 항상 짝수번째의 수가 됨 -> 짝수번째의 값만 더하면 됨
     */
    public int arrayPartion1_2(){
        int[] input = {1, 3, 4, 2, 5, 2};
        int answer = 0;

        Arrays.sort(input);

        for(int i = 0; i < input.length; i++){
            if(i % 2 == 0){answer += input[i];}
        }

        return answer;
    }
}
