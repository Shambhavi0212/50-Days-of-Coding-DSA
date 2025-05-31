🚀 Day 1️⃣2️⃣/50:

✅ Problem Solved: "Majority Element"

🔗 LeetCode Link: [https://leetcode.com/problems/majority-element/](https://leetcode.com/problems/majority-element/)

🧩 Problem Statement:

So, they have given an array `nums` of size `n`(I changed it to 'a' for my convenience), which need to return the majority element. The majority element is the element that appears more than ⌊n / 2⌋ times. We may assume that the majority element always exists in the array.

🧪 Examples:  
Input:a=[2,2,1,1,1,2,2]`  
Output:`2`

---

1st Screenshot:  
🔹 Brute-force Approach (O(n²))  
Concept: For each element in the array, count its occurrences by comparing it with every other element. If any element's count exceeds ⌊n / 2⌋, return it.

⏳ Time Complexity: O(n²) due to the nested loops for counting occurrences.  
💾 Space Complexity: O(1) as no additional space is used beyond variables for counting.

Pros: Simple to implement.  
Cons: Inefficient for large arrays due to high time complexity.

---

2nd Screenshot:  
🔹 Optimized Sorting Approach (O(n log n))  
Concept: Sort the array. Since the majority element appears more than ⌊n / 2⌋ times, it will occupy the middle position in the sorted array. After sorting, verify that the element at index `n/2` indeed appears more than `n/2` times.

⏳ Time Complexity: O(n log n) due to the sorting operation.  
💾 Space Complexity: O(1) if the sorting algorithm is in-place.

Pros: More efficient than the brute-force approach.  
Cons: Sorting the entire array might be unnecessary if only the majority element is needed.

---

💡 Key Logic:  
🧠 Concepts Used:  
----> Array Traversal  
----> Sorting Algorithms  
----> Frequency Counting

📚 Language: Java

🧠 Learning Outcome:  
Through this problem, I enhanced my understanding of:

1. Implementing basic frequency counting techniques  
2. Utilizing sorting to simplify problem-solving  
3. Recognizing the trade-offs between different algorithmic approaches in terms of time complexity

🌱 Continuing the journey of #LearningAndGrowing 💪  
#Java #DSA #ProblemSolving #50DaysOfCode #WomenInTech #Arrays #Day12 #CodingChallenge #TechJourney #CodeNewbie
