package Hyeonu.inflearn.doit.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2_백준2178 {
    // dx, dy 좌표
    /**
     * x:0 y:1  위1칸
     * x:1 y:0  오른쪽1칸
     * x:0 y:-1  아래1칸
     * x:-1 y:0  왼쪽1칸
     */
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] visited;
    static int[][] A;
    static int N,M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0; j<M; j++){
                A[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
        BFS(0,0);
        System.out.println(A[N-1][M-1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[] {i,j});   // 처음 시작점
        while(!queue.isEmpty()) {
            int now[] = queue.poll();
            visited[i][j] = true;
            // 상하좌우 탐색
            for(int k=0; k<4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x >= 0 && y >= 0 && x < N && y < M) {    // 배열을 넘어가면안되고
                    if(A[x][y] != 0 && !visited[x][y]) {    // 0이어서 갈수없거나 기방문한 곳이면 안됨
                        // 이제 갈 수 있는곳이다.
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1;//핵심
                        queue.add(new int[] {x,y});
                    }
                }
            }
        }
    }
}
