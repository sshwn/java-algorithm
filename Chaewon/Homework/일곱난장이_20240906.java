package Chaewon.Homework;
import java.util.Arrays;

public class 일곱난장이_20240906 {
    /**
     * 먼저 주어진 9개를 모두 다 더하고 100과의 차이를 구함 -> 차이값이 되는 경우를 찾는 방식
     * @return
     */
    public int[] myAnswer2(){
        int[] height = {20, 7, 23, 19, 10, 15, 25, 8, 13};
        int[] answer = new int[7];
        int totalSum = 0;
        int diff = 0;
        int idx1 = 0;
        int idx2 = 0;
        
        // 주어진 height의 값 다 더함
        for(int i : height) totalSum += i;
        // 100과의 차이 구함
        diff = 100 - totalSum;

        // 두 수를 더해서 diff값 나오는 경우 찾음
        for(int i = 0; i < height.length - 1; i++){
            for(int j = 1; j < height.length; j++){
                // *** 이 부분 숙제 ***
                if(height[i] + height[j] == Math.abs(diff)) {
                    idx1 = i;
                    idx2 = j;
                }
            }
        }

        Arrays.sort(height);

        int j = 0;
        for(int i = 0; i < height.length; i++){
            if(i != idx1 && i != idx2){
                answer[j] = height[i];
                j++;
            }
        }

        return answer;
    }
}
