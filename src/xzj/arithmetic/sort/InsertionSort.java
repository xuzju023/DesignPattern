package xzj.arithmetic.sort;

import javax.swing.text.StyledEditorKit;

public class InsertionSort {
    static int[] sort(int[] arr){
        int len=arr.length;
        for (int i = 1; i <len ; i++) {
            int temp=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]<temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,9,55,44,98,34};
        int[] sort = sort(arr);
        for (int i = 0; i <sort.length ; i++) {
            System.out.println(sort[i]);
        }

    }

}
