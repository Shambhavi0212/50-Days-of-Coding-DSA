/*
You are given two strings s1 and s2. Determine whether s2 is a rotation of s1. 
👉 A string s2 is a rotation of s1 if you can shift characters in s1 from front to end (or vice versa) and get s2. 
For example, "deabc" is a rotation of "abcde".

Input Format

The first line contains the first string s1. 
The second line contains the second string s2

Constraints

1 ≤ |s1|, |s2| ≤ 10^5 
Both strings contain only lowercase English letters (a–z).

Output Format

Print "True" if s2 is a rotation of s1, otherwise print "False".

Sample Input 0

abcde
deabc

Sample Output 0

True

Sample Input 1

rotation
tationro

Sample Output 1

True
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine().toLowerCase();
        String s2=sc.nextLine().toLowerCase();
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2)? "True":"False");
    }
}