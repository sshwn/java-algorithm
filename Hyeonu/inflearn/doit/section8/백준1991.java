package Hyeonu.inflearn.doit.section8;

public class 백준1991 {
    public static void main(String[] args) {
        int[] tree = {1, 2, 3, 4, 5, 6, 7}; // 예제 트리 데이터

        System.out.println("전위 순회");
        preOrder(tree, 0);

        System.out.println("\n중위 순회");
        inOrder(tree, 0);

        System.out.println("\n후위 순회");
        postOrder(tree, 0);
    }

    public static void preOrder(int[] tree, int index) {
        if (index < tree.length) {
            System.out.print(tree[index] + " ");
            preOrder(tree, 2 * index + 1); // 왼쪽 자식
            preOrder(tree, 2 * index + 2); // 오른쪽 자식
        }
    }

    public static void inOrder(int[] tree, int index) {
        if (index < tree.length) {
            inOrder(tree, 2 * index + 1); // 왼쪽 자식
            System.out.print(tree[index] + " ");
            inOrder(tree, 2 * index + 2); // 오른쪽 자식
        }
    }

    public static void postOrder(int[] tree, int index) {
        if (index < tree.length) {
            postOrder(tree, 2 * index + 1); // 왼쪽 자식
            postOrder(tree, 2 * index + 2); // 오른쪽 자식
            System.out.print(tree[index] + " ");
        }
    }


    }
