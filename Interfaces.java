public class Interfaces {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        obj.extra();
    }
}

interface A {

    void show();
    void config();
    void extra();
}

class B implements A {
    public void show() {
        System.out.println("show");
    }
    public void config() {
        System.out.println("config");
    }
    public void extra() {
        System.out.println("extra");
    }
}