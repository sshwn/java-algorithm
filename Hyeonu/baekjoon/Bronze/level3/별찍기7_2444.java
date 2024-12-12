package Hyeonu.baekjoon.Bronze.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기7_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int M = 2*N-1;

        boolean flag = true;
        int k = 1;
        String result = "";

        for(int i = 1; i <=M; i++) {
            result += " ".repeat(N-1) + "*".repeat(k) + "\n";
            if(flag) {
                N--;
                k += 2;
            } else {
                N++;
                k -=2;
            }
            if(N == 1) flag = false;
        }

        System.out.println(result);
    }
}