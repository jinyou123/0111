package cn.edu.hcnu.polymorphism;

public class Square extends Shape{

    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float calcArea() {
        System.out.println("计算正方形的面积");
        return side*side;
    }
}
