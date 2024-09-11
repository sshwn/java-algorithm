package Chaewon.Chapter8;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Arrays;

public class 두_수의_덧셈 {
    public int myAnswer() {
        Deque<Integer> input1 = new LinkedList<>(Arrays.asList(2, 4, 3)); // 342
        Deque<Integer> input2 = new LinkedList<>(Arrays.asList(5, 6, 2)); // 265

        String input1String = "";
        String input2String = "";

        while(input1.size() > 0) input1String += input1.pollLast() + "";
        while(input2.size() > 0) input2String += input2.pollLast() + "";

        return Integer.valueOf(input1String) + Integer.valueOf(input2String);
    }

}
