package org.example;

public class Sequence {
    public static int[] reverse(int n){// нужно перевернуть массив
        int[] arr =new int[n];
        for(int i = 0; i < n;i++){
           arr[i] = n-i;
        }

        return arr;
    }
}


// к нам приходит  1,2,3,4,5  и нам нужно перевернуть массив 5, 4, 3, 2, 1