📢 🚀 Day4️⃣7️⃣/50: CodeChef Challenge 

🧩 Problem Solved: The Squid Game  
📊 Problem Type: Array | Greedy | Summation | Game Logic  

📝 Today, I:  
Solved an interesting problem where I had to calculate the **maximum prize** a player can win by surviving in a deadly game (inspired by Squid Game). The twist is that we can choose any player as the winner, and the rest contribute money when eliminated.

📥 Example Input:
3  
3  
3 1 2  
5  
1 1 1 1 1  
6  
3 6 4 2 5 1  

📤 Output:
5  
4  
20  

💡 Approach:
1. For each test case, read number of players and their respective prize contributions.
2. The total prize pool is the sum of all elements in the array.
3. Since we choose one player as the winner (who **doesn't** contribute to the prize pool), the maximum prize they can win is:
   - **totalSum - min(A[i])**
   - because subtracting the minimum A[i] maximizes the prize pool.
4. Print the result.

🛠️ Concepts Used:
1. Array Traversal  
2. Minimum Element Identification  
3. Greedy Approach  
4. Input/Output Handling  

⏳ Time Complexity: O(N) per test case  
📦 Space Complexity: O(N) per test case  

🌱 #Day47 #CodeChef #DSA #Java #ArrayProblem #SquidGame #GreedyAlgorithm #50DaysOfCode #LearningJourney #CleanCode 🚀
