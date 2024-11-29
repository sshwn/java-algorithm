package Inhye.Section7_그래프;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

// [그래프의 표현] 이분 그래프 판별하기: BFS 또는 DFS
public class Baekjoon_1707 {

    // 그래프의 크기 (정점의 수)와 연결된 간선 정보를 저장하는 리스트
    static List<Integer>[] graph;

    // 각 정점의 색 (1 or -1)로 구분, 0은 아직 방문하지 않은 상태
    static int[] color;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스의 수
        int t = sc.nextInt();
        
        while (t-- > 0) {
            // 정점의 수 V, 간선의 수 E
            int v = sc.nextInt();
            int e = sc.nextInt();
            
            // 그래프 초기화
            graph = new ArrayList[v + 1]; // 1번 정점부터 시작하므로 v+1 크기
            color = new int[v + 1]; // 각 정점의 색을 저장할 배열 (0: 방문 안함, 1: 빨강, -1: 파랑)
            
            for (int i = 1; i <= v; i++) {
                graph[i] = new ArrayList<>();
            }
            
            // 간선 정보 입력
            for (int i = 0; i < e; i++) {
                int u = sc.nextInt();
                int v2 = sc.nextInt();
                graph[u].add(v2);
                graph[v2].add(u); // 양방향 그래프
            }
            
            // 모든 정점에 대해 이분 그래프 여부 확인
            boolean isBipartite = true;
            for (int i = 1; i <= v; i++) {
                if (color[i] == 0) { // 아직 방문하지 않은 정점에 대해서만 BFS
                    if (!bfs(i)) {
                        isBipartite = false;
                        break;
                    }
                }
            }
            
            // 결과 출력
            if (isBipartite) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }//.

    // BFS 탐색 함수
    private static boolean bfs(int start) 
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        color[start] = 1; // 첫 번째 정점에 색 1을 칠함
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            
            // 현재 정점의 모든 인접 노드를 탐색
            for (int neighbor : graph[node]) {
                // 인접 노드가 아직 방문되지 않았다면 색을 반대 색으로 칠하고 큐에 넣음
                if (color[neighbor] == 0) {
                    color[neighbor] = -color[node];
                    queue.offer(neighbor);
                }
                // 만약 인접 노드가 현재 노드와 같은 색을 가지고 있다면 이분 그래프가 아님
                else if (color[neighbor] == color[node]) {
                    return false;
                }
            }
        }

        return true;
    }
    
}
