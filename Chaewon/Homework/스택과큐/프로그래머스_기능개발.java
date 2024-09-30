package Chaewon.Homework.스택과큐;
import java.util.*;

public class 프로그래머스_기능개발 {
    public int[] myAnswer(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++){
            int days = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0) days += 1;

            // 작업별 작업 일수 큐에 저장
            queue.offer(days);
        }

        int count = 0; // 동시에 끝낼 수 있는 작업 수
        int temp = queue.peek(); // 가장 앞에 있는 작업

        while(queue.size() > 0){
            if(queue.peek() <= temp){
                count++;
                queue.poll();
            }else {
                // 이전에 완료된 작업 수 먼저 리스트에 넣음
                answer.add(count);
                count = 0; // 다시 0으로 초기화
                temp = queue.peek();
            }
        }

        // 마지막으로 계산한 count도 리스트에 넣어줌
        answer.add(count);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
