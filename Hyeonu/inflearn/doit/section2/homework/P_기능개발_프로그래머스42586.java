package Hyeonu.inflearn.doit.section2.homework;

import java.util.ArrayDeque;
import java.util.Queue;

public class P_기능개발_프로그래머스42586 {
    public static void main(String[] args) {
        int[] a = {93, 30, 55};
        int[] b = {1,30,5};
        solution(a,b);
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        String result = "";
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=0; i<progresses.length; i++) {
            progresses[i] = 100 - progresses[i];
        }
        for(int i=0; i<progresses.length; i++) {
            if(progresses[i] % speeds[i] != 0) {
                queue.add(progresses[i] / speeds[i] + 1);
            } else {
                queue.add(progresses[i] / speeds[i]);
            }
        }


        while(!queue.isEmpty()) {
            int firstDays = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && queue.peek() <= firstDays) {
                queue.poll(); // 완료되는 기능 제거
                count++; // 배포 기능 수 증가
            }

            queue.add(count); // 배포 가능한 기능 수 추가
        }
        answer = new int[result.length()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = Integer.parseInt(result.substring(i,i+1));
        }
        return answer;
    }
}
