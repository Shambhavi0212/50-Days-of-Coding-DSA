/*
Word with Maximum Number of Vowels(SPEC)
Problem
Submissions
Leaderboard
Discussions
Write a Java program to print the word from the string that contains the highest number of vowels.

Input Format

A single line string s.

Constraints

1 <= length of s <= 1000 Lowercase letters only

Output Format

Print the word with the most vowels

Sample Input 0

apple orange banana grape
Sample Output 0

orange
Sample Input 1

idea inspiration innovate
Sample Output 1

inspiration
Max Score: 30
Difficulty: Medium

*/import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String[] w = s.split(" ");
        
        int maxcount = 0;
        String max = "";
        
        for(int i=0;i<w.length;i++) {
            int v=0;
            for(int j=0;j<w[i].length();j++) {
                char ch = w[i].charAt(j);
                if(ch>='a'&&ch<='z') {
                    if(ch=='a'||ch =='e'||ch =='i'||ch == 'o'||ch=='u')
                    {
                        v++;
                    }
                }
            }
            
            if(v>maxcount|| (v==maxcount&&i==0)) 
            {
                maxcount = v;
                max = w[i];
            }
        }
        
        System.out.println(max);
    }
}
