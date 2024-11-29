package Chaewon.Section2_스택과큐;
import java.util.*;
import java.io.*;

public class Baekjoon_1874_스택수열 {
    public void myAnswer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        /**
         * 강의에서는 StringBuffer 를 사용해서 결과값을 출력하도록 함
         * StringBuffer sb = new StringBuffer();
         * sb.append("+\n"); 과 같은 식으로 넣어서 for문 사용 없이 한번에 출력할 수 있도록
         */
        List<String> result = new ArrayList<>();

        // 제일 마지막으로 스택에 push 됐던 수
        int peekNum = 0;

        while(br.ready()){
            int input = Integer.parseInt(br.readLine());

            if(!stack.empty() && input == stack.peek()){
                stack.pop();
                result.add("-");
            }else{
                for(int i = peekNum + 1; i <= input; i++){
                    stack.push(i);
                    result.add("+");
                }

                peekNum = input;
                stack.pop();
                result.add("-");
            }
        }

        if(!stack.empty()) System.out.println("NO");
        else result.stream().forEach(a -> System.out.println(a));
    }
}
