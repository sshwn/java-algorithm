package Hyeonu.baekjoon.Bronze.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            String str = br.readLine();
            System.out.println(str.substring(0, 1) + str.substring(str.length() - 1));
        }
    }
}
