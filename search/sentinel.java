import java.util.Scanner;

/*
Using for loop, we can judge whether end of index
*/
class sentinel {
    public static void main(String[] args) {
        int[] arr_1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr_2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1};

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int i = 0, count = 0;

        while (true) {
            count++;
            if (i == arr_1.length) {
                i = -1;
                break;
            }
            count++;
            if (target == arr_1[i]) break;
            i++;
        }
        System.out.println("Index : "+i+", count : "+count);
        i = 0; count = 0;

        arr_2[arr_2.length-1] = target;
        while (true) {
            count++;
            if (target == arr_2[i]) break;
            i++;
        }
        count++;
        i = (i==arr_2.length-1)?-1:i;
        System.out.println("Index : "+i+", count : "+count);

        sc.close();
    }
}