public class Annotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.showMethod();
    }
}

class A {
    public void showMethod() {
        System.out.println("hi");
    }
}
class B extends A {
    @Override
    public void showMethod() {
        System.out.println("hello");
    }
}