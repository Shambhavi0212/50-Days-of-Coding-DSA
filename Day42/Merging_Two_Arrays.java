/*
Merging 2 arrays

Merging two 1D arrays involves combining the elements of both arrays into a single array while maintaining their original order.

Here's a step-by-step process for merging two 1D arrays:

Create a New Array: Create a new array that is large enough to hold the combined elements of both arrays. The size of the new array should be the sum of the sizes of the two original arrays.
Copy Elements: Iterate through the elements of the first array and copy them to the new array. Then, iterate through the elements of the second array and copy them to the new array after the elements of the first array.
Result: The new array now contains all the elements from both original arrays, merged in the desired order.

Task
You are given a template code in the IDE.
Update the code to merge the 2 arrays based on the process defined above.
*/

class Codechef
{
	public static void main (String[] args) 
	{
		int firstArray[] = new int[100]; // First array
        firstArray[0] = 2;
        firstArray[1] = 4;
        firstArray[2] = 6;
        int size1 = 3;

        int secondArray[] = new int[100]; // Second array
        secondArray[0] = 8;
        secondArray[1] = 10;
        secondArray[2] = 12;
        secondArray[3] = 14;
        int size2 = 4;
        
        // Update the code below to solve the problem.







        // Print the merged array
        for (int i = 0; i < mergedSize; i++) {
            System.out.print(mergedArray[i] + " ");
        }

	}
}

//Solution :
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		int firstArray[] = new int[100]; // First array
        firstArray[0] = 2;
        firstArray[1] = 4;
        firstArray[2] = 6;
        int size1 = 3;

        int secondArray[] = new int[100]; // Second array
        secondArray[0] = 8;
        secondArray[1] = 10;
        secondArray[2] = 12;
        secondArray[3] = 14;
        int size2 = 4;
        
       int mergedsize=size1+size2;
       int mergedArray[]=new int[mergedsize];
       
       for(int i=0;i<size1;i++)
       {
           mergedArray[i]=firstArray[i];
       }
       for(int i=0;i<size2;i++)
       {
           mergedArray[size1+i]=secondArray[i];
       }
       for(int i=0;i<mergedsize;i++)
       {
           System.out.println(mergedArray[i]+" ");
	}
}
}