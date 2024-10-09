package Hyeonu.inflearn.doit.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제
 * 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
 *
 * 출력
 * 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
 */
public class P3_구간_합_구하기1_백준11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int a = Integer.parseInt(arr[1]);

        String[] arr2 = br.readLine().split(" ");

        int[] sum = new int[n+1];
        for(int i=1; i<=n; i++) {
            if(i == 1) sum[i] = Integer.parseInt(arr2[i-1]);
            else sum[i] = sum[i-1] + Integer.parseInt(arr2[i-1]);
        }

        int q = 0;
        int w = 0;
        for(int k=0; k<a; k++) {
            String[] arr3 = br.readLine().split(" ");
            q = Integer.parseInt(arr3[0]);
            w = Integer.parseInt(arr3[1]);
            System.out.println(sum[w] - sum[q-1]);
        }
        System.out.println("aa");

    }
}
