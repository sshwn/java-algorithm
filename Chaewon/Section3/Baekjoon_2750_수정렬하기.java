package Chaewon.Section3;
import java.util.*;

public class Baekjoon_2750_수정렬하기 {
    public void myAnswer(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numArray = new int[size];
        for(int i = 0; i < size; i++){
            numArray[i] = sc.nextInt();
        }

        for(int i = 0; i < size - 1; i++){ // loop의 갯수
            for(int j = i + 1; j < size; j++){ // 아직 정렬되지 않은 데이터
                if(numArray[i] > numArray[j]){
                    int temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }

        for(int i = 0; i < size; i++){
            System.out.println(numArray[i]);
        }
    }
}
