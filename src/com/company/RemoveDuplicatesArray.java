package com.company;

//Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
//
//        Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//
//        Example 1:
//
//        Given nums = [1,1,2],
//
//        Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
//

public class RemoveDuplicatesArray {

    public static void main(String[] args) {
	// write your code here

        int[] nums = new int[]{1,1,2};
        int total=removeDuplicates(nums);
        System.out.println(total);
    }
//Runtime Analysis
    //O(n)
    public static int removeDuplicates(int[] nums)
    {
      int index=0;
        for(int i=0; i<nums.length; i++)
        {
          if(index==0 || nums[index-1] < nums[i])
          {
              nums[index++]= nums[i];
          }
        }

        return index;
    }
}


