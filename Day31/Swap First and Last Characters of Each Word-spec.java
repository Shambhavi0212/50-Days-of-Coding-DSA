/*
Given a sentence (S), swap the first and last characters of each word while preserving the order of words in the sentence.
If a word has only one character, it remains unchanged.

Input Format

A single line containing a string (S), consisting of words separated by spaces.

Constraints

• (1 ≤ length of S ≤ 1000).
• S contains only lowercase and uppercase English letters and spaces.
• Words are separated by a single space, with no leading or trailing spaces.

Output Format

Print the modified sentence after swapping the first and last characters of each word.

Sample Input 0

hello world

Sample Output 0

oellh dorlw

Sample Input 1

programming is fun

Sample Output 1

grogramminp si nuf
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String w[]=s.split(" ");
       
        for(int i=0;i<w.length;i++)
        {
        
            if(w[i].length()>1)
            {
                char arr[]=w[i].toCharArray();
                char temp=arr[0];
                arr[0]=arr[arr.length-1];
                arr[arr.length-1]=temp;
                w[i]=new String(arr);    
            }
        }
        System.out.println(String.join(" ",w));

        
    }
}