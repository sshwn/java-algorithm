package Hyeonu.baekjoon.Bronze.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 삼각형과세변_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0 && c == 0) {
                break;
            }

            int max = Math.max(a,Math.max(b,c));
            int other1, other2; if (max == a) { other1 = b; other2 = c; } else if (max == b) { other1 = a; other2 = c; } else { other1 = a; other2 = b; }

            if(max >= other1 + other2) {
                System.out.println("Invalid");
            } else if(a == b && b == c && c == a) {
                System.out.println("Equilateral");
            } else if(a != b && b != c && c != a) {
                System.out.println("Scalene");
            } else {
                System.out.println("Isosceles");
            }
        }
    }
}
