package Hyeonu.Chapter7;

public class P_11_자신을제외한배열의_곱 {
    public int[] Solution(int[] nums) {
        int[] result = new int[nums.length];
        int p = 1;
        for(int i=0; i<nums.length; i++) {
            result[i] = p;
            p *= nums[i];
        }
//      1,

        p = 1;
        for(int i=nums.length -1; i>=0; i--) {
            result[i] *= p;
            p *= nums[i];
        }
        return result;
    }
}
