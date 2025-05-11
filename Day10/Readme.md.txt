🚀 Day 🔟/50
✅ Problem Solved: "189. Rotate Array"
🔗 https://leetcode.com/problems/rotate-array/

🧩 Problem Statement:
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

🧪 Examples:
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 step → [7,1,2,3,4,5,6]
rotate 2 steps → [6,7,1,2,3,4,5]
rotate 3 steps → [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output:[3,99,-1,-100]
Explanation:
rotate 1 step → [99,-1,-100,3]
rotate 2 steps → [3,99,-1,-100]

🔍 Constraints:
1<= nums.length<=10^5
-2^31<=nums[i]<=2^31 - 1
0<=k<=10^5

💡 Key Logic:
- Normalizing `k` by taking `k % nums.length` to handle large values of k
- Use a temporary array to store the rotated elements, then copy back to original array

🧠 Concepts Used:
- Array manipulation
- Modular arithmetic
- Temporary array usage

⏱ Time Complexity (TC): O(n)  
📦 Space Complexity (SC): O(n)

#Java #DSA #Arrays #50DaysOfCode #Day10 #ProblemSolving #WomenInTech #LeetCode

