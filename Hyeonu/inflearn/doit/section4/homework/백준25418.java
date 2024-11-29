package Hyeonu.inflearn.doit.section4.homework;

import javax.swing.plaf.nimbus.State;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준25418 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int K = sc.nextInt();
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[1000000];

        queue.add(new int[]{A, 0});
        visited[A] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int value = current[0];
            int steps = current[1];

            if(value == K) {
                System.out.println(steps);
                return;
            }

            if(value + 1 < visited.length && !visited[value + 1]) {
                queue.add(new int[]{value + 1, steps + 1});
                visited[value + 1] = true;
            }

            if(value * 2 < visited.length && !visited[value * 2]) {
                queue.add(new int[]{value *2, steps +1});
                visited[value * 2] = true;
            }
        }
        sc.close();






/*
        int cnt = 0;
        while(a != k) {
            if(a == k) {
                break;
            }

            if(k % 2 == 0 && k / 2 >= a) {
                k = k/2;
                cnt++;
            } else {
                k = k -1;
                cnt++;
            }
        }
        System.out.println(cnt);

    }

 */
    }
}
