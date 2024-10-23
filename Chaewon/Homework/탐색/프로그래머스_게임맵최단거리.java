package Chaewon.Homework.탐색;
import java.util.*;

public class 프로그래머스_게임맵최단거리 {
    public static int[][] graph;
    public static boolean[][] visited;
    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};
    public static int n;
    public static int m;

    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        graph = maps;

        visited = new boolean[n][m];
        visited[0][0] = true;

        bfs(0, 0);

        if(graph[n - 1][m - 1] == 1){
            return -1;
        }else {
            return graph[n - 1][m - 1];
        }
    }

    public static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});

        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            for(int i = 0; i < 4; i++){
                int movedX = curr[0] + dx[i];
                int movedY = curr[1] + dy[i];

                if(movedX < 0 || movedY < 0 || movedX >= n || movedY >= m) continue;
                if(visited[movedX][movedY] || graph[movedX][movedY] == 0) continue;

                queue.offer(new int[] {movedX, movedY});
                visited[movedX][movedY] = true;
                graph[movedX][movedY] = graph[curr[0]][curr[1]] + 1;
            }
        }
    }
}
