import java.util.Arrays;
import java.util.Scanner;

/*
Use when array is already sorted by it's value
*/
class binary_s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int head = 0;
        int tail = arr.length-1;
        int pc = 0;
        int target = sc.nextInt();

        while (head <= tail) {
            pc = (tail+head)/2;
            if (arr[pc] < target) head = pc+1;
            else if (arr[pc] > target) tail = pc-1;
            else break;
        }
        pc = (arr[pc]==target)?pc:-1;
        System.out.println("Index : "+pc);

        pc = Arrays.binarySearch(arr, target);
        System.out.println("Index : "+pc);
        sc.close();
    }
}