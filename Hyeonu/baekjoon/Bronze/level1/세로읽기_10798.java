package Hyeonu.baekjoon.Bronze.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 세로읽기_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[5][15];
        int cnt = 0;
        for(int i=0; i<5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] A = st.nextToken().split("");
            cnt += A.length;
            for(int j=0; j<15; j++) {
                if(A.length <= j) break;
                arr[i][j] = A[j];
            }
        }

        int k = 0;
        int l = 0;
        String result = "";
        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if(arr[l][k] != null) {
                    result += arr[l][k];
                }
                l++;
            }
            k++;
            l = 0;
        }

        System.out.println(result);
    }
}
