package Hyeonu.inflearn.doit.section4.homework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준13549 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        boolean[] visited = new boolean[100000];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{N,0});

        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int value = now[0];
            int step = now[1];

            if(value < 1) continue;
            if(value == K) {
                System.out.println(step);
                return;
            }
            if(value * 2 < 100000 && !visited[value * 2]) {
                queue.add(new int[]{value * 2, step});
                visited[value * 2] = true;
            }

            if(value - 1 >= 0 && !visited[value-1]) {
                queue.add(new int[]{value-1,step + 1});
                visited[value-1] = true;
            }

            if(value + 1 < 100000 && !visited[value+1]) {
                queue.add(new int[]{value + 1, step + 1});
                visited[value + 1] = true;
            }
        }
        sc.close();
    }
}
