package Hyeonu.Chapter8;

import java.util.HashMap;
import java.util.Map;

public class P_1_두_수의합 {
    public int[] Solution2(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        // 키와 값을 바꿔서 맵에 저장
        for(int i=0; i<nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        // target에서 첫 번째 수를 뺀 결과를 키로 조회하고 현재 인덱스가 아닌 경우 정답으로 리턴
        for(int i=0; i<nums.length; i++) {
            if(numsMap.containsKey(target - nums[i]) && i != numsMap.get(target - nums[i])) {
                return new int[] {i, numsMap.get(target - nums[i])};
            }
        }

        return null;
    }

    public int[] Solution(int[] nums, int target) {
        int[] reData = new int[2];
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    reData[0] = i;
                    reData[1] = j;
                }
            }
        }
        return reData;
    }
}
