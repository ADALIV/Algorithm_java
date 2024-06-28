/*
Get three integer value, find middle value.
java .\mid_val.java
*/

import java.util.Scanner;

class mid_val {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mid = find_mid(a, b, c);
        System.out.println("Mid value : "+mid);
        sc.close();
    }
    public static int find_mid(int a, int b, int c) {
        int mid = 0;
        if (a>=b) {
            if (b>=c) mid = b;
            else if (c>=a) mid = a;
            else mid = c;
        } else {
            if (a>=c) mid = a;
            else if (c>=b) mid = b;
            else mid = c;
        }
        return mid;
    }
}