package org.example;
// Dylan Mejia
// CSC 229 Lab 4
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      // Declaring variables for arguements in the methods
      // Variable for Question 1
      int n = 5;
      // Variables for Question 2
      int n1 = 1;
      int n2 = 14;
      // Variable for Question 3
      int search = 0;
      int array[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
      int start = 0;
      int end = array.length - 1;
      // Calling all of the Recursive methods
      Recursion(n);
      System.out.println(sum(n1,n2));
      System.out.println(binarySearch(array,8,start,end));
    }
    // Question 1
    public static void Recursion(int n){
        // Prints "Hello World" n times using Recursion
        if (n > 0) {
            System.out.println("Hello World!");
            Recursion(n - 1);
        }

    }
    // Question 2
    public static int sum (int n1, int n2) {
        // if value n1 is greater than n2 then the value is 0.
        if (n1 > n2){
            return 0;
        }
        // if the number is a multiple of 7 then it is added to the sum.
        // Return statements return all numbers between n1 and n2 that are multiples of 7
        if (n1 % 7 == 0) {
            return n1 + sum(n1 + 7, n2);
        }
        return sum(n1 + 1,n2);
    }
    // Question 3
    public static int binarySearch(int array [], int search, int start, int end){
        // Binary Search Algorithm
        if (start <= end) {
            int m = (start + end) / 2;
            if (search < array[m]){
                // Uses recursion to find the index of the value of search on the left side of the array
                return binarySearch(array, search, start, m - 1);

            }
            if (search > array[m]){
                // Uses recursion to find the index of the value of search on the right side of the array
                return binarySearch(array, search, m + 1 , end);
            }
            if (search == array[m]){
                // returns the middle value if search, the value you want to find is equal to the middle value of the array
                return m;
            }

        }
        // returns -1 if value is not in the array
        return -1;
    }

}


