package com.company;

import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values= new HashMap<Integer, Integer>();
        for(int i=0; i< nums.length; i++)
        {
            values.put(nums[i], i);
        }

        int[] solution= new int[2];

        int index;
        for(int i=0; i< nums.length; i++)
        {
            int find= target - nums[i];

            if(values.containsKey(find) && i!=values.get(find))
            {

                solution[0]=i;

                solution[1]= values.get(find);
                break;
            }



        }

        return solution;

    }
}