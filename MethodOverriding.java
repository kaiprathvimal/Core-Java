public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        int result = obj.add(2, 9);
        System.out.println(result);
    }
    
}

class A {
    public int add(int n1,int n2) {
    return n1 + n2;
    }
}
class B extends A {
    public int add(int n1, int n2) {
        return n1 + (n2+1);
    }
}