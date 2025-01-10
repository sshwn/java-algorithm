package Hyeonu.baekjoon.Bronze.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘수행시간_24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long sum = 0;
        for(int i = 1; i < N; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(2);
    }
}
