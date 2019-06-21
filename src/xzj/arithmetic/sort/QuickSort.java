package xzj.arithmetic.sort;

public class QuickSort {


    static int[] sort(int[] arr){
        int low=0;
        int high=arr.length-1;
        quickSort(arr,low,high);
        return arr;
    }
  static    void quickSort(int[] arr,int low,int high){
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
        int[] arr={3,2,1,9,55,44,98,34,35};
        int[] sort = sort(arr);
        for (int i = 0; i <sort.length ; i++) {
            System.out.println(sort[i]);
        }
    }
}
