package Hyeonu.inflearn.doit.section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 백준1707 {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int[] B;
    static final int KEY = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        while(K-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A = new ArrayList[V+1];
            visited = new boolean[V+1];
            B = new int[V+1];

            // 초기화
            for(int i = 1; i <V+1; i++) {
                A[i] = new ArrayList<>();
            }

            // 간선 넣기
            for(int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                A[a].add(b);
                A[b].add(a);
            }


            boolean isBipartite = true;
            for(int i = 1; i <V+1; i++) {
                if(B[i] == 0) {
                    if(!DFS(i, KEY)){
                        isBipartite = false;
                        break;
                    };
                }
            }
            if (isBipartite) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


    private static boolean DFS(int v, int k) {
        B[v] = k;
        // 1회전 B[1] = 1;
        // 2회전 B[3] = -1;
        // 3회전 B[2] = 1;
        for(int a : A[v]) {
            if(B[a] == 0) {    // 방문하지 않았다면
                if(!DFS(a, -k)) {
                    return true;
                }
            } else if(B[a] == B[v]) { // 인접한 노드의 값이 동일한지 체크
                return false;
            }
        }
        return true;
    }
}
