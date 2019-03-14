package work.yanghao.binarysearch;

import java.util.Arrays;

/**
 * Binary Search
 * 二分查找的时间复杂度是Olog2N
 */
public class BinarySearch {

    public static int binarySearch(int[] srcArray, int des) {



        //定义初始最小、最大索引
        int low = 0;
        int high = srcArray.length - 1;
        //确保不会出现重复查找，越界
        while (low <= high) {
            //计算出中间索引值
            int middle = (high + low)>>>1;//防止溢出
            if (des == srcArray[middle]){
                return middle;
                //判断下限
            } else if (des < srcArray[middle]) {
                high = middle - 1;
                //判断上限
            } else {
                low = middle + 1;
            }
        }
        //若没有，则返回-1
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[5000];
        for (int i=0; i<5000; i++){
            arr[i] = i;
        }
        arr[2500] = 3690;
        //排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int findTag = binarySearch(arr,3690);
        if(-1==findTag)
        {
            System.out.println("没有找到当前的值");
        }
        else
        {
            System.out.println("找到当前输入的值,位置为：" + findTag);
        }
    }
}
