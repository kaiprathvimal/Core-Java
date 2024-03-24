public class ObjectAndClass {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        DemoObject demo = new DemoObject();
        int result = demo.add(num1,num2);
        System.out.println(result);

    }
}
 class DemoObject {
    public int add(int n1,int n2) {
        int r = n1 + n2;
        return r;

    }

    
}
