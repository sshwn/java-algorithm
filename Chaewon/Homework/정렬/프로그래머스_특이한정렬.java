package Chaewon.Homework.정렬;

public class 프로그래머스_특이한정렬 {
    public int[] myAnswer(int[] numlist, int n){
        int[] diffArray = new int[numlist.length];

        // 차이값 배열 정의
        for(int i = 0; i < numlist.length; i++){
            diffArray[i] = Math.abs(n - numlist[i]);
        }

        for(int i = 0; i < diffArray.length - 1; i++){
            for(int j = 0; j < diffArray.length - 1 - i; j++){
                if(diffArray[j] > diffArray[j+1]){ // 큰 경우 swap
                    int temp = diffArray[j];
                    diffArray[j] = diffArray[j + 1];
                    diffArray[j + 1] = temp;

                    // 원래 주어진 numlist 정렬
                    temp = numlist[j];
                    numlist[j] = numlist[j + 1];
                    numlist[j + 1] = temp;
                }else if(diffArray[j] == diffArray[j + 1]){ // 같은 경우 큰 숫자가 앞으로
                    if(numlist[j] < numlist[j + 1]){
                        int temp = numlist[j];
                        numlist[j] = numlist[j + 1];
                        numlist[j + 1] = temp;
                    }
                }
            }
        }

        return numlist;
    }
}
