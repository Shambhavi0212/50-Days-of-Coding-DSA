# 📢 🚀 Day4️⃣5️⃣/50: CodeChef Challenge

🧨 Problem Solved: Bomb the Base  
📊 Problem Type: Arrays | Logic | Maximum Calculation | Iteration

📝 Today, I:  
Solved a simulation problem from CodeChef involving defense systems and bomb attacks. The goal was to determine the maximum number of houses that could be destroyed when a bomb hits a house, considering cascading destruction rules.

📥 Example Input:
2
8 6
4 1 6 1 6 5 6 8
2 1
3 5
📤 Output:
6
0

💡 Approach:
1. Read number of test cases `T`.
2. For each test case, take inputs `N` (number of houses), `X` (bomb strength), and array `A[]` (defense of each house).
3. Traverse the array and check which house can be destroyed by comparing `A[i] < X`.
4. Track the last such index `i` and update `max = i + 1` to include previous houses.
5. Print the maximum number of houses destroyed.

🛠️ Concepts Used:
- Array traversal  
- Conditional checks  
- Index manipulation  
- Input handling with Scanner

⏳ Time Complexity: O(N) per test case  
📦 Space Complexity: O(N)

🌱 #Day45 #CodeChef #DSA #Java #ArrayProblem #Simulation #LogicalThinking #ProblemSolving #50DaysOfCode #WomenInTech #LearningJourney 🚀
