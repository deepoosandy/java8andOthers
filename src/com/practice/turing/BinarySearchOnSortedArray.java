package com.practice.turing;

public class BinarySearchOnSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        System.out.println(targetSearch(arr, 78));
        System.out.println(targetSearchRecursive(arr, 78));
    }

    public static int search(int startIndex, int endIndex, int target, int[] arr) {
        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //O(n) and space O(n)
    public static int targetSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int mid = arr.length / 2;
        if (arr[mid] == target) return mid;
        if (target < arr[mid]) {
            return search(start, mid, target, arr);
        } else {
            return search(mid + 1, end, target, arr);
        }


    }

    public static int searchRecursive(int startIndex, int endIndex, int target, int[] arr) {


        if (startIndex > endIndex) return -1;

        int mid = (startIndex + endIndex) / 2;

        if (arr[mid] == target) return mid;
        
        else if (arr[mid] > target) {
            return searchRecursive(startIndex, mid - 1, target, arr);
        } else if (arr[mid] < target) {
            return searchRecursive(mid + 1, endIndex, target, arr);
        }
        return -1;
    }

    public static int targetSearchRecursive(int[] arr, int target) {
        return searchRecursive(0, arr.length - 1, target, arr);
    }

}
