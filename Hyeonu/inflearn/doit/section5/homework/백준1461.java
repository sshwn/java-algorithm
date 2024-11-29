package Hyeonu.inflearn.doit.section5.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준1461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        // 4. N보다 M이 크다면 가장 큰 수 적용./
        if(N < M) System.out.println(A[N-1]);
/*
        int minus = 0;
        int plus = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i] < 0) minus++;
            else plus++;
        }
*/

        boolean key = false;
        if(Math.abs(A[0]) > A[N-1]) {
            key = true;
        }

        // key가 true면 - 값이 큰것 (마지막)




    }
}
