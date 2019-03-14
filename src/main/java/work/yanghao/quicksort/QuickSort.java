package work.yanghao.quicksort;

import java.util.Arrays;

/**
 * quick sort use java
 * 快速排序平均时间复杂度为Onlog(n),最糟糕时间复杂度为O(n^2)
 */
public class QuickSort {


    public static void quickSort(int arr[], int low, int high){

        //首先取第一个元素的值为比较的基准元素，保存在一个变量中
        //记录该次比较的初始的下标位置
        int l = low;
        int h = high;
        int compareValue = arr[low];

        //start 是第一个元素的下标位置，end 是最后一个元素的下标位置

        //开始一轮比较

            //交换start和end处的值
        while(l<h) {
            //当low始终小于high时，首先从high索引处不断和基准元素比较，不断减少high索引的位置，当找到一个比基准元素小的元素时
            while (l < h && arr[h] >= compareValue) {
                h--;
            }
            //交换high和low处元素的值，升low
            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                l++;
            }
            //当low始终小于high时，从low索引处不断和基准元素比较，不断减少high索引的位置，当找到一个比基准元素大的元素时
            while (l < h && arr[l] <= compareValue) {
                l++;
            }
            //交换high和low处元素的值，降high
            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                h--;
            }
            //判断如果low依然小于high,不断做上述循环，直到low和high碰头
        }
        //继续迭代
        if(l-1>low)quickSort(arr,low,l-1);
        if(h+1<high)quickSort(arr,h+1,high);
    }

    public static void main(String[] args) {
        int arr[] = {3,9,6,12,69,36,45,28,8,19,52};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


}
