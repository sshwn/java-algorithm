package Hyeonu.baekjoon.Bronze.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 개수세기_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i=0; i<N; i++){
            if(Integer.parseInt(st.nextToken()) == V) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
