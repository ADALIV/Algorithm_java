class GCD {
    public static void main(String[] args) {
        int a = 231;
        int b = 121;

        System.out.println("GCD : " + gcd(a, b));
    }
    static int gcd(int a, int b) {
        if (a == b) return a;
        else if (a > b) return gcd(a-b, b);
        else if (a < b) return gcd(a, b-a);
        return b;
    }
}
