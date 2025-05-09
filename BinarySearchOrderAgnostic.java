public class BinarySearchOrderAgnostic {


    public static void main(String[] args) { ///code checks whether array is ascending or not and acts accordingly

//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isASC = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isASC) {
                if (arr[mid] > target) {
                    end = mid - 1;

                } else start = mid + 1;


            } else if (arr[mid] < target) {
                end = mid - 1;

            } else start = mid + 1;
        }  return -1;
    }
}

