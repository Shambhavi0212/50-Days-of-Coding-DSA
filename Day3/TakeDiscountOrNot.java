/*
🛍️ Problem: Take Discount or Not

There are N items in a shop. You know that the price of the i-th item is A[i].
Chef wants to buy all the N items.

There is also a discount coupon that costs X rupees and reduces the cost of every item by Y rupees.
If the price of an item was initially ≤ Y, it becomes free, i.e., costs 0.

Determine whether Chef should buy the discount coupon or not.
Chef will buy the discount coupon if and only if the total price he pays after buying the discount coupon
is strictly less than the price he pays without buying the discount coupon.

--------------------------------------------------------------
Input Format

- The first line of input will contain a single integer T, denoting the number of test cases.
- The description of the test cases follows.
Each test case consists of two lines of input:
  • The first line contains three space-separated integers — N, X, and Y.
  • The second line contains N space-separated integers — A1, A2, …, AN.

--------------------------------------------------------------
Output Format

For each test case, output COUPON if Chef should buy the discount coupon,
and NO COUPON otherwise.

Each letter of the output may be printed in either lowercase or uppercase.
For example, the strings coupon, CouPoN, and COUPON will all be treated as equivalent.

--------------------------------------------------------------
Constraints

1 ≤ T ≤ 1000
1 ≤ N ≤ 100
1 ≤ X, Y ≤ 10^5
1 ≤ Ai ≤ 10^5

--------------------------------------------------------------
Sample Input

5
4 30 10
15 8 22 6
4 40 10
15 8 22 6
4 34 10
15 8 22 6
2 10 100
60 80
3 30 5
50 60 50

--------------------------------------------------------------
Sample Output

COUPON
NO COUPON
NO COUPON
COUPON
NO COUPON

--------------------------------------------------------------
Explanation:

Test Case 1:
Original cost: 15 + 8 + 22 + 6 = 51
With coupon: (15-10) + 0 + (22-10) + 0 = 5 + 0 + 12 + 0 = 17, plus coupon cost 30 → Total = 47 < 51
=> COUPON

Test Case 2:
Original cost = 51
With coupon: 17 + coupon 40 = 57 > 51
=> NO COUPON

Test Case 3:
Original cost = 51
With coupon: 17 + coupon 34 = 51 → not strictly less
=> NO COUPON

Test Case 4:
Original cost = 140
With coupon: all become free (0), plus 10 coupon → Total = 10 < 140
=> COUPON

Test Case 5:
Original cost = 160
With coupon: (50-5) + (60-5) + (50-5) = 45 + 55 + 45 = 145 + 30 coupon = 175 > 160
=> NO COUPON
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long totalprice=0;
            long withcoupon;
            int n = scanner.nextInt();
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            //Total Price
            for (int i = 0; i < n; i++)
            {
               totalprice=totalprice+a[i]; 
            }
            long d;
            long sum=0;
            //Coupon
            for (int i = 0; i < n; i++)
            {
                d=a[i]-y;
                if(d<0)
                {
                    d=0;
                }
                sum=sum+d;
            }
             withcoupon=sum+x;
             if(totalprice>withcoupon)
        {
            System.out.println("COUPON");
            
        }
        else{
            System.out.println("NO COUPON");
        }
      
    }}
}
