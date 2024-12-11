package Hyeonu.baekjoon.Bronze.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 킹퀸룩비숍나이트폰_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String result = "";
        // 1 1 2 2 2 8
        int[] arr = {1,1,2,2,2,8};
        for(int i=0; i<arr.length; i++) {
            result += arr[i] - Integer.parseInt(st.nextToken()) + " ";
        }
        System.out.println(result);



    }
}
