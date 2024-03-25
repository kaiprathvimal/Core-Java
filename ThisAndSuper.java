public class ThisAndSuper {
    public static void main(String[] args) {
        B obj = new B(5);

    }
    
}


 class  A {

    public A() {
        System.out.println("Int A");
    }
    public A(int n) {
        System.out.println("int n");
    }
}

 class B extends A {

    public B() {
        super(5);
        System.out.println("Int B");
    }
    public B(int n) {
        this();
        System.out.println("Int n");
    }
}