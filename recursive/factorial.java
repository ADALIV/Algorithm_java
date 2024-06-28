public class factorial {
    public static void main(String[] args) {
        int result = fact(5);
        System.out.println("Result : "+result);
    }
    static int fact(int num) {
        if (num == 1) return 1;
        else return fact(num-1)*num;
    }
}
