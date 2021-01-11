public class Example {
    String str = new String("good");
    int    a   =3;
    //str是什么？str这个对象，其实str并不是对象，指向对象的一个引用
    char ch[] = {'a', 'b', 'c'};
    //学生类具备拿快递的行为，xxx你去楼下帮老师拿快递
    public static void main(String[] args) {
        Example example = new Example();
        example.change(example.str, example.ch);
        System.out.println(example.str + " and " + example.ch[0]);
    }

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }
}
