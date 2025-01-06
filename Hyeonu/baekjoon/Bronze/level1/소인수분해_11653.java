package Hyeonu.baekjoon.Bronze.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int k = 2;
        while (N > 1) {
            if(N % k ==0) {
                N /= k;
                System.out.println(k);
            } else {
                k++;
            }

        }
    }
}
