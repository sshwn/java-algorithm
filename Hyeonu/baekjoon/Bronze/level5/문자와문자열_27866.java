package Hyeonu.baekjoon.Bronze.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자와문자열_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        System.out.println(str.substring(n-1, n));
    }
}
