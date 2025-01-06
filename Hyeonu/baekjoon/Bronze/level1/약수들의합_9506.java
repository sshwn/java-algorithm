package Hyeonu.baekjoon.Bronze.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 약수들의합_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == -1) break;
            int sum = 0;
            String result = N + " = ";
            for (int i = 1; i <= N / 2; i++) {
                if (N % i == 0) {
                    sum += i;
                    result += i + " + ";
                }
            }
            result = result.substring(0, result.length() - 3); // 마지막 " + " 제거
            if (N == sum) {
                System.out.println(result);
            } else {
                System.out.println(N + " is NOT perfect.");
            }
        }
    }
}
