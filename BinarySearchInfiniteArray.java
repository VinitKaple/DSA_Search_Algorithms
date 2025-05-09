public class BinarySearchInfiniteArray {
    public static void main(String[] args) {

        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 33, 45, 89};
        int ans = FindZone(arr, 18);
        System.out.println(ans);
    }

    static int FindZone(int[] arr, int target) {
        int star = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - star + 1) * 2;
            star = temp;
        }
        return BinarySearch(arr, target, star, end);
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
