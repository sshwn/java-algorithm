package Hyeonu.inflearn.doit.section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 백준2252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());    // 사람 수
        int M = Integer.parseInt(st1.nextToken());    // 비교횟수

        ArrayList<Integer>[] A = new ArrayList[N+1];
        int[] inDegree = new int[N+1];
        for(int i=1; i<N+1; i++) {
            A[i] = new ArrayList<>();
        }

        for(int i=1; i<M+1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            inDegree[b]++;  // 도착점 차수 ++
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<N+1; i++) {
            if(inDegree[i] == 0) {  // 차수가 0 일 경우에만 queue에 추가
                queue.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()) {
            int current = queue.poll();
            sb.append(current).append(' ');

            for(int k : A[current]) {
                inDegree[k]--;
                if(inDegree[k] == 0) {
                    queue.add(k);
                }
            }
        }
        System.out.println(sb.toString().trim());

    }

}
