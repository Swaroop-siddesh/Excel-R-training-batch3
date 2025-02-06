package Core_Java;

import java.util.*;

class parent{
    String a = "Parent class variable";
    String m1(){
        return "Parent class method";
    }
}
class child extends parent{
    String b = "child class variable";
    String c=super.m1();
}

class Demo011{
    public static void main(String[] args) {
        child obj = new child();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }
}
