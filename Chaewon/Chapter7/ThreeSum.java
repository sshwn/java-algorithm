package Chaewon.Chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    /**
     * 책의 테스트 데이터에 대해서는 값이 잘 나와서 맞게 풀이한 줄 알았는데
     * j와 k에 대해서도 중복값이 될 수 있다는 점을 놓힘
     *
     * 그리고 중복을 제외하는 조건도 잘못됨 => nums[i] == nums[i - 1] 대신 nums[i] != nums[i - 1] 이렇게 조건을 걸어서 동작되게 했는데
     * 이런 식으로 조건을 주면 실제로 nums[i] + nums[j] + nums[k] == 0 일 떄도 해당 조건 때문에 24번째 줄이 실행이 안될 수 있음
     *
     * 타임아웃
     */
    public void myAnswer() {
        int[] nums = {-1, 0, 1, 2, 2, -1, -5};
        Arrays.sort(nums); // -5 -1 -1 0 1 2

        for(int i = 0; i < nums.length - 2; i++){
            // 답이 될 수 있는 경우 중 순서만 다른 경우를 제외하기 위함
            if(i > 0 && nums[i] != nums[i - 1]){
                for(int j = i + 1; j < nums.length - 1; j++){
                    for(int k = j + 1; k < nums.length; k++){
                        if(nums[i] + nums[j] + nums[k] == 0){
                            System.out.println(nums[i] + ", " + nums[j] + ", " + nums[k]);
                        }
                    }
                }
            }
        }
    }

    /**
     * 책 - 부르트 포스로 계산 (타임아웃)
     * 책에서는 nums[i] == nums[i - 1] 이 조건을 사용하고 해당 조건에 일치하면 continue 하도록 해서 중복을 제거하도록 함
     */
    public void threeSum2(){
        int[] nums = {-1, 0, 1, 2, 2, -1, -5, -1, -5};
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            // 답이 될 수 있는 경우 중 순서만 다른 경우를 제외하기 위함
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            for(int j = i + 1; j < nums.length - 1; j++){
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                
                for(int k = j + 1; k < nums.length; k++){
                    if(k > j + 1 && nums[k] == nums[k - 1]) continue;

                    if(nums[i] + nums[j] + nums[k] == 0){
                        System.out.println(nums[i] + ", " + nums[j] + ", " + nums[k]);
                    }
                }
            }

        }
    }

    /**
     * 책 - 투 포인터로 계산
     */
    public List<List<Integer>> threeSum3(){
        int[] nums = {-1, 0, 1, 2, 2, -1, -5, -1, -5};
        int left, right, sum;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            left = i + 1;
            right = nums.length - 1;

            while(left < right){
                sum = nums[i] + nums[left] + nums[right];

                if(sum > 0) right -= 1;
                else if(sum < 0) left += 1;
                else {
                    result.add(Arrays.asList(nums[i] , nums[left], nums[right]));

                    while(left < right && nums[left] == nums[left + 1]) left += 1;
                    while(left < right && nums[right] == nums[right + 1]) right -= 1;

                    right -= 1;
                    left += 1;
                }
            }
        }
        return result;
    }

}
