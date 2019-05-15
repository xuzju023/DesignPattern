package xzj.arithmetic.sort;

import javax.swing.text.StyledEditorKit;

public class InsertionSort {
    static int[] sort(int[] arr){
        int len=arr.length;
        for (int i = 1; i <len ; i++) {
            int j=0;
            for (; j <i ; j++) {
                if(arr[i]<arr[j]){
                    break;
                }
            }
            int pre=arr[i];
            int temp;
            for(;j<i+1;j++){
                temp=arr[j];
                arr[j]=pre;
                pre=temp;
            }
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
