package Hyeonu.baekjoon.Bronze.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘수행시간_24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long k = N * (N-1) * (N-2);
        System.out.println(k/6);
        System.out.println(3);

    }
}

