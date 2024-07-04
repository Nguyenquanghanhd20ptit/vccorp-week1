import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cau1 {
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr1) {
            if (binarySearch(arr2, num)) {
                result.add(num);
            }
        }

        return result;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
             }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng của mảng A:");
        int n = scanner.nextInt();
        System.out.println("Nhập n phần tử của mảng A");
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Nhập số lượng của mảng B:");
        int m = scanner.nextInt();
        System.out.println(" Nhập m phần tử của mảng B");
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = scanner.nextInt();
        }
        List<Integer> result = findIntersection(arr1,arr2);
        for (int x : result){
            System.out.println(x + " ");
        }
    }

}
