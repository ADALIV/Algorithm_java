package sorting;

public class selection {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 3, 2, 1, 0, 5, 6, 7, 8};
        int min;
        int temp;

        for (int i=0; i<arr.length-1; i++) {
            min = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
