package Hyeonu.baekjoon.Bronze.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘수행시간_24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long K = (long) N *N*N;
        System.out.println(K);
        System.out.println(3);

    }
}
