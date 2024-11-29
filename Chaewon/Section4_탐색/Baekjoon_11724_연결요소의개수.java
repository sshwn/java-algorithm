package Chaewon.Section4_탐색;
import java.util.*;
import java.io.*;

public class Baekjoon_11724_연결요소의개수 {
    private static ArrayList<Integer>[] relList;
    private static boolean[] visitArray;

    public void myAnswer() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int nodeSize = Integer.parseInt(st.nextToken());
        int lineSize = Integer.parseInt(st.nextToken());

        relList = new ArrayList[nodeSize + 1]; // 그래프 표현
        visitArray = new boolean[nodeSize + 1]; // 방문여부 배열
        int count = 0; // 연결요소 갯수

        for(int i = 1; i < nodeSize + 1; i++){
            relList[i] = new ArrayList<>();
        }

        // 1 -> 2, 5
        // 2 -> 5, 1
        // 3 -> 4
        // 4 -> 6
        // 5 -> 1, 2
        // 6 -> 4 니까 arrayList 안에 다시 arrayList를 만듦 (처음에 2차원배열으로 만들었다가 뭔가 복잡해져서 arrayList로 수정)
        for(int i = 0; i < lineSize; i++){
            st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken());
            int nodeTo = Integer.parseInt(st.nextToken());

            // 그래프에 값 넣어줌
            relList[node].add(nodeTo);
            relList[nodeTo].add(node);
        }

        for(int i = 1; i < nodeSize + 1; i++){
            // 하나의 연결요소가 모두 탐색되면 다음 연결요소가 있는지 찾아서 count++ 해줌
            // 처음 시작점으로 1이 들어가고 2, 5가 탐색됨
            // 다음 시작점을 찾을 때 노드 2는 이미 방문한 노드니까 시작점으로 잡지 않음
            if(!visitArray[i]){
                count++;
                dfs(i);
            }
        }

        System.out.println(count);
    }

    private static void dfs(int node){
        if(visitArray[node]) return; // 이미 방문한 적 있는 노드이면 그냥 리턴

        // 방문한 적 없으면 아래 로직 실행
        visitArray[node] = true;
        for(int to : relList[node]){
            dfs(to);
        }
    }


}
