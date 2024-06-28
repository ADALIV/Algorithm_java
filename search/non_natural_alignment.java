import java.util.*;

class non_natural_alignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        data[] arr = new data[]{
            new data("0", 152, 0.2),
            new data("1", 154, 0.2),
            new data("2", 157, 0.5),
            new data("3", 168, 0.1),
            new data("4", 174, 0.3),
            new data("5", 177, 0.8),
            new data("6", 178, 1.2),
            new data("7", 180, 1.8),
            new data("8", 181, 1.6),
            new data("9", 188, 0.9),
        };
        int target = sc.nextInt();
        int index = Arrays.binarySearch(arr, new data("", target, 0.0), data.HEIGHT_ORDER);
        System.out.println("Index : "+index);
        sc.close();
    }
    public static class data {
        private String name;
        private int height;
        private double vision;
        public data(String name, int height, double vision) {
            this.name = name; this.height = height; this.vision = vision;
        }
        public void print() {
            System.out.println(name+" "+height+" "+vision);
        }
        public static final Comparator<data> HEIGHT_ORDER = new HeightOrderComparator();
        private static class HeightOrderComparator implements Comparator<data> {
            public int compare(data d1, data d2) {return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;}
        }
    }
}

/*
public interface Comparator<T> {
    int compare(T t1, T t2);
    boolean equals(Object obj);
}
*/