package com.p.al.sort;


public class QuickSort {
    int[] _nums = {9,1,3,4,6,8,2,7};

    public void testqSort() {
        qSort(_nums, 6, 0, _nums.length - 1);
        for(int i : _nums) {
            System.out.println(i);
        }
        return;
    }

    public void qSort(int[] nums, int val, int p, int q) {

        if (p == q) {
            return;
        }
          if(p + 1 == q) {
            if(nums[p] < nums[q]) {
                swap(nums, p, q);
            }
            return;
        }

        //int length = nums.length;

        int pivot = p + (q-p)/2;

        while(nums[p] <= val && p < pivot) {
            p++;
        }
        while(nums[q] >= val && pivot < q) {
            q--;
        }

        if(p < pivot && q > pivot) {
            swap(nums, p, q);
            qSort(nums, val, p, pivot);
            qSort(nums, val, pivot, q);
            return;
        }

        if(p < pivot ) {
            qSort(nums,val, p, pivot);
            return;

        }

        if(q > pivot) {
            qSort(nums, val, pivot, q);
            return;
        }

    }

    private void swap(int[] nums, int p, int q) {
        int tmp = nums[q];
        nums[q] = nums[p];
        nums[p] = tmp;
    }

    public static void main(String[] args) {
         QuickSort sort = new QuickSort();
        sort.testqSort();

    }
}
