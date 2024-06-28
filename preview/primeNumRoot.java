import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
Using root, we don't have to calculate all
2*50=100
4*25=100...
25*4=100
50*2=100
*/
public class primeNumRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        System.out.println(arr.get(0));

        for (int i=3; i<=n; i+=2) {
            Iterator<Integer> it = arr.iterator();
            while (it.hasNext()) {
                int root = it.next();
                if (i>=root*root && (i%(root*root) == 0)) break;
            }
            if (!it.hasNext()) {
                arr.add(i);
                System.out.println(i);
            }
        }
        sc.close();
    }
}
