package Hyeonu.Chapter8;

public class mainClass {
    public static void main(String[] args) {
        P_1_두_수의합 p1_두_수의합 = new P_1_두_수의합();
        int[] nums = {2,6,11,15};
        int target = 8;
        p1_두_수의합.Solution(nums, target);
        p1_두_수의합.Solution2(nums, target);

        // 추후 진행
        P_2_빗물_트래핑 p2_빗물_트래핑 = new P_2_빗물_트래핑();

        P_3_세_수의_합 p3_세_수의_합 = new P_3_세_수의_합();
        int[] nums2 = {-1, 0, 1, 2, -1, -5};
        p3_세_수의_합.Solution(nums2);

        P_4_배열파티션1 p4_배열파티션1 = new P_4_배열파티션1();
        int[] nums3 = {1,3,4,2};
        p4_배열파티션1.Solution(nums3);

        P_5_자신을제외한배열의_곱 p5_자신을제외한배열의_곱 = new P_5_자신을제외한배열의_곱();
        int[] nums4 = {1,3,5,7};
        p5_자신을제외한배열의_곱.Solution(nums4);

        // 추후 진행
        P_6_주식을_사고팔기_가장좋은_시점 p6_주식을_사고팔기_가장좋은_시점 = new P_6_주식을_사고팔기_가장좋은_시점();
    }
}
