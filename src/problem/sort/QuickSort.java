package problem.sort;

/**
 * 快速排序 平均时间复杂度:O(nlogn)	 空间复杂度:O(nlogn)	稳定度：不稳定
 * 原理:找一个基准值(首位元素) 大于它的放在右边 小于的放在左边
 */
public class QuickSort {


    static int[] sort(int[] arr){
        int low=0;
        int high=arr.length-1;
        quickSort(arr,low,high);
        return arr;
    }
  static void quickSort(int[] arr,int low,int high){
        if(low<high) {
            int left=low;
            int right=high;
            int temp = arr[low];
            while (low != high) {
                while (low < high && arr[high] > temp) {
                    high--;
                }
                arr[low] = arr[high];
                while (low < high && arr[low] < temp) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = temp;
            quickSort(arr, left, low - 1);
            quickSort(arr, low + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr={44,2,1,9,55,3,98,34,35};
        int[] sort = sort(arr);
        for (int i = 0; i <sort.length ; i++) {
            System.out.print(sort[i]+" ");
        }
    }
}
