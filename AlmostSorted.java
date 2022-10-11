//Find the Minimum length Unsorted Subarray, sorting which makes the complete array sorted
//Given an unsorted array arr[0..n-1] of size n, find the minimum length subarray arr[s..e] such that sorting this subarray makes the whole array sorted. 
//Examples: 
//
//If the input array is[10,12,20,30,25,40,32,31,35,50,60],
//your program should be able to find that the subarray lies between the indexes 3 and 8.
//If the input array is[0,1,15,25,6,7,30,40,50],
// your program should be able to find that the subarray lies between the indexes 2 and 5.

class AlmostSorted {
    public static void main(String[] args) {
        int arr[] = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };

        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (isUnOrder(arr, i)) {
                min = Math.min(arr[i], min);
                max = Math.max(arr[i], max);
            }
        }
        System.out.println(min + " " + max);
        if (min == Integer.MAX_VALUE) {
            System.out.println("-1 -1");
            return;
        }
        int index1 = 0, index2 = n - 1;
        while (min > arr[index1]) {
            index1++;
        }
        while (max < arr[index2]) {
            index2--;
        }
        System.out.println(index1 + " " + index2);
    }

    public static boolean isUnOrder(int[] arr, int index) {
        int x = arr[index];
        if (index == 0) {
            return x > arr[1];
        }
        if (index == arr.length - 1) {
            return x < arr[index - 2];
        }
        return x > arr[index + 1] || x < arr[index - 1];
    }
}