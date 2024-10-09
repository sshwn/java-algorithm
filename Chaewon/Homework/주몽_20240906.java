package Chaewon.Homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 주몽_20240906 {
    /**
     * 이렇게 푼 방식에서 재료 중복 사용 안하기 위해서 리스트 선언했는데
     * 재료 중복 사용이 될 수가 없음
     * 왜냐면 여러 개의 재료를 사용할 수 있는게 아니고 딱 2개의 재료만 사용하니까
     * EX) 2랑 어떤 수를 더해서 9를 만드려면 무조건 7
     */
    public int myAnswer(){
        int need = 9;
        int[] materials = {2, 7, 1, 4, 5, 3};
        int answer = 0;

        // 재료 중복 사용 안되니까 한번 쓰고 없애주려고 리스트 선언
        List<Integer> list = new ArrayList<>();
        for(int i : materials) list.add(i);

        for(int i = 0; i < list.size(); i++){
            // need에서 리스트의 0번쨰 값을 뺀 결과값이 존재하면 answer에 1 더하고 두 값 리스트에서 제거
            if(list.contains(need - list.get(0))){
                answer++;
                list.remove(list.indexOf(need - list.get(0)));
                list.remove(list.get(0));
            }else{
                // 존재하지 않으면 현재값만 제거
                list.remove(list.get(0));
            }
        }

        return answer;
    }

    /**
     * 투 포인터 사용 풀이
     */
    public void myAnswer_twoPointer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] material = new int[size];
        for(int i = 0; i < size; i++){
            material[i] = Integer.parseInt(st.nextToken());
        }

        /**
         * 강의에서는 배열을 정렬한 후 두 포인터를 양 끝에 배치시켜서 품
         * Arrays.sort(A);
         *
         * while(startIdx < endIdx) {
         *      if(A[startIdx] + A[endIdx] < target) startIdx++;
         *      else if(A[startIdx] + A[endIdx] > target) endIdx--;
         *      else {count++; startIdx++; endIdx--;}
         * }
         */
        int startIdx = 0;
        int endIdx = 1;
        int count = 0;
        while(startIdx != size - 1){
            int sum = material[startIdx] + material[endIdx];
            if(sum == target) count++;

            if(endIdx == size - 1){
                startIdx++;
                endIdx = startIdx + 1;
            }else{
                endIdx++;
            }
        }

        System.out.println(count);
    }
}
