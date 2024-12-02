package Hyeonu.baekjoon.Bronze.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기2_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int k = N;
        for(int i = 1; i <= N; i++) {
            String star = "";
            for(int j = 1; j <= N; j++) {
                if(j >= k) {
                    star += "*";
                } else {
                    star += " ";
                }
            }
            System.out.println(star);
            k--;
        }
    }
}
