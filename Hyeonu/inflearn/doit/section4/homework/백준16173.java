package Hyeonu.inflearn.doit.section4.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 백준16173 {
    static int[] dx = {0,1};
    static int[] dy = {1,0};
    static int[][] A;
    static boolean visited[][];
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        visited = new boolean[N][N];

        A = new int[N][N];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        BFS(0,0);
        System.out.println("Hing");

    }

    private static void BFS(int i, int j) {
        if(A[i][j] == -1) {
            System.out.println("HaruHaru");
            System.exit(0);
        }

        for(int k=0; k<2; k++) {
            int x = i + dx[k] * A[i][j];
            int y = j + dy[k] * A[i][j];
            if(x >=N || y >= N || visited[x][y]) continue;

            visited[x][y] = true;
            BFS(x,y);
        }

    }
}
