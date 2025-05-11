/*
LeetCode 283. Move Zeroes
Easy

🧩 Problem Statement:
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note:
- You must do this in-place without making a copy of the array.

🔍 Examples:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Input: nums = [0]
Output: [0]

📌 Constraints:
- 1 <= nums.length <= 10^4
- -2^31 <= nums[i] <= 2^31 - 1
*/
class Solution {
    public void moveZeroes(int[] a) {
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                a[j]=a[i];
                j++;
            }
        }
        for(int i=j;i<a.length;i++)
        {
            a[j]=0;
            j++;
        }
    }
}
