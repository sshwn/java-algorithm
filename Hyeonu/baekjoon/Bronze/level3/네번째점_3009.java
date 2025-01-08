package Hyeonu.baekjoon.Bronze.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 네번째점_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int[] x = new int[3];
//        int[] y = new int[3];
        int x = 0;
        int y = 0;
        int x_cnt = 1;
        int y_cnt = 1;

        int a = 0;
        int b = 0;
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if(i==0) {
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());
            } else {
                int k = Integer.parseInt(st.nextToken());
                if(x == k) {
                    x_cnt++;
                } else {
                    a = k;
                }

                int l = Integer.parseInt(st.nextToken());
                if(y == l) {
                    y_cnt++;
                } else {
                    b = l;
                }
            }
        }
        if(x_cnt == 2) {
            if(y_cnt == 2) {
                System.out.println(a +" " + b);
            } else {
                System.out.println(a +" " + y);
            }
        } else {
            if(y_cnt == 2) {
                System.out.println(x + " " + b);
            } else {
                System.out.println(x + " " + y);
            }
        }

    }
}
