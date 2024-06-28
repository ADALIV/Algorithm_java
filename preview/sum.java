import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum_1 = 0;
        int sum_2 = 0;

        for (int i=a; i<=b; i++) {
            sum_1 += i;
        }
        System.out.println("Sum : "+sum_1);

        if ((b-a)%2 == 0) {
            sum_2 += (b+a)*((b-a)/2+0.5);
        } else {
            sum_2 += (b+a)*(b-a+1)/2;
        }
        System.out.println("sum : "+sum_2);
        sc.close();
    }
}
