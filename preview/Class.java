class Class {
    public static void main(String[] args) {
        a A = new a();
        b B = new b();
        A.get_num();
        B.set_num(1, 2);
        B.get_num();
    }
}

class a {
    protected int number_a;
    public a() {
        number_a = 0;
    }

    void get_num() {
        System.out.println("a : "+number_a);
    }
    void set_num(int num) {
        number_a = num;
    }
}

class b extends a {
    protected int number_b;
    public b() {
        number_b = 0;
    }

    void get_num() { // overriding
        System.out.println("a : "+number_a);
        System.out.println("b : "+number_b);
    }
    void set_num(int num) {
        number_b = num;
    }
    void set_num(int a, int b) { // overloading
        number_a = a;
        number_b = b;
    }
}