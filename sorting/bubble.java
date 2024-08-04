package sorting;

class bubble {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 3, 2, 1, 0, 5, 6, 7, 8};
        int temp;

        for (int i=0; i<arr.length-1; i++) {
            for (int j=arr.length-1; j>i; j--) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
