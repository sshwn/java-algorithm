package Hyeonu.baekjoon.Bronze.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int result = 0;
        for(int i = 0; i < N; i++) {
            int cnt = 0;
            for(int j = 1; j <= arr[i]; j++) {
                if(arr[i] % j ==0) {
                    cnt++;
                }
            }
            if(cnt == 2) {
                result ++;
            }
            cnt = 0;
        }
        System.out.println(result);
    }
}
