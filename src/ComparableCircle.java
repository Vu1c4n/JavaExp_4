class ComparableCircle extends Circle implements Comparable<Circle> {
    private double radius;
    public ComparableCircle(double radius) {
        super(radius);
    }
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(Circle otherCircle) {
        double diff = this.getArea() - otherCircle.getArea();
        if (diff > 0) {
            return 1; // 当前圆面积大于另一个圆
        } else if (diff < 0) {
            return -1; // 当前圆面积小于另一个圆
        } else {
            return 0; // 面积相等
        }
    }
}
