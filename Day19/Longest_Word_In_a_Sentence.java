/*
Problem: Longest Word in a Sentence

Given a sentence as input, write a Java program to find and return the word with the maximum length. 
If there are multiple words with the same maximum length, return the first one among them.

Words in the sentence are separated by a single space, and there will be no punctuation marks.

Input Format:
A single line string S containing only alphabets and spaces.

Constraints:
1 ≤ S.length() ≤ 1000
The string will contain at least one word.
No punctuation or special characters.
Words are separated by a single space.

Output Format:
Print the longest word present in the input string.

Sample Input 0:
Hai iam Adam from Hyderabad

Sample Output 0:
Hyderabad

Sample Input 1:
hope all are doing well

Sample Output 1:
doing
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String w[]=s.split(" ");
        String max="";
        for(int i=0;i<w.length;i++)
        {
            if(w[i].length()>max.length())
            {
                max=w[i];
            }
        }
        System.out.print(max);
    }
}