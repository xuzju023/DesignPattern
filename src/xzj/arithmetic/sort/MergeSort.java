package xzj.arithmetic.sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeSort {

    static int[] sort(int[] a) {
        if (a.length == 1) {
            return a;
        }
        int begin = 0;
        int end = a.length - 1;
        int mid = (end - begin) >> 1;

        int[] A1 = new int[mid - begin + 1];
        int[] A2 = new int[end - mid];

        for (int i = 0; i < A1.length; i++) {
            A1[i] = a[i];
        }
        for (int i = 0; i < A2.length; i++) {
            A2[i] = a[i + A1.length];
        }

        return merge(sort(A1), sort(A2));

    }

    static int[] merge(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int[] res = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1  && j < n2 ) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
            } else {
                res[k] = b[j];
                j++;
            }
            k++;
        }
        if(i==n1){
            for (int l = j; l <n2 ; l++) {
                res[k]=b[j];
                k++;
            }
        }else{
            for(int m=i;m<n1;m++){
                res[k]=a[i];
                k++;
            }
        }

        return res;
    }


    public static void main(String[] args) {
        int[] a = {4, 26,8,3,11,5};
        int[] res = sort(a);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }


}
