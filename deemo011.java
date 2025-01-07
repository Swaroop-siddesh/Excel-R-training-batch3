class Parent {
    String a = "hello";
    String b = "Hi";
}

class Child extends Parent {
    String c = super.a;
    String d = super.b;}

public class deemo011 {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);}}