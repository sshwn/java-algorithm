package Hyeonu.inflearn.doit.section3.homework;

public class P3_백준24091 {
    public static void main(String[] args) {
        int n = 1;
        int[] arr = {2,5,1,4,3};

        int start = 0;
        int end = arr.length - 2;
        int pivot = arr.length - 1;

        int cnt = 0;
        while(true) {
            if(arr[start] < arr[pivot]) {
                start++;
            }
            if(arr[end] > arr[pivot]) {
                start++;
            }
            if(arr[start] > arr[pivot] && arr[end] < arr[pivot]) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end++;
            }
            if(start == end) {
                if(arr[start] <arr[pivot]) {
                    arr[start+1] = arr[pivot];
                } else {
                    arr[start-1] = arr[pivot];
                }
            }
            cnt++;
        }
    }
}
