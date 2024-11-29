package Hyeonu.inflearn.doit.section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준10986 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A =  new int[N];
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        int[] B = new int[A.length+1];
        for(int i=0; i<N; i++){
            B[i+1] = A[i] + B[i];
        }

        int cnt = 0;
// 구간 합계 계산 및 조건 검사
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                int k = B[j + 1] - B[i];
                if (k % M == 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
