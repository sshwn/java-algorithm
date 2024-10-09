package Inhye.Section3_Sorting;

import java.util.Arrays;
import java.util.Scanner;

/* 
    https://www.acmicpc.net/problem/2750
    
    N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 */
public class BubbleSortingMain {

    public void bubbleSortingMain() {

        int[] numbers = {9,5,2,3,4,1,6};

        //1) Arrays.sort()
        Arrays.sort(numbers);


        //2) 버블정령
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                int temp=numbers[j];
                if(numbers[i] > numbers[j]){
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

    }
}