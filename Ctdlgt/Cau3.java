import java.util.Scanner;

public class Cau3 {
    public static int findFirst(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static int findLast(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] <= target){
                left = mid + 1;
            }else {
                right = mid -1;
            }
        }
        return right;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập số cần tìm vị trí: ");
        int target = scanner.nextInt();
        int first = findFirst(arr,target);
        int last = findLast(arr, target);

        if(first <= last && last < arr.length
                && arr[first] == target && arr[last] == target){
            System.out.println("[" + first + "," + last + "]");
        }else {
            System.out.println(-1);
        }
    }
}
