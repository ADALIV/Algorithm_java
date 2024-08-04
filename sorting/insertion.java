package sorting;

public class insertion {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 3, 2, 1, 0, 5, 6, 7, 8};

        for (int i=1; i<arr.length; i++) {
            int j = i-1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
