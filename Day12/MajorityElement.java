/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:
- n == nums.length
- 1 <= n <= 5 * 10^4
- -10^9 <= nums[i] <= 10^9
*/


// Normal Approach : (Brute-force,O(n²))

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return a[i];
            }
        }
        return -1;
    }
}

//Efficient Approach : Optimized using sorting, O(n log n)

class Solution {
    public int majorityElement(int[] a) {
        int n=a.length;
        Arrays.sort(a);
      int  count =0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==a[n/2])
            {
                count++;
            }}
            if(count>n/2)
            {
                return a[n/2];
            }
            return -1;
            }}