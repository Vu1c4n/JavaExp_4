public class Triangle extends Shape {
    private final double side1, side2, side3;
    private final String color;
    private final boolean filled;

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public double getArea() {
        // 使用海伦公式计算三角形面积
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public void displayInfo() {
        System.out.println("三角形面积: " + getArea());
        System.out.println("三角形周长: " + getPerimeter());
        System.out.println("三角形颜色: " + color);
        System.out.println("是否填充: " + (filled ? "是" : "否"));
    }
}
