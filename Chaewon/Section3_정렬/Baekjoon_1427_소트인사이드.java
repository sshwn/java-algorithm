package Chaewon.Section3_정렬;
import java.util.*;

public class Baekjoon_1427_소트인사이드 {
    public void myAnswer(){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        char[] tempArray = num.toCharArray();
        int[] numArray = new int[num.length()];

        // 숫자를 배열에 넣음
        for(int i = 0; i < num.length(); i++){
            numArray[i] = tempArray[i] - '0';
        }


        // 최댓값을 찾고 맨 앞으로 이동
        for(int i = 0; i < num.length() - 1; i++){
            int max = numArray[i];
            int idx = i;

            for(int j = i; j < num.length(); j++){ // max값을 찾는 루프
                if(max < numArray[j]){
                    max = numArray[j];
                    idx = j;
                }
            }
            // 현재 범위에서의 최댓값과 범위의 맨 앞 값 스위치
            int temp = numArray[i];
            numArray[i] = numArray[idx];
            numArray[idx] = temp;
        }

        // 출력
        for(int i : numArray){
            System.out.print(i);
        }
    }
}
