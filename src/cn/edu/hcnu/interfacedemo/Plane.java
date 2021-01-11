package cn.edu.hcnu.interfacedemo;

public class Plane implements Fly ,Fuchong{
    @Override
    public void fly() {
        System.out.println("燃烧煤油，向前推进产生浮力实现飞行");
    }
}
