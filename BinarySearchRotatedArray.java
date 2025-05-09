public class BinarySearchRotatedArray {

    public static void main(String[] args) {
        int[] arr = {12, 17, 18, 29, 8, 9, 10, 11};
        System.out.println(RBS(arr,29)); // code for finding 29 as target in rotated array 
    }

    static int RBS(int[] arr, int tar) { //Rotated Binary Search 

        int peak = FindingPeak(arr); ///firstly finfing peak
        if (peak == -1) {
            return peak;
        }
        if (arr[peak] == tar){
            return peak;
        }

        int ans = BinarySearch(arr, tar, 0, peak-1);
        if (ans != -1) {
            return ans;
        } else return BinarySearch(arr, tar, peak + 1, arr.length-1);

    }

    static int FindingPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    static int BinarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;

            } else if (arr[mid] < target) {
                start = mid + 1;
            } else return mid;
        }
        return -1;
    }


}
