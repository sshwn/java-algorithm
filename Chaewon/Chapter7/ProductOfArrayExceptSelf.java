package Chaewon.Chapter7;

import java.util.Arrays;
public class ProductOfArrayExceptSelf {

    /**
     * stream으로 풀면 쉽게 풀 수 있을 것 같아서 stream으로 풀이함 -> 메소드는 잘 몰라서 검색
     * 처음에는
     * int[] temp = Arrays.stream(input).filter(num -> num != tempInt).toArray();
     * answer[i] = Arrays.stream(temp).reduce(1, (a,b) -> a*b);
     * 이렇게 두 줄로 작성해서 하나로 합침
     * tempInt를 final으로 선언해 준 이유는 stream에서 변수를 사용할 때 변하는 값이면 안돼서 final으로 선언하고 그 변수를 stream에 사용함
     */
    public int[] myAnswer(){
        int[] input = {1, 3, 5, 2, 7};
        int[] answer = new int[input.length];

        for(int i = 0; i < input.length; i++){
            final int tempInt = input[i];
            answer[i] = Arrays.stream(input).filter(num -> num != tempInt).reduce(1, (a,b) -> a*b);
        }
        return answer;
    }

    /**
     * 자신을 제외하고 왼쪽과 오른쪽의 곱을 구해서 두 값을 다시 한번 더 곱하는 방식
     */
    public int[] PAES2(){
        int[] input = {1, 3, 5, 2, 7};
        int[] answer = new int[input.length];

        return answer;
    }
}
