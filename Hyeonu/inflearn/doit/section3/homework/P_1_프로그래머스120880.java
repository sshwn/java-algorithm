package Hyeonu.inflearn.doit.section3.homework;

import java.util.ArrayList;

public class P_1_프로그래머스120880 {
    public static void main(String[] args) {
        int[] arr = {10000,20,36,47,40,6,10,7000};
        solution(arr, 30);
    }

    private static int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        ArrayList<Integer> list = new ArrayList<>();
        int k = 0;
        int key = 0;
        for(int i=0; i< arr.length; i++) {
            if(arr[i] == n) {
                answer[k] = arr[i];
                key++;
                k++;
            } else {
                list.add(arr[key]);
                key++;
            }
        }


        int h = 0;
        int g = 0;
        boolean result = false; // + - 구분자
        while(true) {
            int min = 10000;
            for(int i=0; i<list.size(); i++) {
                int l = 0;

                if(list.get(i) > n) {    // n값보다 클 경우   5 6    5-4  6-4
                    l = list.get(i) - n;
                    result = true;
                } else {        // n값보다 작을경우 1 2 3  4-1 4-2 4-3
                    l = n - list.get(i);
                    result = false;
                }
                // 5 -4  ==  4 - 3
                if(min > l || (result && min == l)) {
                    min = l;
                    h = list.get(i);
                    g = i;
                }
            }
            answer[k] = h;
            list.remove(g);
            k++;
            // 배열크기만큼 k가 증가되었다면 탈출
            if(k == arr.length) break;
        }

        return answer;
    }
}
