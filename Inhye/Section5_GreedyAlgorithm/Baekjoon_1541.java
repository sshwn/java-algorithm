package Inhye.Section5_GreedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_1541 {

    /*
     * +, -, 양수
     * 괄호쳐서 최소값 만들기
     * 모든 합을 다 계산 -> 뺄셈
     */
    
    public static void main(String[] args) {
        //55-50+40    => -35
        //10+20+30+40 => 100
        //00009-00009 => 0
        String expression = "55-50+40";

        String[] subtractParts = expression.split("-"); //[55, 50+40]
       
        int result = sumOfExpression(subtractParts[0]);

        for (int i = 1; i < subtractParts.length; i++) {
            result -= sumOfExpression(subtractParts[i]);
        }

        System.out.println(result);

    }

    private static int sumOfExpression(String expr) {
        //TODO 문자열을 '+','^','*'로 split할 때 주의
        String[] addParts = expr.split("\\+");

        int sum = 0;
        for (String part : addParts) {
            sum += Integer.parseInt(part);
        }
        return sum;
    }

    
}
