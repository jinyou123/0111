package cn.edu.hcnu.example;

public class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println(getName()+"在汪汪汪......");
    }
}
