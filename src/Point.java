public class Point {
    private double x;
    private double y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double getDistance(Point p1, Point p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public double getDistance(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}