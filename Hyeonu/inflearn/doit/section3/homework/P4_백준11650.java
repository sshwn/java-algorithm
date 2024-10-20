package Hyeonu.inflearn.doit.section3.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4_백준11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 첫 줄에서 배열의 크기를 입력받기
        String[] dimensions = br.readLine().split(" ");
        int rows = 2; // 행의 개수
        int cols = n; // 열의 개수

        // 2차원 배열 선언
        int[][] arr = new int[rows][cols];

        // 배열에 값 채우기
        for (int i = 0; i < rows; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                // x좌표가 같을경우 y 좌표로 비교
                if(arr[j][0] == arr[j+1][0]) {
                    if(arr[j][1] > arr[j+1][1]) {
                        int temp1 = arr[j+1][0];
                        int temp2 = arr[j+1][1];
                        arr[j+1][0] = arr[j][0];
                        arr[j+1][1] = arr[j][1];
                        arr[j][0] = temp1;
                        arr[j][1] = temp2;
                    }
                } else {    // 다를경우 x값으로 비교
                    if(arr[j][0] > arr[j+1][0]) {
                        int temp1 = arr[j+1][0];
                        int temp2 = arr[j+1][1];
                        arr[j+1][0] = arr[j][0];
                        arr[j+1][1] = arr[j][1];
                        arr[j][0] = temp1;
                        arr[j][1] = temp2;
                    }
                }
            }
        }
        for(int i=0; i<2; i++) {
            for(int j=0; j<arr.length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
