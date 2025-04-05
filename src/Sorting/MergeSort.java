package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int [] arr= {12,10,9,8,7,6,5,4,3,2,1};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

     static void mergeSort(int arr[], int l, int r) {

        if(r-l<=1) return;
        int mid = l +(r-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid, r);
        merge(arr, l, mid, r);
    }
    private static void merge(int [] arr, int left, int mid , int right){
        int start= left;
        int end = mid;
        ArrayList<Integer> newArr = new ArrayList<Integer>();

       while(start<mid && end < right){
           if(arr[start]<=arr[end]){
               newArr.add(arr[start]);
               start++;
           }else if (arr[start]>arr[end]){
               newArr.add(arr[end]);
               end++;
           }
       }
       while(start< mid){
           newArr.add(arr[start]);
           start++;
       }
       while(end< right){
           newArr.add(arr[end]);
           end++;
       }

       for(int i=0;i<newArr.size();i++){
           arr[i+left]=newArr.get(i);
       }
    }


}
