package Chaewon.Section2_스택과큐;
import java.util.*;
import java.io.*;

public class Baekjoon_11659_구간합구하기4 {
    public void myAnswer() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arraySize = Integer.parseInt(st.nextToken());
        int answerSize = Integer.parseInt(st.nextToken());

        // 배열에 입력받은 값 넣기 및 합 배열 만들기
        /**
         * 강의에서는 long 형으로 선언함 
         * => 덧셈, 곱셈이 여러번 일어나는 경우 int형의 크기 제한을 넘어설 수 있기 때문
         * 
         * numArray도 굳이 만들지 않음
         */
        int[] numArray = new int[arraySize];
        int[] sumArray = new int[arraySize];
        st = new StringTokenizer(br.readLine());
        numArray[0] = Integer.parseInt(st.nextToken());
        sumArray[0] = numArray[0];
        for(int i = 1; i < arraySize; i++){
            numArray[i] = Integer.parseInt(st.nextToken());
            sumArray[i] = sumArray[i - 1] + numArray[i];
        }

        // 출력 구하기
        for(int i = 1; i <= answerSize; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if(start == 1)System.out.println(sumArray[end - 1]);
            else System.out.println(sumArray[end - 1] - sumArray[start - 2]);
        }
    }
}
