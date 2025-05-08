/*
🔄 Problem: MIN To MAX

You are given an array A of size N.

Let M be the minimum value present in the array initially.
In one operation, you can choose an element Ai (1 ≤ i ≤ N) and an integer X (1 ≤ X ≤ 100), and set Ai = X.

Determine the minimum number of operations required to make M the maximum value in the array A.

--------------------------------------------------------------
Input Format

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of multiple lines of input:
  • The first line of each test case contains a single integer N - the size of the array.
  • The next line contains N space-separated integers A1, A2, …, AN - the elements of the array.

--------------------------------------------------------------
Output Format

For each test case, output on a new line the minimum number of operations required 
to make M the maximum value in the array A.

--------------------------------------------------------------
Constraints

1 ≤ T ≤ 100  
1 ≤ N ≤ 100  
1 ≤ Ai ≤ 100  

--------------------------------------------------------------
Sample Input

3
2
1 2
4
2 2 3 4
1
1

--------------------------------------------------------------
Sample Output

1
2
0

--------------------------------------------------------------
Explanation

Test Case 1:
The minimum value in the array, M, is initially 1.
We can use one operation: choose A2 and set it to X = 1.
Final array: [1, 1]. Max = 1 → 1 operation needed.

Test Case 2:
M = 2. Use two operations:
→ Set A4 = 2 ⇒ [2, 2, 3, 2]
→ Set A3 = 2 ⇒ [2, 2, 2, 2]
Now, M = 2 is the max. → 2 operations needed.

Test Case 3:
Only one element: [1]. M = 1 is already the max. → 0 operations needed.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int max=0;
            int min=a[0];
            for(int i=0;i<n;i++)
            {
                if(a[i]<min)
                {
                    min=a[i];
                }
            }
            for(int i=0;i<n;i++)
            {
                if(a[i]>min)
                {
                    max++;
                }
            }
            
            System.out.println(max);
        }
    }
}