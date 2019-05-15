package xzj.arithmetic.sort;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 9:56 2019/5/7
 */
public class OoSort {
    static void sort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {

                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arr={6,3,8,2,9,1};
        sort(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("a".equals("a"));
    }
}
