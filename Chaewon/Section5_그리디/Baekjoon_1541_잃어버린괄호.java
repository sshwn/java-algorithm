package Chaewon.Section5_그리디;
import java.util.*;

public class Baekjoon_1541_잃어버린괄호 {
    public void myAnswer(){
        Scanner sc = new Scanner(System.in);
        int idx = 0;
        int result = 0;

        StringTokenizer spMinus = new StringTokenizer(sc.nextLine(), "-");
        while(spMinus.hasMoreTokens()){
            int temp = 0;
            StringTokenizer spPlus = new StringTokenizer(spMinus.nextToken(), "+");
            while(spPlus.hasMoreTokens()){
                temp += Integer.parseInt(spPlus.nextToken());
            }

            // 첫번째 구간은 무조건 더하기임
            if(idx == 0) result += temp;
            else result -= temp;

            idx++;
        }

        System.out.println(result);
    }
}
