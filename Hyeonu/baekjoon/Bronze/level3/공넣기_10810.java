package Hyeonu.baekjoon.Bronze.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 공넣기_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()) - 1;
            int e = Integer.parseInt(st.nextToken()) - 1;
            int val = Integer.parseInt(st.nextToken());
            for(int j=s; j<=e; j++) {
                arr[j] = val;
            }
        }

        for(int i=0; i<N; i++) {
            if(N-1 == i) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }

        }

    }
}
