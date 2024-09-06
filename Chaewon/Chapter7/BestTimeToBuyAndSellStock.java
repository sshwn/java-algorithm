package Chaewon.Chapter7;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {

    /**
     * skip(n) -> 처음 n개를 뛰어넘김
     * getAsInt() -> 결과값을 int 형으로 반환
     */

    public int myAnswer(){
        int[] input = {8, 1, 5, 3, 6, 4};
        int[] result =  new int[input.length];

        for(int i = 0; i < input.length - 1; i++){
            final int buy = input[i];
            final int buyIdx = i;

            int[] temp = Arrays.stream(input).skip(buyIdx + 1)
                    .map(a -> a - buy).toArray();

            result[i] = Arrays.stream(temp).max().getAsInt();
        }

        return Arrays.stream(result).max().getAsInt();
    }
}
