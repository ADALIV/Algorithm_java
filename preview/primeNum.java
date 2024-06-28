import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/*
Non-prime number is composed by prime numbers
*/
class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        System.out.println(arr.get(0));

        for (int i=3; i<=n; i+=2) {
            Iterator<Integer> it = arr.iterator();
            while (it.hasNext()) {
                if ((i%it.next()) == 0) break;
            }
            if (!it.hasNext()) {
                arr.add(i);
                System.out.println(i);
            }
        }
        sc.close();
    }
}