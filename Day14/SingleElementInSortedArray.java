/*
540. Single Element in a Sorted Array
Medium

You are given a sorted array consisting of only integers where every element appears exactly twice, 
except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

Example 1:
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

Example 2:
Input: nums = [3,3,7,7,10,11,11]
Output: 10

Constraints:
1 <= nums.length <= 10^5
0 <= nums[i] <= 10^5
*/
class Solution {
    public int singleNonDuplicate(int[] a) {
        int n=a.length;
        if(n==1) return a[0];
          int s=0,e=n-1;
        
        while(s<=e)
        {int mid=s+(e-s)/2;
        if(mid==0 && a[0]!=a[1]) return a[mid];
        if(mid==n-1 && a[n-1]!=a[n-2]) return a[mid];
        if(a[mid-1]!=a[mid] && a[mid]!=a[mid+1]) return a[mid];

            if(mid%2==0)
            { 
                if(a[mid-1]==a[mid])
                {
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
             else
            {
                 if(a[mid-1]==a[mid])
                 {
                    s=mid+1;
                 }
                 else
                 {
                    e=mid-1;
                 }
            }
        }
        return -1;
    }
}