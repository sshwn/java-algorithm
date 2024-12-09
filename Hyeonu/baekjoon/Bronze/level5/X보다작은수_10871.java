package Hyeonu.baekjoon.Bronze.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class X보다작은수_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        String result = "";
        for(int i=0; i<N; i++){
            int k = Integer.parseInt(st.nextToken());
            if(X > k) {
                result += k + " ";
            }
        }
        System.out.println(result.trim());
    }
}
