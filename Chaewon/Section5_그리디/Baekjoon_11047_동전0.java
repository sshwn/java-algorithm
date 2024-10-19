package Chaewon.Section5_그리디;

import java.io.*;
import java.util.*;

public class Baekjoon_11047_동전0 {
    public void myAnswer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] money = new int[N];

        for(int i = 0; i < N; i++){
            money[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        // 큰 수 부터 나누기
        for(int i = N - 1; i >= 0; i--){
            if(money[i] <= K){
                count += K / money[i];
                K %= money[i];
            }
        }

        System.out.println(count);
    }
}
