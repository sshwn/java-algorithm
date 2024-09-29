package Hyeonu.inflearn.doit.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P5_투포인터_백준1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    // 재료의 개수
        int m = Integer.parseInt(br.readLine());    // 갑옷을 만드는데 필요한 수
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int i=0;
        int j=n-1;
        int sum = arr[0] + arr[n-1];
        int cnt = 0;
        while(i < j) {
            if(sum > m) {
                j--;
            } else if(sum < m) {
                i++;
            } else {
                i++;
                j--;
                cnt++;
            }
            sum = arr[i] + arr[j];
        }
        System.out.println(cnt);
    }
}
