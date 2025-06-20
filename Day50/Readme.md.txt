🚀 Day5️⃣0️⃣/50 : CodeChef Challenge 

🧩 Problem Solved: Kitchen Timetable  
📊 Problem Type: Arrays | Time Calculation | Scheduling | Implementation  

📝 Today, I:  
Solved a scheduling simulation problem from CodeChef where I had to determine how many students can finish cooking within their allotted kitchen time slots without overlap.

📥 Example Input:
2  
3  
1 10 15  
1 10 3  
3  
10 20 30  
15 5 20  

📤 Output:
2  
1  

💡 Approach:
1. Read the number of test cases  
2. For each test case, input the deadline array `a[]` and time needed array `b[]`  
3. First student gets time from 0 to a[0]; others get time from a[i-1] to a[i]  
4. Count students where available time ≥ required cooking time  
5. Print the count for each test case  

🛠️ Concepts Used:
1. Arrays  
2. Difference Calculation  
3. Input/Output Handling  
4. Conditional Logic  

⏳ Time Complexity: O(N) per test case  
📦 Space Complexity: O(N)  

🌱 #Day50 #CodeChef #DSA #Java #ArrayProblem #Scheduling #CleanCode #WomenInTech #50DaysOfCode #LearningJourney 🚀
