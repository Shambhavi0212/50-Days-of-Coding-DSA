🚀 Day 1️⃣5️⃣/50 :

✅ Problem Solved: 33 : "Search in Rotated Sorted Array"  
🔗 Leetcode Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

🧩 Problem Statement  
You are given an integer array nums sorted in ascending order (with distinct values), and it is possibly rotated at an unknown pivot index.  

The array is rotated such that [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] becomes the new array.  
Given a target value, return its index in the array. If not present, return -1.  
You must solve it in O(log n) time.

🧪 Examples  

Example 1:  
Input:nums=[4,5,6,7,0,1,2], target = 0  
Output: 4

Example 2:  
Input:nums=[4,5,6,7,0,1,2], target = 3  
Output: -1

🔍 Constraints  
- 1 <= nums.length <= 5000  
- -10⁴ <= nums[i] <= 10⁴  
- All values are unique  
- The array is a rotated version of a sorted array  
- -10⁴ <= target <= 10⁴

💡 Key Logic  
To solve this in O(log n) time, we apply a modified binary search:

- Check which side of the array (left or right of mid) is sorted  
- Depending on where the target might lie, narrow the search  
- Repeat until the target is found or bounds collapse

This is a classic variation of binary search designed to handle rotated arrays.

🧠 Concepts Used  
- Binary Search  
- Array Indexing  
- Condition Handling  
- Rotated Array Properties  

⏱ Time Complexity  
O(log n) – Thanks to binary search over a rotated structure  

📦 Space Complexity  
O(1) – Only a few extra variables are used  

🧠 Learning Outcome  
Through this problem, I gained deeper insights into:
- Adapting traditional algorithms (like binary search) for modified scenarios  
- Handling rotated sorted arrays  
- Strengthening my control flow logic in array-based conditions  

🌱 Keeping up the momentum in my #50DaysOfCode Challenge  
📌 #Day15 #Leetcode33 #BinarySearch #DSA #CodingChallenge #WomenInTech #TechJourney #LearningAndGrowing #CodeNewbie #Java
