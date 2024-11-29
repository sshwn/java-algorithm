package Chaewon.Homework.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_16173_점프왕쩰리 {
    public static int[][] graph;
    public static boolean[][] visited;
    public static int N;
    public static int[] dx = {1, 0};
    public static int[] dy = {0, 1};
    public static String answer = "";

    public void myAnswer(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        graph = new int[N][N];
        visited = new boolean[N][N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0;  j < N; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited[0][0] = true;
        bfs(0, 0);

        if("".equals(answer)) answer = "Hing";
        System.out.println(answer);
    }

    public static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});

        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            for(int i = 0; i < 2; i++){
                int movedX = temp[0] + dx[i] * graph[temp[0]][temp[1]];
                int movedY = temp[1] + dy[i] * graph[temp[0]][temp[1]];

                if(movedX == N - 1 && movedY == N - 1) answer = "HaruHaru";
                if(movedX >= N || movedY >= N) continue;
                if(visited[movedX][movedY]) continue;

                visited[movedX][movedY] = true;
                queue.offer(new int[] {movedX, movedY});
            }

        }
    }
}
