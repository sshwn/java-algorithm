package Hyeonu.baekjoon.Bronze.level3;
import java.util.Scanner;

public class 그대로출력하기_11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }

        sc.close();
    }
}

