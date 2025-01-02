package Hyeonu.baekjoon.Bronze.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

/*
        6  = 1 2~7
        12 = 2 8 ~ 19
        18 = 3

        +1하고 나눳을때 1 ,23, 456, 78910,
 */
        int sum = 1;
        int cnt = 1;

        if(N == 1) {
            System.out.println(sum);
        } else {
            while (true) {
                sum += 6 * cnt;
                cnt++;
                if (sum > N) break;
            }
            System.out.println(cnt);
        }

    }
}
