package Hyeonu.baekjoon.Bronze.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세막대_14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);

        // 세 막대의 길이 중 최댓값 구하기
        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c;

        // 삼각형의 불등식을 만족시키는지 확인
        if (sum - max > max) {
            // 삼각형의 둘레
            System.out.println(sum);
        } else {
            // 삼각형을 만들 수 없을 때 최대 둘레
            System.out.println((sum - max) * 2 - 1);
        }
    }
}
