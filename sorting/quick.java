package sorting;

public class quick {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 3, 2, 1, 0, 5, 6, 7, 8};

        quickSort(arr, 0, arr.length-1);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int[] arr, int left, int right) {
        int temp;
        int pl = left;
        int pr = right;
        int num = arr[(pl + pr)/2];

        do {
            while (arr[pl] < num) pl++;
            while (arr[pr] > num) pr--;
            if (pl <= pr) {
                temp = arr[pl];
                arr[pl] = arr[pr];
                arr[pr] = temp;
                pl++; pr--;
            }
        } while (pl <= pr);

        if (left < pr) quickSort(arr, left, pr);
        if (pl < right) quickSort(arr, pl, right);
    }
}
