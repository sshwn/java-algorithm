package Chaewon.Homework.탐색;

import java.io.*;
import java.util.*;

public class Baekjoon_2606_바이러스 {
    public static ArrayList<Integer>[] graph;
    public static boolean[] visited;
    public static int count;

    public void myAnswer(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int comSize = Integer.parseInt(br.readLine());
        int nodeSize = Integer.parseInt(br.readLine());

        graph = new ArrayList[comSize + 1];
        visited = new boolean[comSize + 1];
        count = 0;

        for(int i = 1; i < comSize + 1; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < nodeSize; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int nodeFrom = Integer.parseInt(st.nextToken());
            int nodeTo = Integer.parseInt(st.nextToken());

            graph[nodeFrom].add(nodeTo);
            graph[nodeTo].add(nodeFrom);
        }

        dfs(1);

        for(boolean i : visited){
            if(i) count++;
        }
        System.out.println(count - 1);

    }

    public static void dfs(int node){
        if(visited[node]) return;

        visited[node] = true;
        for(int to : graph[node]){
            dfs(to);
        }
    }
}
