
public class Square extends Shape implements Colorable {
    private final double edge;
    Square(int e){
        this.edge = e;
    }
    // 实现 Square 特有的属性和方法
    @Override
    public double getArea(){
        return edge*edge;
    }
    @Override
    public void howToColor() {
        System.out.println("给所有的四条边着色");
    }
}