public class Test01 {
    public static void main(String[] args) {
        String str=" hello world ";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.trim().length());//可以去掉前后空格
        System.out.println(str.trim());
        System.out.println(str.replaceAll("\\s", ""));
    }
}
