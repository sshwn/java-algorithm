package Chaewon.Section2;
import java.io.*;
import java.lang.*;

public class Baekjoon_11720_숫자의합구하기 {
    public void myAnswer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int sum = 0;
        String num = br.readLine();
        char[] numArray = num.toCharArray();

        for(int i = 0; i < numArray.length; i++){
            sum += Character.getNumericValue(numArray[i]);
            // 강의에서는 아스키코드를 사용해서 char형을 int형으로 변환함
            // sum += numArray[i] - '0';
        }

        System.out.println(sum);
    }
}
