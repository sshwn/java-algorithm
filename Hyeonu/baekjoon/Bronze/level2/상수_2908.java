package Hyeonu.baekjoon.Bronze.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상수_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int a = revers(n);
        int b = revers(m);

        System.out.println(a>b ? a : b);
    }

    private static int revers(int n) {
        String answer = "";
        for(int i=0; i<3; i++) {
            answer += n % 10;
            n = n / 10;
        }

        return Integer.parseInt(answer);
    }
}
