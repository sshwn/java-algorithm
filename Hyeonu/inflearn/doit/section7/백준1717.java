package Hyeonu.inflearn.doit.section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class 백준1717 {
    static int[] parent;
    static int[] rank;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        parent = new int[n+1];
        rank = new int[n+1];

        for(int i = 0; i < n+1; i++){
            parent[i] = i;
            rank[i] = 0;
        }

        for(int i = 0; i < m+1; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int key = Integer.parseInt(st1.nextToken());

            int q = Integer.parseInt(st1.nextToken());   // 부모
            int w = Integer.parseInt(st1.nextToken());   // 자식

            if(key == 0) {
                union(q,w);
            } else {
                if(rank[q] == rank[w]) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }
    }

    private static void union(int q, int w) {
        find(q);
        rank[w] = rank[q];

    }

    private static void find(int val) {
        // 대상 노드 배열에 index값과 value값이 동일한지 확인
        if(parent[val] == rank[val]) {
            // 대표 노드에 도달하면 재귀함수를 빠져나오면서 거치는 모든 노드값을 루트 노드값으로 변경
        } else {
            // 동일하지 않으면 value값이 가리키는 index 위치로 이동 
            // (이동 위치의 index값과 value값이 같을 때까지 반복 재귀하수
            
            
        }
    }
}
