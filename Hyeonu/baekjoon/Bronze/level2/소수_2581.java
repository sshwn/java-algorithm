package Hyeonu.baekjoon.Bronze.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int first = 0;
        int result = 0;
        for(int i=N; i<=M; i++){
            int cnt = 0;
            for (int j=1; j<=i; j++){
                if(i % j == 0) {
                    cnt++;
                }
            }
            if(cnt == 2) {
                result += i;
                if(first == 0) {
                    first = i;
                }
            }
        }
        if(first != 0) {
            System.out.println(result);
        }
        System.out.println(first == 0 ? -1 : first);
    }
}
