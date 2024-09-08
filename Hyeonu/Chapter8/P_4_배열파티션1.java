package Hyeonu.Chapter8;

import java.util.Arrays;

public class P_4_배열파티션1 {
    public int Solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(i % 2 != 0) answer += Math.min(nums[i], nums[i-1]);
        }
        return answer;
    }
}
