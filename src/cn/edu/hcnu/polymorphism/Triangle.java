package cn.edu.hcnu.polymorphism;

public class Triangle extends Shape {

    private float bottom;
    private float height;

    public Triangle(float bottom, float height) {
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public float calcArea() {
        System.out.println("计算三角形的面积");
        return (bottom*height)/2;
    }
}
