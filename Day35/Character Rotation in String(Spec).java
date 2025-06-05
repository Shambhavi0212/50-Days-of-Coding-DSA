/*
Character Rotation in String(Spec)
Problem
Submissions
Leaderboard
Discussions
You are given a string and an integer k. Your task is to rotate each character in the string k positions forward in the English alphabet.
• If the rotation goes past 'z', wrap around to the start of the alphabet.
• The string contains only lowercase English letters.
For example, if the string is abc and k=1, then the result is bcd.

Input Format

• The first line contains a string s (only lowercase English letters).
• The second line contains an integer k representing the number of rotations.

Constraints

• 1 <= |s| <= 1000
• 0 <= k <= 1000
• The input string s contains only lowercase English letters (a-z).

Output Format

• Print the final rotated string.

Sample Input 0

middleoutz
2

Sample Output 0

okffngqwvb

Sample Input 1

helloworld
5

Sample Output 1

mjqqtbtwqi
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int k = sc.nextInt();
        String result = "";
        
        for (int i = 0;i<s.length();i++) 
        {
            char ch=s.charAt(i);
            char sh=(char)('a'+(ch-'a'+k) % 26);
            result= result+sh;
        }
        System.out.println(result);
    }
}