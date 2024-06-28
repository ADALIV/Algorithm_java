import java.util.Arrays;
import java.util.Scanner;

class natural_alignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{"Apple", "Bear", "cat", "dog", "echo", "fish"};
        String target = sc.next();

        int index = Arrays.binarySearch(arr, target);
        System.out.println("Index : "+index);
        sc.close();
    }
}
