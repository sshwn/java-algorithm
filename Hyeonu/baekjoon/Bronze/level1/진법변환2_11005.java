package Hyeonu.baekjoon.Bronze.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class 진법변환2_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        String result = "";

        while (true) {
            int k = 0;
            k = N % B;
            N /= B;

            if(k > 9) {
                result = (char)(k + 55) + result;
            } else {
                result = k + "" + result;
            }
            if(N == 0) break;
        }

        System.out.println(result);

    }
}
