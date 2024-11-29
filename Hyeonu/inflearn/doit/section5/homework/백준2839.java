package Hyeonu.inflearn.doit.section5.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N % 5 == 0) {
            System.out.println(N/5);
            System.exit(0);
        }

        if(N < 15) {
          if(N % 3 == 0) {
              System.out.println(N/3);
              System.exit(0);
          }
        }

        // 3 6 9 12

        // 1. 5

        int max = 10000000;
        int key = N;
        int result = 100;
        for(int i=1; i<=N; i++) {
            key = N;
            int cnt = 0;
            // 먼저 5의 배수값 을 뺀다.
            key = key - (5 * i);
            cnt += i;

            // 남은값을 3으로 나눈다 7
            if(key % 3 == 0) {
                if(key < 0) continue;
                cnt += key / 3;
                result = key % 3;
                if(max > cnt) {
                    max = cnt;
                }
            }

        }

        System.out.println(result == 0 ? max : -1);
    }
}
