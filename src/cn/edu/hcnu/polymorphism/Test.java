package cn.edu.hcnu.polymorphism;

public class Test {
    public static void main(String[] args) {
        /*Square square=new Square(5);
        System.out.println(square.calcArea());

        Triangle triangle=new Triangle(5,6);
        System.out.println(triangle.calcArea());*/

        Shape shape = new Square(5);//new Square(5);//正方形是一个形状：向上转型(up-casting)，父类的引用指向子类的对象
        shape.calcArea();

        /*
        开闭原则
        OCP原则：对扩展开放、对修改闭合，将来需求发生变化，尽可能不修改原有的代码，通过增加新的内容来实现新的功能
         */
    }
}
