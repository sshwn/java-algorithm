package Chaewon.Section4;

import java.util.*;
import java.io.*;

public class Baekjoon_1920_수찾기 {
    public void myAnswer() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            int temp = Integer.parseInt(st.nextToken());
            boolean exist = false;

            if(temp <= A[N - 1] && temp >= A[0]) {
                int low = 0;
                int high = N - 1;

                while(low <= high){
                    int mid = (low + high) / 2;

                    if(A[mid] == temp) {
                        exist = true;
                        break;
                    }else if(A[mid] > temp){
                        high = mid - 1;
                    }else {
                        low = mid + 1;
                    }
                }
            }

            if(exist) System.out.println(1);
            else System.out.println(0);
        }
    }
}
