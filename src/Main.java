import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        testShape();
        testTriangle();
        testComparableCircle();
        testSquare();
        testGraduate();
    }
    public static void testShape(){
        // 创建一个矩形对象
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("矩形的面积为: " + rectangle.getArea());

        // 创建一个圆对象
        Circle circle = new Circle(7);
        System.out.println("圆的面积为: " + circle.getArea());
    }
    public static void testTriangle(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入三角形的三条边长：");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        System.out.println("请输入三角形的颜色：");
        String color = scanner.next();

        System.out.println("是否填充三角形（true/false）：");
        boolean filled = scanner.nextBoolean();

        scanner.close();

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);
        triangle.displayInfo();
    }
    public static void testComparableCircle(){
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(7);

        int result = circle1.compareTo(circle2);
        if (result > 0) {
            System.out.println("Circle1 的面积大于 Circle2");
        } else if (result < 0) {
            System.out.println("Circle1 的面积小于 Circle2");
        } else {
            System.out.println("Circle1 的面积等于 Circle2");
        }
    }
    public static void testSquare(){
        Shape s1 = new Triangle(1,2,3,"red",true);
        Shape s2 = new Rectangle(1,2);
        Shape s3 = new Circle(2);
        Shape s4 = new ComparableCircle(1);
        Shape s5 = new Square(4);
        Shape[] shapes = {s1,s2,s3,s4,s5};
        // 假设数组中包含不同类型的 Shape 对象，其中某些是 Square

        // 循环遍历数组中的每个对象，如果对象是 Colorable 的实例，则调用 howToColor 方法
        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
    public static void testGraduate(){
        // 创建一个名为 "zhangsan" 的研究生对象
        Graduate zhangsan = new Graduate("zhangsan", "male", 25, 5000, 30000);

        // 计算年收入和学费
        double annualIncome = zhangsan.getPay() * 12; // 年收入 = 月工资 * 12
        double annualFee = zhangsan.getFee(); // 年学费 = 每学期学费

        // 计算收入减去学费
        double difference = annualIncome - annualFee;

        // 判断差额是否小于2000，并输出相应信息
        if (difference < 2000) {
            System.out.println("You need a loan!"); // 需要贷款
        } else {
            System.out.println("Your income is enough!"); // 收入足够
        }
    }
}
