package Hyeonu.baekjoon.Bronze.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 진법변환_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        char[] charArray = str.toCharArray();

        int k = charArray.length - 1;
        int result = 0;
        for (int i = 0; i < charArray.length; i++) {
            int value;
            if (charArray[i] >= '0' && charArray[i] <= '9') {
                value = charArray[i] - '0';
            } else {
                value = charArray[i] - 'A' + 10;
            }
            result += value * Math.pow(N, k);
            k--;
        }

        System.out.println(result);
    }
}
