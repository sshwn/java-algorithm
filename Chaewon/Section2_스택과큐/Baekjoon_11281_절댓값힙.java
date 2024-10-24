package Chaewon.Section2_스택과큐;
import java.util.*;
import java.io.*;


public class Baekjoon_11281_절댓값힙 {
    /**
     * 스택이나 큐로 어떻게 풀어야 할 지 몰라서 list로 품
     * 시간초과 남
     */
    public void myAnswer() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < inputSize; i++){
            int currentNum = Integer.parseInt(br.readLine());
            if(currentNum != 0){
                // 현재 입력값이 0이 아니면 배열에 값 넣음
                list.add(currentNum);
            }else{
                // 리스트의 크기가 0인데 입력이 0이 들어온 경우 0 출력
                if(list.size() == 0) result.append("0\n");
                else{
                    int min = list.get(0);
                    // 이 부분이 문제
                    for(int j = 1; j < list.size(); j++){
                        // 절대값 비교
                        // 절대값이 같은 경우 음수 값을 min으로 설정
                        if(Math.abs(min) == Math.abs(list.get(j))){
                            min = min > list.get(j) ? list.get(j) : min;
                        } else if(Math.abs(min) > Math.abs(list.get(j))) {
                            min = list.get(j);
                        }
                    }

                    list.remove(list.indexOf(min));
                    result.append(min + "\n");
                }
            }
        }
        System.out.print(result);
    }

    /**
     * 강의에서는 우선순위 큐를 재정의해서 품
     * PriorityQueue<Integer> pQueue = new PriorityQueue<>((o1,o2) -> {
     *     // 재정의코드
     * });
     */
}
