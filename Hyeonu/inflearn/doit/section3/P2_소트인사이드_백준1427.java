package Hyeonu.inflearn.doit.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2_소트인사이드_백준1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] list = br.readLine().split("");

        String result = "";
        for(int i=0; i<list.length; i++) {
            int max = 0;
            int key = 0;
            for(int j=i; j<list.length; j++) {
                if(max < Integer.parseInt(list[j])) {
                    max = Integer.parseInt(list[j]);
                    key = j;
                }
                if(j == list.length - 1) {
                    list[key] = list[i];
                    list[i] = max + "";
                }
            }
            result += max + "";
        }
        System.out.println(result);
    }
}
