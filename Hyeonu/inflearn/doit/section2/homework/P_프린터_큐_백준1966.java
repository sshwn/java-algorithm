package Hyeonu.inflearn.doit.section2.homework;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class P_프린터_큐_백준1966 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int m = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            String[] rank = sc.nextLine().split(" ");
            // 문서명
            Queue<Integer> queue1 = new ArrayDeque<>();

            Queue<Integer> queue2 = new ArrayDeque<>();

            for (int j = 0; j < rank.length; j++) {
                queue1.add(j);
            }

            for (int j = 0; j <rank.length ; j++) {
                queue2.add(Integer.parseInt(rank[j]));
            }

            int cnt = 0;
            while(queue1.contains(b)) {
                int max = Integer.MIN_VALUE; // 초기 최대값 설정

                // 큐의 모든 요소 확인
                for (Integer number : queue2) {
                    if (number > max) {
                        max = number; // 최대값 갱신
                    }
                }

                // 우선순위가 동일할경우 queue에서 제거
                boolean result = false;
                int k = 0;
                if(max == queue2.peek()) {
                    k = queue1.peek();
                    queue2.poll();
                    queue1.poll();
                    cnt++;
                    result = true;
                } else {    // 다를경우 맨앞에 추가.
                    queue2.add(queue2.peek());
                    queue1.add(queue1.peek());
                    queue2.poll();
                    queue1.poll();

                }

                if(queue1.isEmpty() || (k == b && result)) {
                    break;
                }
            }
            System.out.println(cnt);
        }

    }
}
