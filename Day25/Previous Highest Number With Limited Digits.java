/*
Previous Highest Number With Limited Digits (spec)

Problem:
Given a number N and a digit count D, your task is to find the largest number less than N that can be formed using at most D digits from N. The digits must be taken from the original number and rearranged without repeating positions, and the result must always be less than the original number N.

Input Format:
The first line contains an integer or string N, the original number.
The second line contains an integer or string D, the number of digits to use (1 ≤ D ≤ number of digits in N).

Constraints:
1 ≤ N ≤ 10⁹
1 ≤ D ≤ number of digits in N
No leading zeros in the output.
Output must be strictly less than N.

Output Format:
Print the highest possible number that is less than N and formed using exactly D digits from N.

Sample Input 0:
1235
3

Sample Output 0:
1229

Sample Input 1:
1235
2

Sample Output 1:
1199

Sample Input 2:
1235
1

Sample Output 2:
999
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output t STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine(); //1235
        String s2=sc.nextLine(); //3
        for(int i=Integer.parseInt(s1)-1;i>=0;i--)
        {
            if(String.valueOf(i).contains(s2))
            {
                
            }
            else
            {
                System.out.print(i);
                break;//1229
            }
        }
        
        
    }
}