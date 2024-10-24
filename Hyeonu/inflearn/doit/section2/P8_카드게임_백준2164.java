package Hyeonu.inflearn.doit.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class P8_카드게임_백준2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new ArrayDeque<>();

        for(int i=0; i<n; i++) {
            queue.add(i+1);
        }

        int k = 0;
        while(queue.size() != 1) {
            queue.poll();
            k = queue.peek();
            queue.poll();
            queue.add(k);
        }
        System.out.println(queue.peek());
    }
}
