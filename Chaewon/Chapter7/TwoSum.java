package Chaewon.Chapter7;

import java.util.HashMap;

public class TwoSum {
    public void myAnswer(){
        int[] nums = {2, 11, 6, 15};
        int target = 8;

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j <nums.length; j++){
                if(target == nums[i] + nums[j]){
                    System.out.println(i + ", " + j);
                }
            }
        }
    }

    public void twoSum2(){
        int[] nums = {2, 11, 6, 15};
        int target = 8;

        HashMap<Integer, Integer> numsMap = new HashMap<>();
        // nums의 값을 key로, 인덱스를 value로 이루는 데이터를 map에 넣음
        for(int i = 0; i < nums.length; i++){
            numsMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            // target - nums 값을 한 결과가 map에 존재하는 지 파악 && 자기자신을 출력하지 않도록 조건문 걸어줌
            if(numsMap.containsKey(target - nums[i]) && i != numsMap.get(target - nums[i])){
                System.out.println(i + ", " + numsMap.get(target - nums[i]));
                break;
            }
        }
    }
}
