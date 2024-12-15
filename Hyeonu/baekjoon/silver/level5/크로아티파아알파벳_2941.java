package Hyeonu.baekjoon.silver.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티파아알파벳_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int cnt=0;
        for(int i = 0; i < arr.length; i++) {
//            cnt += str.contains(arr[i]);
            int s = str.length();
            str = str.replaceAll(arr[i], " ");
            int e = str.length();
        }
        System.out.println(str.length());

    }
}
