public class hanoi {
    public static int move = 0;
    public static void main(String[] args) {
        int n = 3;
        tower(n, 'a', 'b', 'c');
        System.out.println("move : "+move);
    }
    static void tower(int n, char T_1, char T_2, char T_3) {
        if (n==1) {
            System.out.println(n + "`ring" + ", " + T_1 + " --> " + T_3);
            move++;
        } else if (n < 1) {
            return;
        } else {
            tower(n-1, T_1, T_3, T_2);
            System.out.println(n + "`ring" + ", " + T_1 + " --> " + T_3);
            move++;
            tower(n-1, T_2, T_1, T_3);
        }
    }
}

// 출발, 경유, 도착