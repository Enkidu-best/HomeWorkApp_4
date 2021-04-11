public class User {
    public static void main(String[] args) {
        Point p1 = new Point(4, 4);
        Point p2 = new Point(5, 7);
//        double result = p1.getDistance(p2);
        double result = Point.getDistance(p1, p2);
        System.out.println(result); // 3.1622776601683795
    }
}