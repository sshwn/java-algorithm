package Hyeonu.inflearn.doit.section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] A = new boolean[N+1];
        Arrays.fill(A, true);
        A[0] = A[1] = false;  // 0과 1은 소수가 아님

        for(int i=2; i*i<=N; i++){
            if(A[i]) {
                for (int j = i * i; j <=N; j += i) {
                    A[j] = false;
                }
            }
        }

        for(int i=M; i<=N; i++) {
            if(A[i]) {
                System.out.println(i);
            }
        }
    }
}
