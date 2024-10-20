package Hyeonu.inflearn.doit.section4.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 백준2606 {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        A = new ArrayList[N+1];
        for(int i=1; i<N+1; i++) {
            A[i] = new ArrayList<>();
        }
        visited = new boolean[N+1];

        for(int i=0; i<M; i++) {
            StringTokenizer st  = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }

        for(int i=1; i<N+1; i++) {
            boolean result = false;
            if(i==1) {
                result = true;
            }
            if(!visited[i]) {
                DFS(i, result);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v, boolean re) {
        if(visited[v]) {
            return;
        } else {
            visited[v] = true;
            for (int i : A[v]) {
                if (!visited[i]) {

                    if (re) {
                        count++;
                    }
                }
                DFS(i, re);
            }
        }
    }
}
