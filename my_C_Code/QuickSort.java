package datastructure.sort;

//快速排序

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={-9,78,0,23,78,70};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public  static void quickSort(int[] arr,int left,int right){
        int l=left;
        int r=right;
        int pivot=arr[(left+right)/2];
        int temp=0;
        while (l<r){
            while (arr[l]<pivot){
                l++;
            }
            while (arr[r]>pivot){
                r--;
            }
            if(l>=r){
                break;
            }
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            if(arr[l]==pivot){
                r--;
            }
            if(arr[r]==pivot){
                l++;
            }
       }
        if(l==r){
            l+=1;
            r-=1;
        }
        //左递归
        if(left<r){
            quickSort(arr,left,r);
        }
        //右递归
        if(right>l){
            quickSort(arr,l,right);
        }


    }
}
