package Hyeonu.inflearn.doit.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1_수_정렬하기_백준2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        for(int i=0; i<list.length; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<list.length; i++) {
            int l = 0;
            int k = 1;
            while(k < list.length - i) {
                if(list[l] > list[k]) {
                    // 앞의값이 뒤의값보다 더 클 경우 swap
                    int temp = list[l];
                    list[l] = list[k];
                    list[k] = temp;
                }
                l++;
                k++;
            }
        }

        for(int i=0; i<list.length; i++) {
            System.out.println(list[i]);
        }

    }
}
