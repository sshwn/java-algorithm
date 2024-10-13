package Chaewon.Section4;

import java.io.*;
import java.util.*;

public class Baekjoon_2178_미로탐색 {
    private static int[][] numArr;
    private static boolean[][] visitArr;
    private static int[] dx = {-1, 0, 0, 1}; // 상, 좌, 우, 하
    private static int[] dy = {0, -1, 1, 0}; // 상, 좌, 우, 하
    private static int N;
    private static int M;

    public void myAnswer() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 주어진 숫자를 2차원배열에 담음
        numArr = new int[N][M];
        for(int i = 0; i < N; i++){
            char[] temp = br.readLine().toCharArray();
            for(int j = 0; j < M; j++){
                numArr[i][j] = temp[j] - '0';
            }
        }

        visitArr = new boolean[N][M];
        visitArr[0][0] = true;
        bfs(0,0);

        System.out.println(numArr[N - 1][M - 1]);

    }

    private static void bfs(int x, int y){
        // 책에서는 Node 클래스를 따로 선언해 주지 않고
        // Queue<int[]> queue = new LinkedList<>();
        // queue.offer(new int[] {x, y});
        // 로 소스를 짰음
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y));

        while(!queue.isEmpty()){
            Node first = queue.poll();
            for(int i = 0; i < 4; i++){
                int movedX = first.x + dx[i];
                int movedY = first.y + dy[i];

                // 처음엔 큐에 배열 그대로를 넣을 생각을 못하고 2차원 배열에 번호를 다시 붙여서 그래프를 다시 만들어야겠다고 생각해서 헤맴
                // 인터넷에서 풀이 보고 품
                if(movedX < 0 || movedX >= N || movedY < 0 || movedY >= M) continue;
                if(visitArr[movedX][movedY] || numArr[movedX][movedY] == 0) continue;

                queue.add(new Node(movedX, movedY));
                visitArr[movedX][movedY] = true;
                numArr[movedX][movedY] = numArr[first.x][first.y] + 1;
            }
        }
    }
}
class Node{
    int x;
    int y;

    Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}

