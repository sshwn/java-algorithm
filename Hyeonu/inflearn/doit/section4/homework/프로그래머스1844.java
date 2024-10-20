package Hyeonu.inflearn.doit.section4.homework;

import java.util.LinkedList;
import java.util.Queue;

public class 프로그래머스1844 {
    public static void main(String[] args) {
//        int[][] A = {{1, 1, 1, 1, 0}, {1, 1, 1, 1, 0}, {1, 1, 1, 1, 0}, {1, 1, 1, 0, 0}, {1, 1, 1, 1, 1}};
        int[][] A = {{1},{1}};
        System.out.println(solution(A));
    }

    public static int solution(int[][] maps) {
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        boolean[][] visited = new boolean[maps.length][maps.length ];
        int i=0;
        int j=0;

        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[] {i,j});
        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            visited[i][j] = true;
            for(int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x >= 0 && x < 5 && y >= 0 && y < 5 && !visited[x][y] && maps[x][y] != 0) {
                    visited[x][y] = true;
                    maps[x][y] = maps[now[0]][now[1]] + 1;
                    queue.add(new int[] {x,y});
                }
            }
        }
        if(maps[maps.length -1][maps.length - 1] == 1) {
            return -1;
        }
        return maps[maps.length -1][maps.length - 1];
    }

}
