package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    int[] nums={1,2,3,4,5,6,7};
        rotate(nums,3);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    //Rotate an array of n elements to the right to by k steps.
    //Related problem: Reverse words in an String II
    //双反转
    public static void rotate(int[] nums,int k){
        if(nums==null&&nums.length==0) return;
        if(k>=nums.length)k%=nums.length;
        helper(nums,0,nums.length-1);
        helper(nums,0,k-1);
        helper(nums,k,nums.length-1);
    }
    public static void helper(int[] nums,int li,int hi){
        int p=li-1;
        int q=hi+1;
        while(++p<=--q){
            int temp=nums[p];
            nums[p]=nums[q];
            nums[q]=temp;

        }
    }
}
